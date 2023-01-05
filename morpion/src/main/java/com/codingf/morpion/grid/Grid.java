package com.codingf.morpion.grid;

import com.codingf.morpion.player.Player;
import com.codingf.morpion.game.Game;


public class Grid {
    //champ

    private GridCase[] cases;


    //constructor

    public Grid() {
        this.cases = new GridCase[9];

        for (int i = 0; i <this.cases.length ; i++) {
            if (this.cases[i] == null) {
                this.cases[i] = new GridCase(i);
            }

        }
    }

    // getters setters

    private Player getTokenOwnerOf(int id){
        return this.cases[id].getTokenOwner();
    }



    public void setCaseToken(int caseId, Token token){
        this.cases[caseId].setToken(token);
    }
    // Private methode
    private Player getRowWinner(){
        Player winner = null;

        for (int row = 0; row < 3 ; ++row) {

            Player player = getTokenOwnerOf( 0 + row * 3);

            if (player == null){
                continue;
            }

            if (player.equals(getTokenOwnerOf(1 + row *3 ))){
                if (player.equals((getTokenOwnerOf(2 + row * 3)))){

                    winner = player;

                    break;
                }
            }
        }
        return winner;
    }
    private Player getColumnsWinner(){
        Player winner = null;

        for (int col = 0; col < 3 ; ++col) {

            Player player = getTokenOwnerOf( col + 0 * 3);

            if (player == null){
                continue;
            }
            if (player.equals(getTokenOwnerOf(col + 1 *3 ))){
                if (player.equals((getTokenOwnerOf(col + 2 * 3)))){
                    winner = player;

                    break;
                }
            }
        }
        return winner;
    }

    //methode

    public boolean isCaseUsed(int caseId) {
        return !this.cases[caseId].isEmpty();
    }


    public Player getWinner(){

        Player winner = null;

        //verriff ligne
        winner = getRowWinner();

        if (winner != null ){
            return winner;
        }

        //verriff colonne
        winner = getColumnsWinner();

        if (winner != null){
            return winner;
        }

        // verriff diagonale
        Player player = getTokenOwnerOf( 0);
        if (player != null && player.equals(getTokenOwnerOf(4))){
            if (player.equals((getTokenOwnerOf(8)))){
                return player;
            }
        }

        player = getTokenOwnerOf( 2);
        if (player != null && player.equals(getTokenOwnerOf(4))){
            if (player.equals((getTokenOwnerOf(6)))){
                return player;
            }
        }

        return winner;

    }
    public  boolean isFull(){
        boolean isFull = true;

        for (int i = 0; i < this.cases.length ; i++) {
            if (this.cases[i].isEmpty()){
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("╔═══╦═══╦═══╗").append(System.lineSeparator());
        builder.append("║ ").append(this.cases[0]).append(" ║ ").append(this.cases[1]).append(" ║ ").append(this.cases[2]).append(" ║").append(System.lineSeparator());
        builder.append("╠═══╬═══╬═══╣").append(System.lineSeparator());
        builder.append("║ ").append(this.cases[3]).append(" ║ ").append(this.cases[4]).append(" ║ ").append(this.cases[5]).append(" ║").append(System.lineSeparator());
        builder.append("╠═══╬═══╬═══╣").append(System.lineSeparator());
        builder.append("║ ").append(this.cases[6]).append(" ║ ").append(this.cases[7]).append(" ║ ").append(this.cases[8]).append(" ║").append(System.lineSeparator());
        builder.append("╚═══╩═══╩═══╝").append(System.lineSeparator());

        return  builder.toString();


        //┌───┬───┬───┐
        //│ 0 │ 1 │ 2 │
        //├───┼───┼───┤
        //│ 3 │ 4 │ 5 │
        //├───┼───┼───│
        //│	6 │ 7 │ 8 │
        //└───┴───┴───┘

    }
}
