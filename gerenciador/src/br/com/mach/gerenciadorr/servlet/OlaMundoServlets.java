package br.com.mach.gerenciadorr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//olaa
//@WebServlet(urlPatterns="/olaa")  //	http://localhost:8080/gerenciador/olaa
public class OlaMundoServlets extends HttpServlet {
	
	
	public OlaMundoServlets() {
		System.out.println("Criando Servlet ");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {			
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("--->>> Ola Mundo Servlets... "); //	http://localhost:8080/gerenciador/olaa
		out.println("<br /> ");
		out.println("<br /> ");
		out.println("Acessa pelo Link para ver a Lista de Empresas:");
		out.println("<br /> ");
		out.println("http://localhost:8080/gerenciador/listaEmpresas");
		out.println("<br /> "); 
		out.println("-----------------------------------------------------------------------------------------------");
		out.println("<br /> ");
		out.println("<br /> ");
		out.println("Link para Add Nova Empresa:");	// http://localhost:8080/gerenciador/formNovaEmpresa.jsp
		out.println("<br /> ");
		out.println("http://localhost:8080/gerenciador/formNovaEmpresa.jsp");
		out.println("<br /> "); 
		out.println("-----------------------------------------------------------------------------------------------");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("_Foi chama do Servlet OlaMundoVServlet !!!");
		
	}
	

}