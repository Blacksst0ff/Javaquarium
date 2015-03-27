package com.javaquarium.beans.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * @author rsalot
 *
 */
public class LoginVO extends ActionForm {

	private static final long serialVersionUID = 3714826862135792849L;
	private String username;
	private String password;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	public ActionErrors validate(final ActionMapping mapping, final HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (getUsername() == null || getUsername().length() < 1) {
			errors.add("username", new ActionMessage("error.username.required"));
		}
		if (getPassword() == null || getPassword().length() < 1) {
			errors.add("password", new ActionMessage("error.password.required"));
		}
		if (getPassword().length() < 4) {
			errors.add("password", new ActionMessage("error.password.lenght"));
		}

		return errors;

	}

}
