package com.vpa.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vpa.data.CheckInDAO;
import com.vpa.model.CheckIn;

/**
 * Servlet implementation class Checkin
 */
@WebServlet("/Checkin.do")
public class Checkin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkin() {
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
		String despacharBagagem = request.getParameter("op");
		boolean op = false;
		//String passagem = request.getParameter("nome"); //COMBO
		
		if (despacharBagagem.equals("sim")) {
			op = true;
		}

		if (despacharBagagem.equals("nao")) {
			op = false;
		}
		
		//c.setPassagem(passagem);
		CheckIn.setDespacharBagagem(op);
		
		CheckInDAO cdao = new CheckInDAO();
		cdao.checkIn();
		
		RequestDispatcher view = request.getRequestDispatcher("MenuPassagem.jsp");
		view.forward(request, response);
	}
	
	/*boolean despacharBagagem = false;
	String passagem = (String) comboCheck.getSelectedItem();

	if (simButton.isSelected()) {
		despacharBagagem = true;
	}

	if (naoButton.isSelected()) {
		despacharBagagem = false;
	}

	if (e.getSource() == emitir) {

		CheckIn c = new CheckIn();
		c.setPassagem(passagem);
		c.setDespacharBagagem(despacharBagagem);
		
		CheckInDAO cdao = new CheckInDAO();
		cdao.checkIn();

		new MenuPassagem();
		dispose();
	}

	if (e.getSource() == voltar) {
		new LoginCheckIn();
		dispose();
	}*/
}
