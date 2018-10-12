package br.com.mach.gerenciadorr.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;

//import com.google.gson.Gson;

import br.com.mach.gerenciadorr.modelo.Banco;
import br.com.mach.gerenciadorr.modelo.Empresa;


@WebServlet("/empresas")
public class EmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> empresas = new Banco().getEmpresas();
		 
		
		XStream xstream = new XStream();		
		xstream.alias("empresa", Empresa.class);
		String xml = xstream.toXML(empresas);
		
		response.setContentType("application/Json");
		response.getWriter().print(xml);
		
		// Não funciona com ->> Gson <<--
//		Gson gson = new Gson();		//import com.google.gson.Gson;
//		String json = gson.toJson(empresas);
//		
//		response.setContentType("application/Json");
//		response.getWriter().print(json);
		
	}

}
