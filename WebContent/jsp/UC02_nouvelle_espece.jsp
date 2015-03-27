<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic"
	prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.3.0/pure-min.css">
<title><bean:message key="message.nouvelle_espece.titrePage" /></title>
</head>
<body>

	<div style="margin: 50px auto; width: 500px;">
		<h1>
			<bean:message key="message.nouvelle_espece.h1" />
		</h1>
		<div style="color: red;">
			<html:errors />
		</div>
		<html:form action="/NouvelleEspeceForm"
			styleClass="pure-form pure-form-aligned">
			<fieldset>
				<div class="pure-control-group">
					<label for="nom"><bean:message
							key="message.nouvelle_espece.nom" /></label>
					<html:text property="espece" />
				</div>

				<div class="pure-control-group">
					<label for="description"><bean:message
							key="message.nouvelle_espece.description" /></label>
					<html:text property="description" />
				</div>

				<div class="pure-control-group">
					<label for="couleur"><bean:message
							key="message.nouvelle_espece.couleur" /></label>
					<html:text property="couleur" />
				</div>

				<div class="pure-control-group">
					<label for="prix"><bean:message
							key="message.nouvelle_espece.prix" /></label>
					<html:text property="prix" />
				</div>

				<div class="pure-control-group">
					<label for="dimension"><bean:message
							key="message.nouvelle_espece.dimension" /></label>
					<html:text property="dimension" />
				</div>

				<div class="pure-controls">
					<html:submit property="submit"
						styleClass="pure-button pure-button-primary">
						<bean:message key="message.login.submit" />
					</html:submit>
					<html:submit property="reset"
						styleClass="pure-button pure-button-primary">
						<bean:message key="message.login.reset" />
					</html:submit>
				</div>
			</fieldset>
		</html:form>
	</div>

</body>
</html>