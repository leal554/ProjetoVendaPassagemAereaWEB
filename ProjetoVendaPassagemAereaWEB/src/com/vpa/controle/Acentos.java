package com.vpa.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vpa.data.PassagemDAO;
import com.vpa.model.Passagem;

/**
 * Servlet implementation class Acentos
 */
@WebServlet("/Acentos.do")
public class Acentos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Acentos() {
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
		String acento = request.getParameter("numeroAeronave");
		String fileira = request.getParameter("fil");
		String poltrona = request.getParameter("pol");
		
		if(acento == null && fileira == null)
		{
			RequestDispatcher view = request.getRequestDispatcher("Acentos.jsp");
			view.forward(request, response);
		}
		else
		{
			
			acento = fileira + " " + poltrona;
			
			Passagem.escolherAcento(acento);
			
			PassagemDAO pdao = new PassagemDAO();
			pdao.InserirPassagemDAO();
			
			RequestDispatcher view = request.getRequestDispatcher("MenuPassagem.jsp");
			view.forward(request, response);
		}
	}
	/*
		if(acento == null && fileira == null)
		{
			JOptionPane.showMessageDialog(null, bn.getString("acentos.erro1"));
		}
		else
		{
			poltrona = fileira + " " + acento;
			boolean i = false;
			
			if(fileira == null || acento == null)
			{
				JOptionPane.showMessageDialog(null,bn.getString("acentos.erro2") + poltrona);
			}
			else
			{
				Passagem p = new Passagem();
				p.escolherAcento(poltrona);
			
				PassagemDAO pdao = new PassagemDAO();
				pdao.InserirPassagemDAO();
			*/
}
