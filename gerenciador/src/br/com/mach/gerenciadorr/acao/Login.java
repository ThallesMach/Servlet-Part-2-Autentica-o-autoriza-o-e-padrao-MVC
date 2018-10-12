package br.com.mach.gerenciadorr.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mach.gerenciadorr.modelo.Banco;
import br.com.mach.gerenciadorr.modelo.Usuario;

public class Login implements Acao {

	
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		System.out.println("Logando " + login);
		
		Banco banco = new Banco();
		Usuario usuario = banco.existeUsuario(login, senha);
		
		if(usuario !=null) {
			System.out.println("_Usuario existe ");
			return "redirect:entrada?acao=ListaEmpresas";
		}else {
			System.out.println("_Tenta outra vez");
			return "redirect:entrada?acao=LoginForm";
		}
		
	}

}
