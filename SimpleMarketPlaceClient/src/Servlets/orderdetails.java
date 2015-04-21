package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelclasses.Order;

import Connection.ServiceProxy;

/**
 * Servlet implementation class orderdetails
 */
//@WebServlet("/orderdetails")
public class orderdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public orderdetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("doGet orderdetail");
		System.out.println("User Id : " + request.getSession().getAttribute("userid"));
		String uid = request.getSession().getAttribute("userid").toString();
		Order[] order = proxy.fetchorderdata(uid);
		double total = proxy.gettotalorder(uid);
		request.setAttribute("orderdata", order);
		request.setAttribute("ordertotal", total);
		request.getRequestDispatcher("orderdetail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("doPost orderdetail");
	}

}
