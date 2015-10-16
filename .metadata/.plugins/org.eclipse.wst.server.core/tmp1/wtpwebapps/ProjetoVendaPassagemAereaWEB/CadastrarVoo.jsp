<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Voo</title>

<jsp:include page="/layout.jsp" />


</head>
<body>
<form class="form-horizontal" role="form" method="post" action="CadastrarVoo.do">
		<div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<h2><label>Cadastrar voo</label></h2>
			</p>
			<p>
			<label>numero do voo<input type="text" class="form-control" id="numeroVoo" name="Name" /></label>
			</p>
			<p>
			<label>numero da aeronave<input type="text" class="form-control" id="numeroAeronave" name="numeroAeronave" /></label>
			</p>
			<p>
			<label>tripulação<input type="text" class="form-control" id="tripulacao" name="tripulacao" /></label>
			</p>
			<p>
			<label>horarios<input type="text" class="form-control" id="horarios" name="horarios" /></label>
			</p>
			<p>
			<label>saida<input type="text" class="form-control" id="saida" name="saida" /></label>
			</p>
			<p>
			<label>chegada<input type="text" class="form-control" id="chegada" name="chegada" /></label>
			</p>
			<p>
			<label>dia<input type="text" class="form-control" id="dia" name="dia" /></label>
			</p>
			<p>
			<label>destino<input type="text" class="form-control" id="destino" name="destino" /></label>
			</p>
			<p>
			<label>ComboAeronave<input type="text" class="form-control" id="comboAeronave" name="comboAeronave" /></label>
			</p>
			<p>
			<label>ComboDestino<input type="text" class="form-control" id="comboDestino" name=""comboDestino"" /></label>
			</p>
			<p>
			<input id="submit" name="submit" type="submit" value="Cadastrar Voo" class="btn btn-default">
			<a class="btn btn-default" href="./Menu.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
		</form>
</body>
</html>