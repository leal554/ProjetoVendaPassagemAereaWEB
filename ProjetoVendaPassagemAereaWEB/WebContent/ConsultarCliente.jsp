<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consultar Cliente</title>

<jsp:include page="/layout.jsp" />

</head>
<body>
<form class="form-horizontal" role="form" method="post" action="ConsultarCliente.do">
 <div class="container">
		<div class="jumbotron">
		<h1>Consultar Cliente</h1>
			<p>
			<label>Nome do Cliente<input type="text" class="form-control" id="numeroAeronave" name="numeroAeronave" /></label>
			</p>
			<p>
			<label>Id do Cliente<input type="text" class="form-control" id="numeroAeronave" name="numeroAeronave" /></label>
			</p>
			<p>
			<input id="submit" name="submit" type="submit" value="Consultar" class="btn btn-default">
			<a class="btn btn-default" href="./MenuPassagem.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
	</form>
</body>
</html>