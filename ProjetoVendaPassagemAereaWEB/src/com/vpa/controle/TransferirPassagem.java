package com.vpa.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vpa.data.TransferenciaDAO;
import com.vpa.model.Transferencia;

/**
 * Servlet implementation class TransferenciaPassagem
 */
@WebServlet("/TransferenciaPassagem.do")
public class TransferirPassagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferirPassagem() {
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
		String email = request.getParameter("idben");
		String passagem = request.getParameter("idpa");
		
		Transferencia.setIdCliente2(email);
		Transferencia.setPassagem(passagem);
				
		TransferenciaDAO tdao = new TransferenciaDAO();
		tdao.transferrirVoo();
		
		RequestDispatcher view = request.getRequestDispatcher("MenuPassagem.jsp");
		view.forward(request, response);
		
	}
	
	/*
	String email = texto1.getText();
	String passagem = (String) comboPassagem.getSelectedItem();
	
	if(e.getSource() == Transferir)
	{
			Transferencia t = new Transferencia();
			t.setIdCliente2(email);
			
			t.setPassagem(passagem);
			
			TransferenciaDAO tdao = new TransferenciaDAO();
			tdao.transferrirVoo();
			
			new TransferenciaPassagem();
			dispose(); 

	}*/
}
