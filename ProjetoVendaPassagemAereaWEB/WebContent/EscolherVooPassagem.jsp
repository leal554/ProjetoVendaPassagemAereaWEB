<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Escolher Voo Passagem</title>

<jsp:include page="/layout.jsp" /><jsp:include page="/layout.jsp" />

</head>
<body>
<form class="form-horizontal" role="form" method="post" action="EscolherVooPassagem.do">
	<div class="container">
		<div class="jumbotron">
		<h1></h1>
			<p>
			<h2><label class="control-label">Escolher Voo Passagem</label></h2>
			<p>
        	<label class="control-label">Escolher Voo</label>
        	<select class="form-control" name="size">
        	 <option value="null"></option>
            </select>
			</p>
			<p>
			<label class="control-label">Escolher Voo Partida</label>
        	<select class="form-control" name="size">
        		<option value="null"></option>
            </select>
			</p>
			<p>
			<label>Data da Partida<input type="text" class="form-control" id="emprego" name="emprego" /></label>
			
			</p>
			<p>
			<label>Data da Chegada<input type="text" class="form-control" id="emprego" name="emprego" /></label>
			</p>
			<p>
			<label>Hora da Partida<input type="text" class="form-control" id="emprego" name="emprego" /></label>
			</p>
			<p>
			<label>Hora da Chegada<input type="text" class="form-control" id="emprego" name="emprego" /></label>
			</p>
			<p>
			<input id="submit" name="submit" type="submit" value="Cadastrar Voo" class="btn btn-default">
			<a class="btn btn-default" href="./LoginComprarPassagem.jsp" role="button">Voltar</a>
			</p>
		</div>
	</div>
	</form>
</body>
</html>