<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Check-in</title>

<jsp:include page="/layout.jsp" />


</head>
<body>
		<div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<label>Despachar Bagagem</label><br><br>
			<label for="sim">Sim</label>
  			<input type="radio" name="op" id="sim" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="op" id="nao" value="nao">
			</p>
			<p>
			<a class="btn btn-lg btn-primary" href="./MenuPassagem.jsp" role="button">Emitir</a>
			<a class="btn btn-lg btn-primary" href="./LoginCheckIn.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
</body>
</html>