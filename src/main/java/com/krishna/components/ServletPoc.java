package com.krishna.components;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SvnHook")
public class ServletPoc extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Method Name:"+request.getMethod());
		System.out.println("Content Type:"+request.getContentType());
		Enumeration<String> headerNames = request.getHeaderNames();
		

		    if (headerNames != null) {
		            while (headerNames.hasMoreElements()) {
		                    System.out.println("Header: " + request.getHeader(headerNames.nextElement()));
		            }
		    }
		    
		    System.out.println(request.getParameterMap());
		    
		    System.out.println("----------------------------------------------------------------------------------");

		
	}
}
