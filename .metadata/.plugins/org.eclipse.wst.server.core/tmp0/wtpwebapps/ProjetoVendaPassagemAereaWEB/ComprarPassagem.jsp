<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Comprar Passagem</title>

 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css" />
 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-theme.min.css" />
 <script src=".bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
		<div>
			<label>Comprar Passagem<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Peso Bagagem<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Numero Bagagem<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Necessidade Especial</label>
			<label for="sim">Sim</label>
  			<input type="radio" name="op" id="sim" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="op" id="nao" value="nao">
		</div>
		<div>
			<label>Crian�a</label>
			<label for="sim">Sim</label>
  			<input type="radio" name="op" id="sim" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="op" id="nao" value="nao">
		</div>
		<div>
			<label>Ida e Volta</label>
			<label for="sim">Sim</label>
  			<input type="radio" name="op" id="sim" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="op" id="nao" value="nao">
		</div>
		<div>
			<label>Forma de Pagamento</label>
			<label for="credito">Credito</label>
  			<input type="radio" name="formapagamento" id="credito" value="credito">
  			<label for="debito">Debito</label>
  			<input type="radio" name="formapagamento" id="debito" value="debito">
		</div>
		<div>
			<label>Numero do Cartao<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Codigo de Seguran�a<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Data da ida<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Data da Volta<input type="text" id="User" name="Name" /></label>
		</div>
		
      	<div>
			<button onclick="window.location.href='./Acentos.jsp'">Comprar Passagem</button>
			<button onclick="window.location.href='./EscolherVooPassagem.jsp'">Voltar</button>
		</div>
</body>
</html>