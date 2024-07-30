<?php
include 'conn.php';

$cpf = $_GET['cpf'];

$cpfExcluir = $conn->query("SELECT * FROM funcionario WHERE '$cpf' = cpf");

while ($linha = mysqli_fetch_array($cpfExcluir)) {
    $foto= $linha['foto'];
}

unlink("$foto");

mysqli_query($conn, "DELETE FROM funcionario WHERE cpf='$cpf'");

echo "Dados apagados eternamente";

header("refresh:3;url=form.html");