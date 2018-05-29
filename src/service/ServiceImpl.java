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
	public void createClub() {
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
	public void readLogin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLogin(Login log) {
		// TODO Auto-generated method stub

	}

	@Override
	public void suppressionLogin() {
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

}
