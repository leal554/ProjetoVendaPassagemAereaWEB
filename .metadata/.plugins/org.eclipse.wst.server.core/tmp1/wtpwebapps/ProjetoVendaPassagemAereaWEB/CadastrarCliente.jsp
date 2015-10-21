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

<form class="form-horizontal" role="form" method="post" action="CadastrarCliente.do">
	<div class="container">
		<div class="jumbotron">
			<h2><label>Cadastrar Cliente</label></h2>
			<p>
			<label>Nome<input type="text" class="form-control" id="nome" name="nome" /></label>
			</p>
			<p>
			<label>RG<input type="text" class="form-control" id="rg" name="rg" /></label>
			</p>
			<p>
			<label>CPF<input type="text" class="form-control" id="cpf" name="cpf" /></label>
			</p>
			<p>
			<label>Endere�o<input type="text"  class="form-control" id="endereco" name="endereco" /></label>
			</p>
			<p>
			<label>CEP<input type="text" class="form-control" id="cep" name="cep" /></label>
			</p>
			<p>
			<label>Como gostaria de ser chamado</label>
			<label for="Sr">Sr.</label>
  			<input type="radio" name="op" id="Sr" value="Sr">
  			<label for="Sra">Sra.</label>
  			<input type="radio" name="op" id="Sra" value="Sra">
			<label for="Srta">Srta.</label>
  			<input type="radio" name="op" id="Srta" value="Srta">
			</p>
			<p>
			<label class="control-label">Estado Civil</label>
        	<select class="form-control" name="size">
        	 <option value=""></option>
                <option value="solteiro">Solteiro(a)</option>
                <option value="casado">Casado(a)</option>
                <option value="divorciado">Divorciado(a)</option>
                <option value="viuvo">Vi�vo(a)</option>
                <option value="separado">Separado(a)</option>
                <option value="companheiro">Companheiro(a)</option>
            </select>
			</p>
			<p>
			<label>Emprego<input type="text" class="form-control" id="emprego" name="emprego" /></label>
			</p>
			<p>
			<label>Email<input type="text" class="form-control" id="email" name="email" /></label>
			</p>
			<p>
			<label>Confirmar Email<input type="text"class="form-control"  id="confirmaEmail" name="confirmaEmail" /></label>
			</p>
			<p>
			<label>Senha<input type="text" class="form-control" id="senha" name="senha" /></label>
			</p>
			<p>
			<label>Confirmar Senha<input type="text" class="form-control" id="confirmaSenha" name="confirmaSenha" /></label>
			</p>
			<input id="submit" name="submit" type="submit" value="Cadastrar" class="btn btn-default">
			<a type="submit" class="btn btn-default" href="./MenuPassagem.jsp" >Voltar</a>
		</div>
	</div>
	</form>
</body>
</html>