<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Funcionario</title>
    <link rel="stylesheet" href="meu.css">
    <style>


</style>
</head>
<body>

<?php

include 'conn.php';

$dados = $conn->query("SELECT * FROM tasks");

if ($dados->num_rows > 0) {
    echo "<table border='1'class='table'><tr><th>ID</th><th>Titulo</th><th>Descrição</th><th>Data e hora</tr>";
    while($linha = $dados->fetch_assoc()) {
        echo "<tr>
                <td>" . $linha["id"]. "</td>
                <td>" . $linha["title"]. "</td>
                <td>" . $linha["description"]. "</td>
                <td>" . $linha["execution_time"]. "</td>
                <td><a href='deletar.php?id={$linha['id']}'>delete</a></td>
                <td><a href=''>alterar</a></td>
            </tr>";
            
    }
    echo "</table>";
    echo "<a href='form.html'>cadastre aqui uma nova tarefa</a>";
} else {
    echo "0 tarefas cadastradas <br> <a href='form.html'>cadastre aqui</a>";
    

}

$conn->close();
?>
</body>
</html>