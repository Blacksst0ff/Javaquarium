<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>

<%@ page import="com.javaquarium.util.Consts" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.3.0/pure-min.css">
<title><bean:message key="message.listerPoisson.titrePage" /></title>
</head>
<body>
	<h1>
		<bean:message key="message.listerPoisson.bienvenue" />
		<%= request.getSession().getAttribute(Consts.SESSION_LOGIN_USERNAME) %> !
		
	</h1>

	<table class="pure-table pure-table-bordered">
		<thead>
			<tr>
				<th><bean:message key="message.listerPoisson.nom" /></th>
				<th><bean:message key="message.listerPoisson.description" /></th>
				<th><bean:message key="message.listerPoisson.couleur" /></th>
				<th><bean:message key="message.listerPoisson.dimension" /></th>
				<th><bean:message key="message.listerPoisson.prix" /></th>
				<th><bean:message key="message.listerPoisson.detail" /></th>
				<th><bean:message key="message.listerPoisson.monaquarium" /></th>
			</tr>
		</thead>
		<tr>
			<logic:iterate name="<%= Consts.SESSION_MES_POISSONS_LIST %>" id="poisson">

			<td><bean:write name="poisson" property="espece"/></td>
			<td><bean:write name="poisson" property="description"/></td>
			<td><bean:write name="poisson" property="couleur"/></td>
			<td><bean:write name="poisson" property="dimension"/></td>
			<td><bean:write name="poisson" property="prix"/></td>
			<td><a href="#"><bean:message key="message.listerPoisson.detail" /></a></td>
			<td><a href="#"><bean:message key="message.listerPoisson.ajouter" /></a> <a href="#"><bean:message key="message.listerPoisson.supprimer" /></a></td>
			
			</logic:iterate>
		</tr>

	</table>

	<p><html:link href="<%=request.getContextPath()+\"/jsp/UC02_nouvelle_espece.jsp\"%>"><bean:message key="message.listerPoisson.ajouter" /></html:link></p>
</body>
</html>