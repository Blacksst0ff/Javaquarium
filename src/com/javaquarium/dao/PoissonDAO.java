package com.javaquarium.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.util.HibernateUtils;

public class PoissonDAO implements IPoissonDAO {

	@Override
	public void insertPoisson(final PoissonDO p) {
		final Session s = HibernateUtils.getSession();
		// Début de la transaction
		final Transaction t = s.beginTransaction();

		// Enregistrement de l'event
		s.save(p);

		// Fin de la transaction
		t.commit();

		// Fermeture de la session Hibernate
		s.close();
	}

	@Override
	public boolean poissonExist(String nom) {
		final Session s = HibernateUtils.getSession();
		// Début de la transaction
		final Transaction t = s.beginTransaction();
		Query q = s.createQuery("from PoissonDO where espece= :nomEspece");
		q.setString("nomEspece", nom);
		return q.uniqueResult() != null;
	}



	@Override
	public List<PoissonDO> getAllPoissons() {
		List<PoissonDO> list = null;
		PoissonDO[] pdo = null;
		final Session s = HibernateUtils.getSession();
		// Début de la transaction
		final Transaction t = s.beginTransaction();
		Query q = s.createQuery("from PoissonDO");
		list = q.list();
		return list;
	}

}
