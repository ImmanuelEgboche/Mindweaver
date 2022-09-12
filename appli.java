package com.org.sess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String s = request.getParameter("userName");
			out.print("Welcome " +s);
			
			HttpSession session = request.getSession();
			session.setAttribute("uname", s);
			out

            HttpSession session = request.getSession();
			session.setAttribute("uname", s);
			out.print("<a href ='servlet2> Visit </a>");
			out.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		String n = (String) session.getAttribute("uname");
		out.print("Hello "+n);
		out.close();
		
	}

}