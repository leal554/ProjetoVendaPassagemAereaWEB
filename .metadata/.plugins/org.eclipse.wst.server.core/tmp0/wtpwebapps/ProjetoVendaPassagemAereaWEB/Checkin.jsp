<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Check-in</title>

 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css" />
 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-theme.min.css" />
 <script src=".bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
		<div>
			<label>Despachar Bagagem</label><br>
			<label for="sim">Sim</label>
  			<input type="radio" name="op" id="sim" value="sim">
  			<label for="nao">N�o</label>
  			<input type="radio" name="op" id="nao" value="nao">
		</div>
		
      	<div>
			<button onclick="window.location.href='./MenuPassagem.jsp'">Emitir</button>
			<button onclick="window.location.href='./LoginCheckin.jsp'">Voltar</button>
		</div>
</body>
</html>