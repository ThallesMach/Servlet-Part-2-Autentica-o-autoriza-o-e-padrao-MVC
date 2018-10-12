<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
			<br>
			<c:import url="logout-parcial.jsp"/>
			<br>
	
		<c:if test="${not empty empresa}">
			Empresa ${ empresa } cadastrada com sucesso!
		</c:if>
		
		<c:if test="${empty empresa}">
			Nenhuma empresa cadastrada!
		</c:if>

	</body>
</html>

<br />
<!-- 
	 <% // <br />  � quebra de Linha %>
	<% // J� vimos um pouco sobre o forEach, mas d� uma olhada no uso dessa tag no c�digo abaixo: %>
 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <body>
     <c:forEach var="i" begin="1" end="10" step="2">
       ${i} <br />
     </c:forEach>
  </body>
</html>