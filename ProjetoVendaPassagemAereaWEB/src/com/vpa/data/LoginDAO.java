package com.vpa.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;


public class LoginDAO 
{
	private Statement stm;
    private Connection con;
    private ResultSet rs;
    private int idCliente;
    private String email;
    private String senha;
    private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
	
	public boolean loginClienteDAO(String email , String senha) 
    {
    	boolean login = false;
    	
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from cliente");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                this.email = rs.getString("email");
                this.senha = rs.getString("senha");
            }
            if (result == 0) 
            {
                //JOptionPane.showMessageDialog(null, bn.getString("dao.cliente.erro3"), "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
            con.close();
            stm.close();
            rs.close();
            
            if(this.email.equals(email) && this.senha.equals(senha))
            {
            	login = true;
            }
        } 
        catch (SQLException e) 
        {
            //JOptionPane.showMessageDialog(null, bn.getString("dao.cliente.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            login = false;
        }
		return login;
    }
}