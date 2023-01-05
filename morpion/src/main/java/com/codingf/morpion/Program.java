package com.codingf.morpion;

import com.codingf.morpion.game.Game;


public class Program {
    public static void main(String[] args) {
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
        System.out.println("Le but est simple : remplire une ligne ou une colonne ou une diagonale avec son symbole ( X ou O)");
        System.out.println("c'est le joureur X qui commence. Bonne chance!");
        game.start();



    }

}
