<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Comprar Passagem</title>
<jsp:include page="/layout.jsp" />

</head>
<body>
 	<div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<label>Comprar Passagem<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Peso Bagagem<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Numero Bagagem<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Necessidade Especial</label>
			<label for="sim">Sim</label>
  			<input type="radio" name="op" id="sim" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="op" id="nao" value="nao">			</p>
			<p>
			<label>Crian�a</label>
			<label for="sim">Sim</label>
  			<input type="radio" name="op" id="sim" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="op" id="nao" value="nao">			</p>
			<p>
			<label>Ida e Volta</label>
			<label for="sim">Sim</label>
  			<input type="radio" name="op" id="sim" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="op" id="nao" value="nao">			</p>
			<p>
			<label>Forma de Pagamento</label>
			<label for="credito">Credito</label>
  			<input type="radio" name="formapagamento" id="credito" value="credito">
  			<label for="debito">Debito</label>
  			<input type="radio" name="formapagamento" id="debito" value="debito">			</p>
			<p>
			<label>Numero do Cartao<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Codigo de Seguran�a<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Data da ida<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<label>Data da Volta<input type="text" id="User" name="Name" /></label>
			</p>
			<p>
			<a class="btn btn-lg btn-primary" href="./Acentos.jsp" role="button">Comprar Passagem</a>
			<a class="btn btn-lg btn-primary" href="./EscolherVooPassagem.jsp" role="button">Voltar</a>
			</p>
		</div>
	
</body>
</html>