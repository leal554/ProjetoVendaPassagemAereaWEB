<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Cliente</title>

 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css" />
 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-theme.min.css" />
 <script src=".bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
		<div>
			<label>Cadastrar Cliente<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Nome<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>RG<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>CPF<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Endere�o<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>CEP<input type="text" id="User" name="Name" /></label>
		</div>

		<div>
			<label>Como gostaria de ser chamado</label>
			<label for="Sr">Sr.</label>
  			<input type="radio" name="op" id="Sr" value="sim">
  			<label for="Sra">Sra.</label>
  			<input type="radio" name="op" id="Sra" value="nao">
			<label for="Srta">Srta.</label>
  			<input type="radio" name="op" id="Srta" value="sim">
		</div>
		<div>
			<label>Estado Civil<input type="text" id="User" name="Name" /></label>
		</div>
		combo
		<div>
			<label>Emprego<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Email<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Confirmar Email<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Senha<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Confirmar Senha<input type="text" id="User" name="Name" /></label>
		</div>
		
		<div>
			<button onclick="window.location.href='./MenuPassagem.jsp'">Cadastrar</button>
			<button onclick="window.location.href='./MenuPassagem.jsp'">Voltar</button>
		</div>
</body>
</html>