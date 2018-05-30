package presentation;

import service.Iservice;
import service.ServiceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.CompteEpargne;
import domaine.ComptePayant;
import domaine.CompteSimple;
import domaine.Personne;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Iservice service = new ServiceImpl();
		Map<Integer, Personne> resultats = new Hashtable<Integer, Personne>();
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
		service.listePersonne(resultats);
		System.out.println("AJOUT D'UNE PERSONNE");
		Personne p = new Personne(1, "ZEC", "UNION", 20);
		Personne p2 = new Personne(2, "ZEC2", "UNION2", 22);
		
		
		// creation d'une liste de personnes
		Collection<Personne> membres = new ArrayList<Personne>();
		// creation d'un club
		Club cl1= new Club(5555, "Barcelone", membres);
		Club cl2= new Club(5554, "Alianza", membres);
		Club cl3= new Club(5553, "Man City", membres);
		// ASSOCIER UN CLUB A UNE PERSONNE
		System.out.println("AFFICHAGE MAP AVANT AJOUT CLUB");
		service.affilierClub(p2, cl1);
		service.affilierClub(p2, cl2);
		service.affilierClub(p2, cl3);
		resultats = service.createPersonne(p2);
		service.affilierClub(p, cl1);
		resultats = service.createPersonne(p);
		System.out.println("AFFICHAGE MAP APRES AJOUT CLUB");
		service.listePersonne(resultats);
		
		

	}

}
