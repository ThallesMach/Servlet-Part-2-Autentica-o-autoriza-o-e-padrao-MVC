package br.com.mach.gerenciadorr.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/entrada")	// Foi Definido no XML
public class MonitoramentoFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Filter **MonitoramentoFilter**");
		
		long antes = System.currentTimeMillis();
		
		String acao =  request.getParameter("acao");
		
		//executar a acao
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis();
		System.out.println("--->>Tempo de execução: "+(depois-antes)+"s" );
		System.out.println("---->>Tempo de execução da Ação "+ acao +" -->> "+(depois-antes)+"s" );
		System.out.println("---------------------------------------------------------------------------------------");
		
	}

}
