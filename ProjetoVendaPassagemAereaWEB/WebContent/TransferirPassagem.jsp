<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Transferir Passagem</title>

 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css" />
 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-theme.min.css" />
 <script src=".bootstrap/js/bootstrap.min.js"></script>

</head>
<body>

		<div>
			<label>Id do Beneficiario<input type="text" id="User" name="Name" /></label>
		</div>
		<div>
			<label>Id da Passagem<input type="text" id="User" name="Name" /></label>
		</div>
		
      	<div>
			<button onclick="window.location.href='./MenuPassagem.jsp'">Transferir</button>
			<button onclick="window.location.href='./LoginTransferencia.jsp'">Voltar</button>
		</div>
</body>
</html>