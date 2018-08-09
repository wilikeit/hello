package com;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("name", "lucy");
        request.getRequestDispatcher("/WEB-INF/view/hello.jsp").forward(request, response);
    	/*
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<p>hello</p>");
        */
    }
}