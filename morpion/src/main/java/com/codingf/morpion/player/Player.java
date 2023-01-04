package com.codingf.morpion.player;

import com.codingf.morpion.grid.Token;
public class Player {

    //champ
    private  int id;
    private Token token;

    //constructeur

    public Player(int playerId, char c) {
        this.id = playerId;
        this.token = new Token(c, this);

    }
}
