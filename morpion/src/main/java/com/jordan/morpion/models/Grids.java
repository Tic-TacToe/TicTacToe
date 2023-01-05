package com.jordan.morpion.models;

import java.util.Scanner;

public class Grids {

    public static void main(String[] args) {
        play();
    }

    public static int[][] createPlateau(int nbRows, int nbColumns) { // MATRICE de creation du plateau de 9 cases = 3 par 3, nbRows = nombre de lignes 3, nbColumns = nombre de colonnes 3
        int[][] tab = new int[nbRows][nbColumns];

        return tab;
    }

    public static void displayPlateau(int[][] plateau) { // affichage du plateau de jeu lignes 0-1-2, colonnes 0-1-2
        // si rien = affichage -, joueur1 = afficher X, joueur2 = afficher O
        System.out.print(" ");

        for (int cptColonne = 0; cptColonne < 3; cptColonne++) { // boucle pour afficher les n° de colonnes
            System.out.print(cptColonne + " ");
        }
        System.out.println(" ");

        for (int cptLigne = 0; cptLigne < 3; cptLigne++) { // boucle pour afficher les n° de lignes
            System.out.print(cptLigne + " ");

            for (int cptColonne = 0; cptColonne < plateau[cptLigne].length; cptColonne++) { // afficher les cases

                switch (plateau[cptLigne][cptColonne]) { // regarder la valeur dans la case pour afficher -, X, O
                    case 0: // si valeur case = 0, afficher -
                        System.out.print("- ");
                        break;
                    case 1: // si valeur case = 1, afficher X
                        System.out.print("x ");
                        break;
                    case 2:  // si valeur case = 2, afficher O
                        System.out.print("o ");
                        break;
                    default:
                        break;
                }
            }
            System.out.println();
        }
    }

    public static boolean plateauFull(int[][] plateau) {  //voir si case vide = 0
        for (int cptLigne = 0; cptLigne < plateau.length; cptLigne++) {

            for (int cptColonne = 0; cptColonne < plateau[cptLigne].length; cptColonne++) {

                if (plateau[cptLigne][cptColonne] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkPlateau(int[][] plateau, int numLigne, int numColonne) {
        boolean check = false;

        if (numLigne >= 0 && numLigne < plateau.length && numColonne >= 0 && numColonne < plateau[numLigne].length) {  // si valeur entrée est bien dans les coordonnées du tableau
            if (plateau[numLigne][numColonne] == 0) { // verifier si case plateau libre
                check = true;
            }
        }
        return check;
    }

    public static void fillCase(int[][] plateau, int numLigne, int numColonne, int numeroJoueur) {
        plateau[numLigne][numColonne] = numeroJoueur; // numeroJoueur=1 affiche X ou =2 affiche O
    }

    public static boolean equals(int entier1, int entier2, int entier3, int entier4) { //comparaison de plusieurs entiers
        boolean compare = false;

        if (entier1 == entier2 && entier2 == entier3 && entier3 == entier4) {
            compare = true;

        }
        return compare;
    }

    public static boolean win(int[][] plateau, int numJoueur) { // vérification de la condition de victoire, joueur qui a gagné
        // vérifier en Ligne
        for (int cptLignes = 0; cptLignes < plateau.length; cptLignes++) {
            if (equals(plateau[cptLignes][0], plateau[cptLignes][1], plateau[cptLignes][2], numJoueur)) { // [0][1}[2] pour les colonnes
                return true; // le joueur a gagné
            }
        }
        // vérifier en colonne
        for (int cptColonnes = 0; cptColonnes < plateau.length; cptColonnes++) {
            if (equals(plateau[0][cptColonnes], plateau[1][cptColonnes], plateau[2][cptColonnes], numJoueur)) {
                return true;
            }
        }

        // vérifier en diagonale, 2 diagonales possibles
        if (equals(plateau[0][0], plateau[1][1], plateau[2][2], numJoueur) || equals(plateau[2][0], plateau[1][1], plateau[0][2], numJoueur)) { // ||=ou
            return true;
        }

        return false; // si personne à gagné
    }

    public static void play() {
        Scanner scan = new Scanner(System.in);
        int[][] plateau = createPlateau(3, 3);
        int currentNumJoueur = 1; // le 1er joueur commence, joueur1
        boolean playing = true;
        while (playing) {
            System.out.println("************** Tour du joueur " + currentNumJoueur + " **************");

            int numLigne = -1; // initialiser les variables
            int numColonne = -1;
            boolean caseValide = false;

            while (!caseValide) { // boucle de verification des coordonnées rentrées, dans la table, dans une case vide
                displayPlateau(plateau);  // afficher le plateau

                System.out.println();
                System.out.print("Le joueur " + currentNumJoueur + " choisit une ligne : ");
                numLigne = scan.nextInt();

                System.out.print("Le joueur " + currentNumJoueur + " choisit une colonne : ");
                numColonne = scan.nextInt();
                System.out.println();

                caseValide = checkPlateau(plateau, numLigne, numColonne);
            }
            fillCase(plateau, numLigne, numColonne, currentNumJoueur);
            if (win(plateau, currentNumJoueur)) {
                displayPlateau(plateau);

                System.out.println("Le joueur" + currentNumJoueur + " a gagné");
                playing = false;
            } else if (plateauFull(plateau)) {
                displayPlateau(plateau);
                System.out.println("Égalité !");
                playing = false;
            } else {
                if (currentNumJoueur == 1) {
                    currentNumJoueur = 2;
                } else {
                    currentNumJoueur = 1;
                }
            }
        }
    }
}
