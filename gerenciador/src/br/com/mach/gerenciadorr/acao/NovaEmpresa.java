package br.com.mach.gerenciadorr.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovaEmpresa implements Acao {
	
	
	public String executa(HttpServletRequest request, HttpServletResponse response) 
	        throws ServletException, IOException {
				return "forward:formNovaEmpresa.jsp";
	    }
	
	
//	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//
//		System.out.println("_Ação Cadastrando nova empresa");
//		
//		String nomeEmpresa = request.getParameter("nome");
//		String paramDataEmpresa = request.getParameter("data");
//		
//		Date dataAbertura = null;
//		try {
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			dataAbertura = sdf.parse(paramDataEmpresa);
//		} catch (ParseException e) {
//			throw new ServletException(e);
//		}
//		
//		Empresa empresa = new Empresa();
//		empresa.setNome(nomeEmpresa);
//		empresa.setDataAbertura(dataAbertura);
//		
//		Banco banco = new Banco();
//		banco.adiciona(empresa);
//		
//		request.setAttribute("empresa", empresa.getNome());
//
//        //redirecionando pelo navegador
//        return "redirect:entrada?acao=ListaEmpresas";
//	}

}
