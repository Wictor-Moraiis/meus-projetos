<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Funcionario</title>
    <link rel="stylesheet" href="meu.css">
    <style>

.foto{
    width: 20vh;
    height: 20vh;
    
}
</style>
</head>
<body>

<?php

include 'conn.php';

$dados = $conn->query("SELECT * FROM funcionario");

if ($dados->num_rows > 0) {
    echo "<table border='1'class='table'><tr><th>CPF</th><th>Nome</th><th>Email</th><th>Data de Nascimento</th><th>Foto</th><th>Setor</th><th>Turno</th></tr>";
    while($linha = $dados->fetch_assoc()) {
        $foto=$linha['foto'];
        echo "<tr>
                <td>" . $linha["cpf"]. "</td>
                <td>" . $linha["nome"]. "</td>
                <td>" . $linha["email"]. "</td>
                <td>" . $linha["dtnasc"]. "</td>
                <td> <img src='$foto' class='foto'></td>
                <td>" . $linha["setor"]. "</td>
                <td>" . $linha["turno"]. "</td>
                <td><a href='deletar.php?cpf={$linha['cpf']}'>delete</a></td>
                <td><a href=''>alterar</a></td>
            </tr>";
    }
    echo "</table>";
} else {
    echo "0 resultados";
}

$conn->close();
?>
</body>
</html>