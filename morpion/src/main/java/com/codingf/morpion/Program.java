package com.codingf.morpion;

import com.codingf.morpion.game.Game;


public class Program {
    public static void main(String[] args) {
        // point d'entrée

        Game game = new Game();

        game.start();

        System.out.println(" ==== end ====");
    }

}
