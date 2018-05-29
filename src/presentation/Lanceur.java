package presentation;

import service.Iservice;
import service.ServiceImpl;

import java.util.Hashtable;
import java.util.Map;

import domaine.Compte;
import domaine.CompteEpargne;
import domaine.ComptePayant;
import domaine.CompteSimple;
import domaine.Personne;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iservice service = new ServiceImpl();
		Map<Integer,Compte> resultatscompte = new Hashtable<Integer,Compte>(); 
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
		service.listeCompte(resultatscompte);
		System.out.println("AJOUT D'UN COMPTE");
		CompteSimple c1 = new CompteSimple(10001, 0, 1000);
		CompteEpargne c2 = new CompteEpargne(10002, 0, 0.45);
		ComptePayant c3 = new ComptePayant(10003, 0, 3);
		resultatscompte=service.createCompte(c1);
		resultatscompte=service.createCompte(c2);
		resultatscompte=service.createCompte(c3);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listeCompte(resultatscompte); 
		
		/*service.listePersonne(resultats); 
		System.out.println("AJOUT D'UNE PERSONNE");
		Personne p = new Personne(1,"ZEC","UNION",20);
		Personne p2 = new Personne(2,"ZEC2","UNION2",22);
		resultats=service.createPersonne(p);
		resultats=service.createPersonne(p2);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listePersonne(resultats); */
		
		
		
		
		
	}

}
