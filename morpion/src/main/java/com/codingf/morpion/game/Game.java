package com.codingf.morpion.game;

import com.codingf.morpion.grid.Grid;
import com.codingf.morpion.io.Input;
import com.codingf.morpion.player.Player;

import java.util.Scanner;

public class Game {
    //champ
    private Grid grid;
    private Player player1;
    private Player player2;
    private Player currentPlayer;



    //constructeur

    public Game() {
        this.grid = new Grid();
        this.player1 = new Player(0 ,'X');
        this.player2 = new Player(1 ,'O');

    }



    // methode privé
    private void swapTurn(){
        if (this.currentPlayer.equals(this.player1)){
            this.currentPlayer = this.player2;

        }else {
            this.currentPlayer = this.player1;
        }
    }

    private int getUserInput(Scanner scan){
        int input = -1;
        while (true){
            System.out.println("Joueur " + this.currentPlayer.getToken() + " a ton tour");


            input = Input.readInt(scan);



            if (0 <= input && input<= 8){
                break;
            }

        }
        return input;

    }

    //methode

    private void printGrid(){
        System.out.flush();
        System.out.println(this.grid);
    }

    public void start(){
        currentPlayer = this.player1;
        Scanner scan  = new Scanner(System.in);
        while (true){
            printGrid();

            int input = getUserInput(scan);

            if (!grid.isCaseUsed(input)) {
                // Marque la case avec le jeton du joueur
                this.grid.setCaseToken(input, this.currentPlayer.getToken());
            } else {
                // La case a déjà été jouée, on demande au joueur de choisir une autre case
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("La case est deja prise !");

                continue;
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();






            if (this.grid.getWinner() != null){
                //joueur qui gagne
                printGrid();
                if (this.currentPlayer.getToken() == this.player1.getToken()){
                    System.out.print("                                                                 \n" +
                            "                                                                 \n" +
                            "                                                                 \n" +
                            "                                                                 \n" +
                            "                                                                 \n");
                    System.out.println("=============================================================================================================================================================");
                    System.out.println("                             _          _                                __   __             _         \n" +
                            "                            | |        (_)                               \\ \\ / /            (_)        \n" +
                            "                            | | ___     _  ___  _   _  ___ _   _ _ __     \\ V /    __      ___ _ __    \n" +
                            "                            | |/ _ \\   | |/ _ \\| | | |/ _ \\ | | | '__|     > <     \\ \\ /\\ / / | '_ \\   \n" +
                            "                            | |  __/   | | (_) | |_| |  __/ |_| | |       / . \\     \\ V  V /| | | | |  \n" +
                            "                            |_|\\___|   | |\\___/ \\__,_|\\___|\\__,_|_|      /_/ \\_\\     \\_/\\_/ |_|_| |_|  \n" +
                            "                                      _/ |                                                             \n" +
                            "                                     |__/                                                              ");
                    System.out.println("=============================================================================================================================================================");

                }else {
                    System.out.println("=============================================================================================================================================================");

                    System.out.println("                             _          _                                  ____               _         \n" +
                            "                            | |        (_)                                / __ \\             (_)        \n" +
                            "                            | | ___     _  ___  _   _  ___ _   _ _ __    | |  | |   __      ___ _ __    \n" +
                            "                            | |/ _ \\   | |/ _ \\| | | |/ _ \\ | | | '__|   | |  | |   \\ \\ /\\ / / | '_ \\   \n" +
                            "                            | |  __/   | | (_) | |_| |  __/ |_| | |      | |__| |    \\ V  V /| | | | |  \n" +
                            "                            |_|\\___|   | |\\___/ \\__,_|\\___|\\__,_|_|       \\____/      \\_/\\_/ |_|_| |_|  \n" +
                            "                                      _/ |                                                              \n" +
                            "                                     |__/                                                               ");
                }
                System.out.println("=============================================================================================================================================================");


                break;
            }else if (this.grid.isFull()){
                // match nul
                printGrid();
                System.out.println("=============================================================================================================================================================");

                System.out.println("                                        _       _                     _   \n" +
                        "                                       | |     | |                   | |  \n" +
                        "                        _ __ ___   __ _| |_ ___| |__      _ __  _   _| |  \n" +
                        "                       | '_ ` _ \\ / _` | __/ __| '_ \\    | '_ \\| | | | |  \n" +
                        "                       | | | | | | (_| | || (__| | | |   | | | | |_| | |  \n" +
                        "                       |_| |_| |_|\\__,_|\\__\\___|_| |_|   |_| |_|\\__,_|_|  \n" +
                        "                                                                          \n" +
                        "                                                                          ");
                System.out.println("=============================================================================================================================================================");


                break;
            }
            Scanner scanner = new Scanner(System.in);

            while (true) {
                // Joue une partie

                // Demande au joueur s'il souhaite rejouer
                System.out.print("Voulez-vous rejouer ? (o/n) ");
                String answer = scanner.nextLine();

                if (answer.equals("n")) {
                    // Le joueur ne souhaite pas rejouer, on sort de la boucle
                    break;
                } else if (!answer.equals("o")) {
                    // La réponse du joueur n'est pas valide, on recommence
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

            scanner.close();

            swapTurn();
        }
        scan.close();
    }




}
