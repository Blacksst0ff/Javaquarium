package com.javaquarium.dao;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;

public interface IPoissonDAO {
	/**
	 * @param pvo
	 *            the poisson to remove
	 */
	void insertPoisson(final PoissonDO p);

	boolean poissonExist(String nom);

}
