<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Transferir Passagem</title>

<jsp:include page="/layout.jsp" />

</head>
<body>
	<div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<label>Id do Beneficiario<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Id da Passagem<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<a class="btn btn-lg btn-primary" href="./MenuPassagem.jsp" role="button">Transferir</a>
			<a class="btn btn-lg btn-primary" href="./LoginTransferencia.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
</body>
</html>