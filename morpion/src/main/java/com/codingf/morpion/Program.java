package com.codingf.morpion;

import com.codingf.morpion.game.Game;

import java.sql.SQLOutput;


public class Program {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // point d'entrée

        Game game = new Game();
        System.out.println("===========================================================================================================================================================");
        System.out.println("║                                     _______         ______              ______                                                                          ║\n" +
                "║                                    /_  __(_)____   /_  __/___ ______   /_  __/___  ___                                                                  ║\n" +
                "║                                     / / / / ___/    / / / __ `/ ___/    / / / __ \\/ _ \\                                                                 ║\n" +
                "║                                    / / / / /__     / / / /_/ / /__     / / / /_/ /  __/                                                                 ║\n" +
                "║                                   /_/ /_/\\___/    /_/  \\__,_/\\___/    /_/  \\____/\\___/                                                                  ║\n" +
                "║                                                                                                                                                         ║");
        System.out.println("===========================================================================================================================================================");

        System.out.println("Bonjour et bienvenue dans le fameux jeu Tic Tac Toe (ou Morpion pour les intimes).");
        System.out.println("Le but est simple : remplir une ligne ou une colonne ou une diagonale avec son symbole ( X  ou  O ).\n");
        System.out.println("Vous pouvez quitter le jeu à tout moment en tapant le chiffre 10.\n");
        System.out.println("C'est le joueur X qui commence. Bonne chance !");
        System.out.println("                             \n" +
                "                             \n" +
                "                             \n" +
                "                             \n" +
                "                             \n" +
                "                             \n" +
                "                             \n" +
                "                             ");
        game.start();



    }

}