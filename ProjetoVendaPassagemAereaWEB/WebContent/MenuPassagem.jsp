<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Passagem</title>
<jsp:include page="/layout.jsp" />
</head>
<body>

    
    <div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<a class="btn btn-lg btn-primary" href="./LoginComprarPassagem.jsp" role="button">Comprar Passagem</a>
			</p>
			<p>
			<a class="btn btn-lg btn-primary" href="./CadastrarCliente.jsp" role="button">Novo Cliente</a>
			</p>
			<p>
			<a class="btn btn-lg btn-primary" href="./ConsultarCliente.jsp" role="button">Consultar Cliente</a>
			</p>
			<p>
			<a class="btn btn-lg btn-primary" href="./LoginTransferencia.jsp" role="button">Transferir Passagem</a>
			</p>
			<p>
			<a class="btn btn-lg btn-primary" href="./LoginCheckIn.jsp" role="button">Checkin</a>
			</p>
		</div>
	</div>
</body>
</html>