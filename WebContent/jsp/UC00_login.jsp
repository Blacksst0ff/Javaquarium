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
<title><bean:message key="message.login.titrePage" /></title>
</head>
<body>
	<div style="margin: 50px auto; width: 400px;">
		<div style="color:red;">
			<html:errors />
		</div>
		<html:form action="/loginForm" styleClass="pure-form pure-form-aligned">
			<fieldset>
				<div class="pure-control-group">
					<label for="name"><bean:message
							key="message.login.utilisateur" /></label>
					<html:text property="username" />
				</div>

				<div class="pure-control-group">
					<label for="password"><bean:message
							key="message.login.motdepasse" /></label>
					<html:password property="password" />
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