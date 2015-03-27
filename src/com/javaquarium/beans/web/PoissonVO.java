package com.javaquarium.beans.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.javaquarium.business.IPoissonService;
import com.javaquarium.business.PoissonService;

/**
 * @author rsalot
 * 
 */
public class PoissonVO extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 202103811891905129L;
	private Integer code;
	private String espece;
	private String description;
	private String couleur;
	private String dimension;
	private Integer prix;

	/**
	 * @return the espece
	 */
	public String getEspece() {
		return espece;
	}

	/**
	 * @param espece
	 *            the espece to set
	 */
	public void setEspece(String espece) {
		this.espece = espece;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur
	 *            the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the dimension
	 */
	public String getDimension() {
		return dimension;
	}

	/**
	 * @param dimension
	 *            the dimension to set
	 */
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return the prix
	 */
	public Integer getPrix() {
		return prix;
	}

	/**
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	/*
	 * @see
	 * org.apache.struts.action.ActionForm#validate(org.apache.struts.action
	 * .ActionMapping, javax.servlet.http.HttpServletRequest)
	 */
	public ActionErrors validate(final ActionMapping mapping, final HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (getEspece() == null || getEspece().length() < 1) {
			errors.add("espece", new ActionMessage("error.espece.required"));
		}
		if (getPrix() == null) {
			errors.add("prix", new ActionMessage("error.prix.required"));
		}
		if (getDimension().contains("x") == false) {
			errors.add("dimension1x1", new ActionMessage("error.dimension.format"));
		}

		if (getDimension() == null || getDimension().length() < 1) {
			errors.add("dimension", new ActionMessage("error.dimension.required"));
		}

		final IPoissonService ps = new PoissonService();

		if (ps.poissonExist(getEspece())) {
			errors.add("especeexist", new ActionMessage("error.espece.exist"));
		}
		return errors;

	}

}
