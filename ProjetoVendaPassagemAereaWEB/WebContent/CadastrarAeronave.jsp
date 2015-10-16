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
<form class="form-horizontal" role="form" method="post" action="CadastrarAeronave.do">
    <div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<h2><label>Cadastrar Aeronave</label></h2>
			<p>
			<label>Numero da Aeronave<input type="text" class="form-control" id="numeroAeronave" name="numeroAeronave" /></label>
			</p>
			<p>
			<label>numero de Acentos<input type="text" class="form-control" id="numeroAcentos" name="numeroAcentos" /></label>
			</p>
			<p>
			<input id="submit" name="submit" type="submit" value="Cadastrar Aeronave" class="btn btn-default">
			<a class="btn btn-default" href="./Menu.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
		</form>
</body>
</html>