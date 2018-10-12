package br.com.mach.cliente;

import java.io.IOException;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;


/**
 * ver em XML	http://localhost:8080/gerenciador/empresas
 * ver normal	http://localhost:8080/gerenciador/entrada?acao=LoginForm
 * **/

public class ClienteWebService {
	
	public static void main(String[] args)	throws Exception, IOException {
		
		String conteudo = Request
                .Post("http://localhost:8080/gerenciador/empresas")
//                .addHeader("accept", "application/xml")
                .addHeader("accept", "application/json")
//                .bodyString("{'api-key':'a12bc8e423'}", ContentType.APPLICATION_JSON)
                .execute()
                .returnContent()
                .asString();

        System.out.println(conteudo);
	}

}
