package com.codingf.morpion.grid;

import com.codingf.morpion.player.Player;

public class Token {
    //champ
    private char tokenChar;
    private Player owner;

    //constructor

    public Token(char c, Player player) {
        this.tokenChar = c;
        this.owner = player;

    }


    //methode
    @Override
    public String toString(){
        return Character.toString(this.tokenChar);
    }
}
