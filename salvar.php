<?php
include "conn.php";
$cpf = $_POST['cpf'];
$nome = $_POST['nome'];
$email = $_POST['email'];
$foto = $_FILES['foto']['name'];
$dtnasc = $_POST['dtnasc'];
$turno = $_POST['turno'];
$setor = $_POST['setor'];
$dir = "img/";
$ext = strtolower(pathinfo($foto, PATHINFO_EXTENSION));
$fotof = $cpf.".".$ext;
$fotob = $dir . $fotof;
$uploadfile = $dir . $fotof;
if (move_uploaded_file($_FILES['foto']['tmp_name'], $dir . $fotof)) {
$uploadfile = $dir .'/'. $fotof;
} else {
echo "Não foi possível concluir o upload da imagem.";
}

$testar_cpf = $conn->query("SELECT * FROM funcionario WHERE $cpf = cpf");
$testar_email = $conn->query("SELECT * FROM funcionario WHERE '$email' = email");
$check_cpf = mysqli_num_rows($testar_cpf);
$check_email = mysqli_num_rows($testar_email);

if ($check_cpf == 1 AND $check_email == 1){
    echo "deu ruim no email e cpf";    
}else if ($check_cpf == 1){
    echo "deu ruim no cpf";
}else if ($check_email == 1){
    echo "deu ruim no email";
}else{
    $conn->query("INSERT INTO funcionario(id, cpf, nome, email, foto, dtnasc, turno, setor)
VALUES(NULL, '$cpf', '$nome', '$email', '$fotob', '$dtnasc', '$turno', '$setor')");

    echo "deu certo";
}


