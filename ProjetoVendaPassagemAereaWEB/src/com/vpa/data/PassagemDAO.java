package com.vpa.data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vpa.model.Passagem;

public class PassagemDAO 
{
	private Statement stm;
    private Connection con;
    
    public void InserirPassagemDAO()
    {
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            stm.executeUpdate("INSERT INTO `passagem`(`pesoBagagem`, `numeroBagagem`, `necessidadeEspecial`, `crianca`, `idaEvolta`, `formaPagamento`, `numeroCartao`, "
            				+ "`codSeguranca`, `dataIda`, `dataVolta`, `valor`, `numeroAeronave`, `numeroVoo`, `idCliente`, `acento`) "
            		
            				+ " VALUES ('"+Passagem.getPesoBagagem()+"','"+ Passagem.getNumeroBagagem()+"','"+ Passagem.getNecessidadeEspecial()+"','"+ Passagem.getCriança()+"','"+ Passagem.getIdaEvolta()+"','"+ Passagem.getFormaPagamento()+"','"
            				+ Passagem.getNumeroCartao()+"','"+ Passagem.getCodSeguranca()+"','"+ Passagem.getDataIda()+"','"+ Passagem.getDataVolta()+"','"+ Passagem.getValor()+"','"+ Passagem.getNumeroAeronave()+"','"+ Passagem.getNumeroVoo()+"','"+ Passagem.getIdCliente()+"','"
            				+ Passagem.getAcento()+"')");
            con.close();
            stm.close();
            //JOptionPane.showMessageDialog(null, bn.getString("dao.passagem.erro1") , "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException e) 
        {
            //JOptionPane.showMessageDialog(null, bn.getString("dao.passagem.erro2") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    public void inserirIdCliente(String Email)
    {
    	try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            stm.executeUpdate("INSERT INTO `passagem`(`idCliente`) " + " VALUES ('"+Email+"')");
            con.close();
            stm.close();
            //JOptionPane.showMessageDialog(null, bn.getString("dao.passagem.erro3") , "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException e) 
        {
            //JOptionPane.showMessageDialog(null, bn.getString("dao.passagem.erro2") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
