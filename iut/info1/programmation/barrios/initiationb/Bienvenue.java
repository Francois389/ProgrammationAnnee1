/**
 * Bienvenue.java                       22 septembre 2022
 *IUT de Rodez, pas de droit d'auteur
 */
package iut.info1.programmation.barrios.initiationb;

import java.util.Scanner;

/**
 * Premier code source en java pour découvrir
 * la structure et les conventions de code.
 * <p>
 * Souhaiter la bienvenue personalisé à l'utilisateur
 *@author François de Saint Palais
 */

public class Bienvenue{
    /**
     * Message de bienvenue sur la sortie console texte.
     *@param args inutilisé
     */
    public static void main(String[] args){
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quelle est votre nom ?");
		String nomUtilisateur = clavier.nextLine();
        final String MESSAGE_BIENVENUE = "Bienvenue dans ce premier programme java "+nomUtilisateur;
		
        System.out.println(MESSAGE_BIENVENUE);

        clavier.close();
    }
}