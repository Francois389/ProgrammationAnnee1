/* 
 * EtatCivil.java									05/10/2022
 * IUT de Rodez, pas de droit d'auteur
 */
package iut.info1.programmation.barrios.initiationb;

import java.util.Scanner;

/**
 * Demande l'état civil de l'utilisateur
 * et l'affiche sur console texte
 * pour découvrir les entrées sur console texte
 * et la gestion de tampon d'entrée.
 * @author François de Saint Palais
 */
public class EtatCivil {
	
	/**
     * Demande le nom, le prénom, l'année de naissance
	 * et le lieu de naissance de l'utilisateur.
	 * <p>
	 * Affiche les données sous la forme :
	 * [Prénom] [Nom] ([age] ans)
	 * né(e) en [annéeNaissance] à [lieuNaissance]
	 * @param args inutilisé
	 */
	public static void main(String[] args){
		
		final int ANNEE_ACTUELLE = 2022;
		
        /* Etat civil de l'utilisateur */
		String nom;
		String prenom;
		String lieuNaissance;
		int anneeNaissance;
		
		Scanner analysateurLexicalEntree = new Scanner(System.in);
		
		String EtatCivilFormatte;
		
	    System.out.println("Quel est votre prenom ? ");
		prenom = analysateurLexicalEntree.next() + " " + analysateurLexicalEntree.nextLine().trim() ;	
		
		System.out.println("Quel est votre nom ? ");
		nom = analysateurLexicalEntree.next() + " " + analysateurLexicalEntree.nextLine().trim();
	
		System.out.println("Entrez votre annee de naissance : ");
		anneeNaissance = analysateurLexicalEntree.nextInt();
		
		System.out.println("Entrez votre lieu de naissance : ");
		lieuNaissance = analysateurLexicalEntree.next() + " " + analysateurLexicalEntree.nextLine().trim();
		
		//Affichage du resultat
		EtatCivilFormatte = prenom + " " + nom 
		                    + " (" + (ANNEE_ACTUELLE - anneeNaissance) + " ans)"
							+ "\n né(e) en " + anneeNaissance + " à " 
							+ lieuNaissance;
							
		System.out.println(EtatCivilFormatte);

		analysateurLexicalEntree.close();
	}	 
}