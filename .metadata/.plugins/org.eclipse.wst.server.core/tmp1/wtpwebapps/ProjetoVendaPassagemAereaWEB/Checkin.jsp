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
<form class="form-horizontal" role="form" method="post" action="Checkin.do">
		<div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p><h2>Check-in</h2>
			<label>Despachar Bagagem</label><br><br>
			<label for="sim">Sim</label>
  			<input type="radio" name="op" id="sim" value="sim">
  			<label for="nao">Não</label>
  			<input type="radio" name="op" id="nao" value="nao">
			<p>
			<input id="submit" name="submit" type="submit" value="Emitir" class="btn btn-default">			
			<a class="btn btn-default" href="./LoginCheckIn.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
	</form>
</body>
</html>