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
 <div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<label>Nome do Cliente<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Id do Cliente<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<a class="btn btn-lg btn-primary" href="./ResultadoConsultarCliente.jsp" role="button">Consultar</a>
			<a class="btn btn-lg btn-primary" href="./MenuPassagem.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
</body>
</html>