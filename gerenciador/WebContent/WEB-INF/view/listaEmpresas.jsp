<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.mach.gerenciadorr.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Standard Taglib</title>
</head>
<body>
	<br>
	<c:import url="logout-parcial.jsp"/>

	<br><!--  <br> é Quebra de Linha -->
	Usuario Logado: ${usuarioLogado.login }
	<br> 
	<br>
	
	Cadastra nova empresa:
	<a href="entrada?acao=NovaEmpresaForm" >Add</a>
	<br>
	<br>
	<br> 
	 
	
	<c:if test="${not empty empresa}">
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
		

	Lista de empresas: <br />
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			
			<li>
				${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> 
				<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id }">editar</a>
				<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id }">remove</a>
			</li>
			
		</c:forEach>
	</ul>
	
</body>
