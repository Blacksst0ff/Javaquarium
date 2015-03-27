package com.javaquarium.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.javaquarium.business.IPoissonService;
import com.javaquarium.business.PoissonService;
import com.javaquarium.util.Consts;

/**
 * @author rsalot
 *
 */
public class ListerEspeceAction extends Action {

	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest req,
			final HttpServletResponse res) {
		
		IPoissonService ps = new PoissonService();
		req.getSession().setAttribute(Consts.SESSION_MES_POISSONS_LIST, ps.getAllPoissons());
		return mapping.findForward("bienvenue");

	}
}
