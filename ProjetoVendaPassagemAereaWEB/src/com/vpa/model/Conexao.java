package com.vpa.model;

import java.sql.SQLException;

import com.vpa.data.ConexaoDAO;

public class Conexao 
{
	public Conexao() throws SQLException
	{
		ConexaoDAO cd = new ConexaoDAO();
	}
}
