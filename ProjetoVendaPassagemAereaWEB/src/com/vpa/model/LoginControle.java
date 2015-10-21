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
	
	public boolean loginAdmin()
	{
		boolean administrador = false;
		
		LoginDAO logadmdao = new LoginDAO();
		administrador = logadmdao.loginAdminDAO();
		
		return administrador;
	}
}
