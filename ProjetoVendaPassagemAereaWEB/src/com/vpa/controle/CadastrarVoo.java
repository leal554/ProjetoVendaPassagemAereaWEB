package com.vpa.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vpa.model.Voo;

/**
 * Servlet implementation class CadastrarVoo
 */
@WebServlet("/CadastrarVoo.do")
public class CadastrarVoo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarVoo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String numeroVoo = request.getParameter("numeroVoo");
		String tripulacao = request.getParameter("tripulacao");
		String saida = request.getParameter("saida");
		String chegada = request.getParameter("chegada");
		String dia = request.getParameter("dia");
		String destino = request.getParameter("destino");
		String aeronave = request.getParameter("aeronave");
				
		if(dia.length() < 10 || dia.length() > 10)
		{
			//Erro
		}
		else
		{
			new Voo(numeroVoo, Integer.parseInt(tripulacao), saida, chegada, dia, destino, aeronave);
			RequestDispatcher view = request.getRequestDispatcher("Menu.jsp");
			view.forward(request, response);
		}
	}
	
	/*String numeroVoo = texto1.getText();
	String tripulacao = texto2.getText(); 
	String saida = texto4.getText();
	String chegada = texto5.getText(); 
	String dia = texto6.getText();
	String destino = (String) ComboDestino.getSelectedItem();
	String aeronave = (String) ComboAeronave.getSelectedItem();
	
	if(e.getSource() == cadastrar)
	{
		if(dia.length() < 10 || dia.length() > 10)
		{
			JOptionPane.showMessageDialog(null, bn.getString("cadastrarVoo.mensagem1") ,"Erro",JOptionPane.WARNING_MESSAGE);
		}
		else
		{
			
			
			new Voo(numeroVoo, Integer.parseInt(tripulacao), saida, chegada, dia, destino, aeronave);
			//JOptionPane.showMessageDialog(null, bn.getString("cadastrarVoo.mensagem2"));
			new Menu();
			dispose();
		}
	}
	
	if(e.getSource() == voltar)
	{
		new Menu();
		dispose();
	}*/
}
