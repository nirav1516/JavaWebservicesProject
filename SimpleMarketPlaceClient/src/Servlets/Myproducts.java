package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connection.ServiceProxy;

import modelclasses.Catalog;
import modelclasses.Product;

/**
 * Servlet implementation class Myproducts
 */
@WebServlet("/Myproducts")
public class Myproducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myproducts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Product[] products;
		
		System.out.println("doGet GetProducts");
		String catid = request.getParameter("catid");
		System.out.println("Catalog Id : " + catid);
		System.out.println("User Id : " + request.getSession().getAttribute("userid"));
		String uid = request.getSession().getAttribute("userid").toString();
		
		products = proxy.fetchMyproducts(uid);
		
		request.setAttribute("productlist", products);
		System.out.println("Going to index.jsp");
		String url = request.getContextPath() + "/View/index.jsp";
		System.out.println("URL --> " + url);
		request.getRequestDispatcher("Myproducts.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
