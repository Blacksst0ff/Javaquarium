package com.javaquarium.business;

import java.util.ArrayList;

import com.javaquarium.beans.web.PoissonVO;

/**
 * @author rsalot
 * 
 */
public interface IPoissonService {

	/**
	 * @param pvo
	 *            the poisson to remove
	 */
	void supprimerPoisson(final PoissonVO pvo);

	/**
	 * @param pvo
	 *            the poisson to add
	 */
	void ajouterPoisson(final PoissonVO pvo);

	ArrayList<PoissonVO> getAllPoissons();

	boolean poissonExist(String espece);

}
