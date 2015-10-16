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
 * Servlet implementation class CadastrarCliente
 */
@WebServlet("/CadastrarCliente.do")
public class CadastrarCliente extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarCliente() {
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
		String nome = request.getParameter("nome");
		String rg = request.getParameter("rg");
		String cpf = request.getParameter("cpf");
		String endereco = request.getParameter("endereco");
		String cep = request.getParameter("cep");
		String srSraSr = request.getParameter("op");
		String estadoCivil = request.getParameter("estadoCivil"); // ****
		String emprego = request.getParameter("emprego");
		String email = request.getParameter("email");
		String confirmaEmail = request.getParameter("confirmaEmail");
		String senha = request.getParameter("senha");
		String confirmaSenha = request.getParameter("confirmaSenha");
		
   		new Cliente(nome, rg, cpf, endereco, Integer.parseInt(cep), srSraSr, estadoCivil, emprego, email, confirmaEmail, senha, confirmaSenha);

   		RequestDispatcher view = request.getRequestDispatcher("Menu.jsp");
		view.forward(request, response);
		
		
		
	}
	
/*	String nome = texto1.getText();
   	String rg = texto2.getText();
   	String cpf = texto3.getText();
   	String endereco = texto4.getText();
   	String cep = texto5.getText();
   	String srSraSr = null;
   	String estadoCivil = (String) ComboEstadoCivil.getSelectedItem();
   	String emprego = texto6.getText();
   	String email = texto7.getText();
   	String confirmaEmail = texto8.getText();
   	String senha = texto9.getText();
   	String confirmaSenha = texto10.getText();
   
   	if(tSr.isSelected())
   	{
   		srSraSr = "Sr";
   	}
   	
   	if(tSra.isSelected())
   	{
   		srSraSr = "Sra";
   	}
   	
   	if(tSrta.isSelected())
   	{
   		srSraSr = "Srta";
   	}
   	
   	if(e.getSource() == Cadastrar)
   	{
   		Cliente c = new Cliente(nome, rg, cpf, endereco, Integer.parseInt(cep), srSraSr, estadoCivil, emprego, email, confirmaEmail, senha, confirmaSenha);
   		MenuPassagem mp = new MenuPassagem();
   		dispose();
   	}
   
		if(e.getSource() == voltar)
	{
		MenuPassagem mp = new MenuPassagem();
		dispose();
	}*/

}
