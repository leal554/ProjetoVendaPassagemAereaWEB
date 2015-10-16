<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Escolher Voo Passagem</title>

 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css" />
 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-theme.min.css" />
 <script src=".bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
		<div>
			<label>Escolher Destino<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Escolher Voo<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Voo Para combobox<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Voo Partida<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>SP/GRU ARRUMAR<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Data da Partida<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Data da Chegada<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Hora da Partida<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Hora da Chegada<input type="text" id="User" name="Name" /></label>
		</div>
		
      	<div>
			<button onclick="window.location.href='./ComprarPassagem.jsp'">Cadastrar Voo</button>
			<button onclick="window.location.href='./LoginComprarPassagem.jsp'">Voltar</button>
		</div>
</body>
</html>