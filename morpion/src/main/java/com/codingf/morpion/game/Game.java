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
        this.player1 = new Player(0 ,'O');
        this.player2 = new Player(1 ,'X');

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
        Player currentPlayer = this.player1;
        Scanner scan  = new Scanner(System.in);
        while (true){
            printGrid();

            int input = getUserInput(scan);

            this.grid.setCaseToken(input, this.currentPlayer.getToken());

            if (this.grid.getWinner() != null){
                //joueur qui gagne
                printGrid();
                System.out.println("joueur"+ this.currentPlayer.getToken() +" a gagner");
                break;
            }else if (this.grid.isFull()){
                // match nul
                printGrid();
                System.out.println("  Match nul  :/");

                break;
            }
            swapTurn();
        }
        scan.close();
    }



}
