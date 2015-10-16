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
<form class="form-horizontal" role="form" method="post" action="ComprarPassagem.do">
 	<div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<h2><label>Comprar Passagem</label></h2>
			<p>
			<label>Peso Bagagem<input type="text" class="form-control" id="pesoBagagem" name="pesoBagagem" /></label>
			</p>
			<p>
			<label>Numero Bagagem<input type="text" class="form-control" id="numeroBagagem" name="numeroBagagem" /></label>
			</p>
			<p>
			<label>Necessidade Especial</label>
			<label for="sim">Sim</label>
  			<input type="radio" name="ne" id="ne" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="ne" id="ne" value="nao">			
  			</p>
			<p>
			<label>Crian�a</label>
			<label for="sim">Sim</label>
  			<input type="radio" name="cr" id="cr" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="cr" id="cr" value="nao">			
  			</p>
			<p>
			<label>Ida e Volta</label>
			<label for="sim">Sim</label>
  			<input type="radio" name="iv" id="iv" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="iv" id="iv" value="nao">			
  			</p>
			<p>
			<label>Forma de Pagamento</label>
			<label for="credito">Credito</label>
  			<input type="radio" name="formapagamento" id="formapagamento" value="credito">
  			<label for="debito">Debito</label>
  			<input type="radio" name="formapagamento" id="formapagamento" value="debito">			
  			</p>
			<p>
			<label>Numero do Cartao<input type="text" class="form-control" id="numeroCartao" name="numeroCartao" /></label>
			</p>
			<p>
			<label>Codigo de Seguran�a<input type="text" class="form-control" id="codigoSeguranca" name="codigoSeguranca" /></label>
			</p>
			<p>
			<label>Data da ida<input type="text" class="form-control" id="dataIda" name="dataIda" /></label>
			</p>
			<p>
			<label>Data da Volta<input type="text" class="form-control" id="dataIda" name="dataVolta" /></label>
			</p>
			<p>
			<input id="submit" name="submit" type="submit" value="Comprar Passagem" class="btn btn-default">
			<a class="btn btn-default" href="./EscolherVooPassagem.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
	</form>
</body>
</html>