/*
 * Calcul des notes des candidats au patinage artistique
 * fichier Patinage.java                                            12/22
 */
package iut.info1.programmation.serviere.iteration3s;

import java.util.Scanner;

/**
 * Calcul des notes obtenues au patinage artistique. La note d'un candidat est
 * égale à  : 
 *   (somme des notes - note minimale - note maximale ) / (nombre notes - 2) 
 * Le programme permet de gérer NB_CANDIDAT candidats notés par NB_JUGE juges.
 * La saisie d'une note est recommencée en cas d'erreur.
 * @author INFO1
 * @version 1.0
 */
public class Patinage {

    /**
     * Fonction principale
     * @param args   argument non utilisé
     */
    public static void main(String[] args) {

        final int NB_JUGE = 5;          // nombre de juges
        final int NB_CANDIDAT = 2;      // nombre de candidats
        final int NOTE_MAXI = 20;       // note maximale pour un candidat
        final int NOTE_MINI = 0;        // note minimale pour un candidat

        // déclaration d'un objet de type Scanner pour les saisies
        Scanner analyseurEntree = new Scanner(System.in);

        int sommeNoteJuge,
            noteJuge,
            maxNoteJuge,
            minNoteJuge;
        
        float noteFinale;

        boolean saisieOk;
        
        // TODO : compléter
        System.out.println("La note d'un candidat est un entier compris entre 0 et 20.");
        for (int i = 1; i <= NB_CANDIDAT; i++) {
            sommeNoteJuge = 0;
            minNoteJuge = 20;
            maxNoteJuge = 0;
            noteJuge = 0;
            System.out.printf("Saisie des notes pour le candidat numero %d : \n",i);
            System.out.println("--------------------------------------------\n");

            for (int j = 1; j <= NB_JUGE; j++) {
                //TODO gestion erreur
                do {
                    System.out.printf("Note du juge %d ? ",j);
                    saisieOk = analyseurEntree.hasNextInt();
                    if (saisieOk) {
                        noteJuge = analyseurEntree.nextInt();
                        if (noteJuge < NOTE_MINI || NOTE_MAXI < noteJuge) {
                            System.out.println("Erreur de saisie ! La note est comprise entre 0 et 20.");
                            saisieOk = false;
                        }
                    } else {
                        System.out.println("Erreur de saisie ! Donnez un entier !");
                        analyseurEntree.next();
                        analyseurEntree.nextLine();
                    }
                } while (!saisieOk);
                analyseurEntree.close();

                sommeNoteJuge += noteJuge;
                if (noteJuge < minNoteJuge) {
                    minNoteJuge = noteJuge;
                }
                if (maxNoteJuge < noteJuge) {
                    maxNoteJuge = noteJuge;
                }
            }
            noteFinale = (sommeNoteJuge - minNoteJuge - maxNoteJuge)
                         / (NB_JUGE - 2);
            System.out.printf("La note du candidat %d est %.2f\n\n\n",i,noteFinale);
        }
    }
}
