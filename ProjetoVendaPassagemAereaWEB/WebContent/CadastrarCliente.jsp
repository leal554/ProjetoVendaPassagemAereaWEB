<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Cliente</title>
<jsp:include page="/layout.jsp" />

</head>
<body>
	<div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<label>Cadastrar Cliente<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Nome<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>RG<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>CPF<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Endere�o<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>CEP<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Como gostaria de ser chamado</label>
			<label for="Sr">Sr.</label>
  			<input type="radio" name="op" id="Sr" value="sim">
  			<label for="Sra">Sra.</label>
  			<input type="radio" name="op" id="Sra" value="nao">
			<label for="Srta">Srta.</label>
  			<input type="radio" name="op" id="Srta" value="sim">
			</p>
			<p>
			<label>Estado Civil   combo</label>
			</p>
			<p>
			<label>Emprego<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Email<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Confirmar Email<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Senha<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Confirmar Senha<input type="text" id="User" name="Name" /></label>
			</p>
			<a class="btn btn-lg btn-primary" href="./MenuPassagem.jsp" role="button">Cadastrar</a>
			<a class="btn btn-lg btn-primary" href="./MenuPassagem.jsp" role="button">Voltar</a>
		</div>
	</div>
</body>
</html>