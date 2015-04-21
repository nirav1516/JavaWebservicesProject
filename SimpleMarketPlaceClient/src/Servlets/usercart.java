package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connection.ServiceProxy;
import modelclasses.*;
/**
 * Servlet implementation class usercart
 */
//@WebServlet("/usercart")
public class usercart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public usercart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cart[] carts;
		System.out.println("doGet usercart");
		
		System.out.println("User Id : " + request.getSession().getAttribute("userid"));
		String uid = request.getSession().getAttribute("userid").toString();
		carts = proxy.fetchcartdata(uid);
		double total = proxy.gettotalcart(uid);
		request.setAttribute("usercart", carts);
		request.setAttribute("carttotal", total);
		
		System.out.println("Going to usercart.jsp");
		
		request.getRequestDispatcher("usercart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

}
