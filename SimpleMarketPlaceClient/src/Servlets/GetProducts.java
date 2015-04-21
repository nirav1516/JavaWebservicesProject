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
 * Servlet implementation class GetProducts
 */
//@WebServlet("/GetProducts")
public class GetProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetProducts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession session = request.getSession();
		Product[] products;
		Catalog[] catalogs;
		System.out.println("doGet GetProducts");
		String catid = request.getParameter("catid");
		System.out.println("Catalog Id : " + catid);
		System.out.println("User Id : " + request.getSession().getAttribute("userid"));
		String uid = request.getSession().getAttribute("userid").toString();
		catalogs = proxy.fetchcatlogs();
		products = proxy.fetchproducts(catid,uid);
		request.setAttribute("cataloglist", catalogs);
		request.setAttribute("productlist", products);
		
		System.out.println("Going to index.jsp");
		String url = request.getContextPath() + "/View/index.jsp";
		System.out.println("URL --> " + url);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
