package br.com.mach.gerenciadorr.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebFilter("/entrada")    // Foi Definido no XML
public class AutorizacaoFilter implements Filter {
	
	// jetty-distribution-9.4.12.v20180830
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public void destroy() {
	}
	

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {

		System.out.println("Filter **Autorização**");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String	paramAcao = request.getParameter("acao"); //	http://localhost:8080/gerenciador/entrada?acao=ListaEmpresas
		
		HttpSession sessao = request.getSession();
		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") ==null );
		boolean ehUmaAcaoProtegiada =  !(paramAcao.equals("Login") || paramAcao.equals("LoginForm") );
		
		if(ehUmaAcaoProtegiada && usuarioNaoEstaLogado ) {
			response.sendRedirect( "entrada?acao=LoginForm" ); 
			return;
		}
		
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}


}
