package com.simplemathsolver.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import com.simplemathsolver.webservices.WebservicemathProxy;
/**
 * Servlet implementation class SelfTest
 */
@WebServlet("/SelfTest")
public class SelfTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	WebservicemathProxy proxy = new WebservicemathProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelfTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int param,choose,calls;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Random generator = new Random();
		
		long starttime = System.currentTimeMillis();
		System.out.println("Start time for 1000 calls" + starttime);
		calls = 1000;
		param = generator.nextInt(1000)+1;
		for (int i = 0;i<calls;i++){
			//System.out.println(i);
			choose = generator.nextInt(2)+1;
			if(choose==1){
				proxy.checkprime(param);
			}else {
				proxy.findprimeseries(param);
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println("end time for 1000 calls" + endtime);
		float time = endtime - starttime;
		System.out.println("Average time for 1000 calls : "+ time/1000 +" ms");
		out.println("<h4>Average time for 1000 calls : "+ time/1000 +" ms</h4>");
		
		calls= 5000;
		starttime = System.currentTimeMillis();
		System.out.println("Start time for 5000 calls" + starttime);
		for (int i = 0;i<calls;i++){
			//System.out.println(i);
			choose = generator.nextInt(2)+1;
			if(choose==1){
				proxy.checkprime(param);
			}else {
				proxy.findprimeseries(param);
			}
		}
		 endtime = System.currentTimeMillis();
		System.out.println("end time for 5000 calls" + endtime);
		 time = endtime - starttime;
		System.out.println("Average time for 5000 calls : "+ time/5000 +" ms");
		out.println("<h4>Average time for 5000 calls : "+ time/5000 +" ms</h4>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
