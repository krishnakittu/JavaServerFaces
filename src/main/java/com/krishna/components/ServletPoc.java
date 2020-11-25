package com.krishna.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

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
		    StringBuilder buffer = new StringBuilder();
		    BufferedReader reader1 = request.getReader();
		    String line;
		    while ((line = reader1.readLine()) != null) {
		        buffer.append(line);
		        buffer.append(System.lineSeparator());
		    }
		    String data = buffer.toString();
		    System.out.println("data:"+data);
		    
		    System.out.println("----------------------------------------------------------------------------------");

		
	}
}
