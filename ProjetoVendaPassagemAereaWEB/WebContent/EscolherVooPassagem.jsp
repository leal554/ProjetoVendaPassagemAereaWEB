<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Escolher Voo Passagem</title>

<jsp:include page="/layout.jsp" /><jsp:include page="/layout.jsp" />

</head>
<body>
	<div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<label>Escolher Destino<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Escolher Voo<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Voo Para combobox<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Voo Partida<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>SP/GRU ARRUMAR<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Data da Partida<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Data da Chegada<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Hora da Partida<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Hora da Chegada<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<a class="btn btn-lg btn-primary" href="./ComprarPassagem.jsp" role="button">Cadastrar Voo</a>
			<a class="btn btn-lg btn-primary" href="./LoginComprarPassagem.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
</body>
</html>