package com.codingf.morpion.grid;

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
        this.content =token;
    }


    //methode
    @Override
    public String toString(){
        if (this.content != null)
            return this.content.toString();
        else
            return Integer.toString(this.id);
    }
}
