package com.javaquarium.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.business.IPoissonService;
import com.javaquarium.business.PoissonService;

/**
 * @author rsalot
 * 
 */
public class AjoutEspeceAction extends Action {

	private static final String FW_SUCCESS = "success";
	IPoissonService ips;

	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest req,
			final HttpServletResponse res) {

		final PoissonVO pvo = (PoissonVO) form;
		ips = new PoissonService();
		ips.ajouterPoisson(pvo);
		return mapping.findForward(FW_SUCCESS);

	}
}
