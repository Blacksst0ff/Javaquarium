package com.javaquarium.beans.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_poisson")
public class PoissonDO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "c_id")
	private Integer id;

	@Column(name = "c_espece")
	private String espece;

	@Column(name = "c_description")
	private String description;

	@Column(name = "c_prix")
	private Integer prix;

	@Column(name = "c_couleur")
	private String couleur;

	@Column(name = "c_longueur")
	private Float longueur;

	@Column(name = "c_largeur")
	private Float largeur;

	public PoissonDO() {

	}

	// get/set

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

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
	 * @return the longueur
	 */
	public Float getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur
	 *            the longueur to set
	 */
	public void setLongueur(Float longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public Float getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur
	 *            the largeur to set
	 */
	public void setLargeur(Float largeur) {
		this.largeur = largeur;
	}

}