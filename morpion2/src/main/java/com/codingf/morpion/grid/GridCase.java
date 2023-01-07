package com.codingf.morpion.grid;

import com.codingf.morpion.player.Player;

public class GridCase {
    //champ
    private int id;
    private Token content;

    //constructor

    public GridCase(int caseId) {
        this.id = caseId;
        this.content = null;
    }

    public GridCase(int caseId, Token token){
        this.id = caseId;
        this.content = token;
    }
    // pseudo getters  setters
    public void  setToken(Token token){

        this.content= token;
    }
    public Player getTokenOwner(){
        if (this.content != null) {
            return this.content.getOwner();
        }
        else{
            return null;
        }
    }


    //methode

    public boolean isEmpty(){
        return this.content == null;


    }
    @Override
    public String toString(){
        if (this.content != null)
            return this.content.toString();
        else
            return Integer.toString(this.id);
    }
}
