package com.javaquarium.business;

import java.util.ArrayList;
import java.util.List;

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

	List<PoissonVO> getAllPoissons();

	boolean poissonExist(String espece);

}
