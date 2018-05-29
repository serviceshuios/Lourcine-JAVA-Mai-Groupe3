package service;

import java.util.Hashtable;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public class ServiceImpl implements Iservice {

	// DECLARER ET INITIALISER LA LISTE DES PERSONNES
	private Map<Integer, Personne> personnes = new Hashtable<Integer, Personne>();
	private Map<Integer, Compte> comptes = new Hashtable<Integer, Compte>();

	public Map<Integer, Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Map<Integer, Compte> comptes) {
		this.comptes = comptes;
	}

	public Map<Integer, Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Map<Integer, Personne> personnes) {
		this.personnes = personnes;
	}

	@Override
	public void readPersonne(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersonne(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void affilierClub(Personne p, Club c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attribuerCompte(Personne p, Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void crediterCompte(Compte c, double montant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debiterCompte(Compte c, double montant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createTitulaire(Compte c, Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readCompte() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTitulaire(Compte c, Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCompte(Compte c) {
		// TODO Auto-generated method stub

	}


	@Override
	public void readClub(Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readClubs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterMembreClub(Personne p, Club c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listeDeClubParUtilisateur(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteClub(Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClubName(String nom, Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createLogin() {
		// TODO Auto-generated method stub

	}



	@Override
	public void updateLogin(Login log) {
		// TODO Auto-generated method stub

	}


	@Override
	public Map<Integer, Personne> createPersonne(Personne p) {
		// TODO Auto-generated method stub
		personnes.put(p.getPersonneId(), p);
		return personnes;

	}

	@Override
	public void listePersonne(Map<Integer, Personne> personnes) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, Personne> entry : personnes.entrySet()) {
			System.out.println(entry.getValue().getNom());
		}
		
	}

	@Override
	public void updateCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createClub(Club club) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClub(Club club) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createLogin(Login log) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readLogin(Login log) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLogin(Login log) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, Compte> createCompte(Compte c) {
		// TODO Auto-generated method stub 
		comptes.put(c.getIdCompte(), c);
		return comptes;
	}

	@Override
	public void listeCompte(Map<Integer, Compte> comptes) {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, Compte> compte : comptes.entrySet())
			System.out.println(compte);
		
	}

}
