package com.vpa.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO 
{
	private Connection con;
    private String driver = "com.mysql.jdbc.Driver";
    public String url = "jdbc:mysql://127.0.0.1:3306/vpa";
    public String user = "root";
    public String password = "";
    public String registro, nome, cargo, especialidade;

    public Connection Conectar() 
    {
        try 
        {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } 
        catch (ClassNotFoundException | SQLException ex) {
            //JOptionPane.showMessageDialog(null, bn.getString("dao.conexao.erro1") + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return con;
    }
}
