package com.vpa.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vpa.model.Pagamento;
import com.vpa.model.Passagem;

/**
 * Servlet implementation class ComprarPassagem
 */
@WebServlet("/ComprarPassagem.do")
public class ComprarPassagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComprarPassagem() {
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
		String pesoBagagem = request.getParameter("pesoBagagem");
		String numeroBagagem = request.getParameter("numeroBagagem");
		String necessidadeEspecial = request.getParameter("ne");
		String crianca = request.getParameter("cr");
		String idaEvolta = request.getParameter("iv");
		String formaPagamento = request.getParameter("formapagamento");
		String numeroCartao = request.getParameter("numeroCartao");
		String codSeguranca = request.getParameter("codigoSeguranca");
		String dataIda = request.getParameter("dataIda");
		String dataVolta = request.getParameter("dataIda"); 
		
		if(dataIda.length() < 10 || dataIda.length() > 10 && dataVolta.length() < 10 || dataVolta.length() > 10)
		{
			//erro
		}
		else
		{
			Passagem.setPesoBagagem(Double.parseDouble(pesoBagagem));
			Passagem.setNumeroBagagem(numeroBagagem);
			Passagem.setNecessidadeEspecial(necessidadeEspecial);
			Passagem.setCrian�a(crianca);
			Passagem.setIdaEvolta(idaEvolta);
			Passagem.setFormaPagamento(formaPagamento);
			Passagem.setNumeroCartao(Integer.parseInt(numeroCartao));
			Passagem.setCodSeguranca( Integer.parseInt(codSeguranca));
			Passagem.setDataIda(dataIda);
			Passagem.setDataVolta(dataVolta);

			
			new Pagamento();
		}
		
		RequestDispatcher view = request.getRequestDispatcher("Acentos.jsp");
		view.forward(request, response);
	}
	
/*	String pesoBagagem = texto1.getText();
	String numeroBagagem = texto2.getText();
	String necessidadeEspecial = null; 
	String crian�a = null;
	String idaEvolta = null;
	String formaPagamento = null; 
	String numeroCartao = texto3.getText();
	String codSeguranca = texto4.getText();
	String dataIda = texto5.getText();
	String dataVolta = texto6.getText(); 
	
	
	if(e.getSource() == escolherAcento)
	{
		if(dataIda.length() < 10 || dataIda.length() > 10 && dataVolta.length() < 10 || dataVolta.length() > 10)
		{
			JOptionPane.showMessageDialog(null, bn.getString("comprarPassagem.mensagem1") ,"Erro",JOptionPane.WARNING_MESSAGE);
		}
		else
		{
			Passagem p = new Passagem();
			p.setPesoBagagem(Double.parseDouble(pesoBagagem));
			p.setNumeroBagagem(numeroBagagem);
			p.setNecessidadeEspecial(necessidadeEspecial);
			p.setCrian�a(crian�a);
			p.setIdaEvolta(idaEvolta);
			p.setFormaPagamento(formaPagamento);
			p.setNumeroCartao(Integer.parseInt(numeroCartao));
			p.setCodSeguranca( Integer.parseInt(codSeguranca));
			p.setDataIda(dataIda);
			p.setDataVolta(dataVolta);

			
			new Pagamento();
		}
	}*/
}
