package com.vpa.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vpa.model.Cliente;

/**
 * Servlet implementation class ConsultarCliente
 */
@WebServlet("/ConsultarCliente.do")
public class ConsultarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultarCliente() {
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
		
		String email = request.getParameter("numeroVoo");
		String senha = request.getParameter("numeroVoo");
		
		boolean clienteLogin = false;
		
		Cliente c = new Cliente();
		clienteLogin = c.loginCliente(email, senha);
		
		if(clienteLogin)
		{
			RequestDispatcher view = request.getRequestDispatcher("ResultadoConsultarCliente.jsp");
			view.forward(request, response);
		}
		else
		{
			RequestDispatcher view = request.getRequestDispatcher("Acentos.jsp");
			view.forward(request, response);
		}
	}
	
/*	String email = texto1.getText();
	String senha = texto2.getText();
	
	boolean clienteLogin = false;
	
	Cliente c = new Cliente();
	clienteLogin = c.loginCliente(email, senha);
	
	if(e.getSource() == consultar)
	{
		if(clienteLogin)
		{
			ResultadoConsultarCliente rcc = new ResultadoConsultarCliente();
			dispose();
		}
		else
		{
			JOptionPane.showMessageDialog(null, bn.getString("consultarCliente.erro1"));
		}
	}*/

}
