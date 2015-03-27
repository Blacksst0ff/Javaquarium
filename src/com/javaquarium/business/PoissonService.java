package com.javaquarium.business;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.dao.IPoissonDAO;
import com.javaquarium.dao.PoissonDAO;

/**
 * @author rsalot
 * 
 */
public class PoissonService implements IPoissonService {

	final IPoissonDAO pdao;

	public PoissonService() {
		pdao = new PoissonDAO();
	}

	/*
	 * public ArrayList<PoissonVO> getAllPoissons() { ArrayList<PoissonVO>
	 * mes_poissons = new ArrayList<PoissonVO>(); final PoissonVO pvo = new
	 * PoissonVO(); pvo.setEspece("Nemo");
	 * pvo.setDescription("Peut respirer sous l'eau"); pvo.setCouleur("orange");
	 * pvo.setDimension("20.0 x 15.0"); pvo.setPrix(15); mes_poissons.add(pvo);
	 * return mes_poissons; }
	 */

	@Override
	public void supprimerPoisson(final PoissonVO pvo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterPoisson(final PoissonVO pvo) {
		pdao.insertPoisson(mapVOtoDO(pvo));
	}

	public PoissonDO mapVOtoDO(final PoissonVO pvo) {
		PoissonDO pdo = new PoissonDO();
		pdo.setEspece(pvo.getEspece());
		pdo.setDescription(pvo.getDescription());
		pdo.setPrix(pvo.getPrix());
		pdo.setCouleur(pvo.getCouleur());

		String[] dimension = pvo.getDimension().split("x");
		Float longueur = Float.parseFloat(dimension[0]);
		Float largeur = Float.parseFloat(dimension[1]);

		pdo.setLongueur(longueur);
		pdo.setLargeur(largeur);
		return pdo;

	}

	public PoissonVO mapDOtoVO(final PoissonDO pdo) {
		PoissonVO pvo = new PoissonVO();
		pvo.setEspece(pdo.getEspece());
		pvo.setDescription(pdo.getDescription());
		pvo.setPrix(pdo.getPrix());
		pvo.setCouleur(pdo.getCouleur());

		String largeur = pdo.getLargeur().toString();
		String longueur = pdo.getLongueur().toString();
		String dimension = largeur.concat("x").concat(longueur);
		pvo.setDimension(dimension);

		return pvo;
	}

	public boolean poissonExist(String nom) {
		return pdao.poissonExist(nom);
	}

	@Override
	public ArrayList<PoissonVO> getAllPoissons() {
		pdao.getAllPoissons(mapVOtoDO(pvo));
		return ArrayList pdao;
	}

}
