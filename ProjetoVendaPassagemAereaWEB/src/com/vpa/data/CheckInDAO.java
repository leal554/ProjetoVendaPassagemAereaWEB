package com.vpa.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import com.vpa.model.CheckIn;

public class CheckInDAO 
{
	private Statement stm;
    private Connection con;
    private ResultSet rs;
    private ArrayList<String> arrayCheck = new ArrayList<String>();
    private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
    public void checkIn()
    {
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement(); 
            stm.executeUpdate("UPDATE `passagem` SET `checkIn`= '1'  WHERE `idCliente` = '"+CheckIn.getIdCliente()+"' AND `id` = '"+CheckIn.getPassagem()+"'");
            stm.close();
            
            //JOptionPane.showMessageDialog(null, bn.getString("dao.checkIn.mensagem1"));
        } 
        catch (SQLException e) 
        {
            //JOptionPane.showMessageDialog(null, bn.getString("dao.checkIn.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList<String> checkDAO(String idCliente) 
    {
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from passagem WHERE idCliente = '" + idCliente+"' AND checkIn = '0' ");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                arrayCheck.add(rs.getString("id"));
            }
            if (result == 0) 
            {
            	arrayCheck.add(bn.getString("dao.checkIn.erro2"));
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            //JOptionPane.showMessageDialog(null, bn.getString("dao.checkIn.erro3") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return arrayCheck;
    }
}
