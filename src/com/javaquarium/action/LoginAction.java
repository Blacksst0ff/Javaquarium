package com.javaquarium.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.javaquarium.beans.web.LoginVO;
import com.javaquarium.util.Consts;

/**
 * @author rsalot
 *
 */
public class LoginAction extends Action {
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest req,
			final HttpServletResponse res) {

		LoginVO lvo = (LoginVO) form;
		req.getSession().setAttribute(Consts.SESSION_LOGIN_USERNAME, lvo.getUsername());
		return mapping.findForward("success");

	}
}
