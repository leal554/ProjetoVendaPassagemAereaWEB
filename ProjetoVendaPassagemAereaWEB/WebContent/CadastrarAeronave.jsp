<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar de Aeronave </title>

<jsp:include page="/layout.jsp" />

</head>
<body>
    <div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<label>Cadastrar Aeronave<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Numero da Aeronave<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>numero de Acentos<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<a class="btn btn-lg btn-primary" href="./Menu.jsp" role="button">Cadastrar Aeronave</a>
			<a class="btn btn-lg btn-primary" href="./Menu.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
</body>
</html>