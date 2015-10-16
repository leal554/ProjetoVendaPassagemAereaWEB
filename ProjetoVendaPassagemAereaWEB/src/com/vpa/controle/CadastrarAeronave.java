package com.vpa.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vpa.model.Aeronave;

/**
 * Servlet implementation class CadastroAeronave
 */
@WebServlet("/CadastrarAeronave.do")
public class CadastrarAeronave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarAeronave() {
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
		String numeroAeronave = request.getParameter("numeroAeronave");
		String numeroAcentos = request.getParameter("numeroAcentos");
		
		new Aeronave(numeroAeronave, Integer.parseInt(numeroAcentos));
		
		RequestDispatcher view = request.getRequestDispatcher("Menu.jsp");
		view.forward(request, response);
	}
	
	/*String numeroAeronave = texto1.getText();
	String numeroAcentos = texto2.getText();
	
	if(e.getSource() == cadastrar)
	{
		new Aeronave(numeroAeronave, Integer.parseInt(numeroAcentos));
		new Menu();
		dispose();
	}*/
}
