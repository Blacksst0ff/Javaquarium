package com.javaquarium.dao;

import java.util.ArrayList;
import java.util.List;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;

public interface IPoissonDAO {
	/**
	 * @param pvo
	 *            the poisson to remove
	 */
	void insertPoisson(final PoissonDO p);

	boolean poissonExist(String nom);

	List<PoissonDO> getAllPoissons();

}
