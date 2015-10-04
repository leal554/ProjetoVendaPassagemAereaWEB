<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculadora</title>
 
 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css" />
 <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-theme.min.css" />
 <script src=".bootstrap/js/bootstrap.min.js"></script>
 
</head>

<body>


 <div class="container">

      <form class="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div>
	<h2>Página Principal</h2>

	<form>
		<p>Escolha o que quer fazer!</p>
		<p></p>
	</form>

	<form action="somar.html">
		<input type="submit" value="Somar">
	</form>
	</p>
	<p>
	<form action="subtrair.html">
		<input type="submit" value="Subtrair">
	</form>
	</p>
	<p>
	<form action="multiplicar.html">
		<input type="submit" value="Multiplicar">
	</form>
	</p>
	<p>
	<form action="dividir.html">
		<input type="submit" value="Dividir">
	</form>
	</p>


	<img src="./img/sunset.jpg" height="50" width="300" alt="imagem" />
</body>
</html>