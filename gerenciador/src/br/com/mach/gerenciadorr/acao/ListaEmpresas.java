package br.com.mach.gerenciadorr.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.mach.gerenciadorr.modelo.Banco;
import br.com.mach.gerenciadorr.modelo.Empresa;

//	http://localhost:8080/gerenciador/entrada?acao=ListaEmpresas
public class ListaEmpresas implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		HttpSession sessao = request.getSession();
//		if(sessao.getAttribute("usuarioLogado") ==null ) {
//			return "redirect:entrada?acao=LoginForm";
//		}
		
		System.out.println("_Lista Empresas");
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		
		return "forward:listaEmpresas.jsp";
	}

}
