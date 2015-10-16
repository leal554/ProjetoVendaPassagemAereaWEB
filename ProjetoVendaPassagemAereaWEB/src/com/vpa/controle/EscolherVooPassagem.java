package com.vpa.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EscolherVooPassagem
 */
@WebServlet("/EscolherVooPassagem")
public class EscolherVooPassagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EscolherVooPassagem() {
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
		
	}
	
/*	String voo = (String) cVooPara.getSelectedItem();

	if(e.getSource() == cVooPara)
	{
		Voo v = new Voo();
		
		textoPartida.setText(v.diaSaida());//dia de partida e chega iguais
		textoChegada.setText(v.diaSaida());
		 
		textoHoraPartida.setText(v.horaSaida());
		textoHoraChegada.setText(v.horaChegada());
	}
	
	if(e.getSource() == comprar)
	{
		String numeroVoo, numeroAeronave;
		
		Voo v = new Voo();
		numeroVoo = v.getNumeroVoo();
		numeroAeronave = v.getNumeroAeronave();
		
		Passagem p = new Passagem();
		p.setNumeroVoo(numeroVoo);
		p.setNumeroAeronave(numeroAeronave);
		
		*/
}
