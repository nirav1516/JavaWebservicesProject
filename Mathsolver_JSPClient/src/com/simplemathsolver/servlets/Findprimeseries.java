package com.simplemathsolver.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplemathsolver.webservices.Webservicemath;
import com.simplemathsolver.webservices.WebservicemathProxy;

/**
 * Servlet implementation class Findprimeseries
 */
@WebServlet("/Findprimeseries")
public class Findprimeseries extends HttpServlet {
	private static final long serialVersionUID = 1L;
	WebservicemathProxy proxy = new WebservicemathProxy();    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Findprimeseries() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Post of finprime");
		String num = request.getParameter("tbfindprime");
		System.out.println("number is " + num);
		int n = Integer.parseInt(num);
		String data = proxy.findprimeseries(n);
		
		request.setAttribute("result", data);
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

}
