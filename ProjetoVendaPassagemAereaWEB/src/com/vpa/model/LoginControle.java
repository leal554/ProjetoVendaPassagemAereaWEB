package com.vpa.model;

import com.vpa.data.LoginDAO;

public class LoginControle 
{
	public LoginControle(){}
	
	public boolean loginCliente(String email, String senha)
   	{	
   		boolean verifica = false;
   		
   		LoginDAO logdao = new LoginDAO();
   		verifica = logdao.loginClienteDAO(email, senha);
   		
   		return verifica;
   	}
}
