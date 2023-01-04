package com.codingf.morpion.grid;

public class Grid {
    //champ

    private GridCase[] cases;

    //constructor

    public Grid() {
        this.cases = new GridCase[9];

        for (int i = 0; i <this.cases.length ; i++) {
            this.cases[i] = new GridCase(i);

        }
    }

    //methode
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("┌───┬───┬───┐");
        builder.append("│ ").append(this.cases[0]).append(" │ ").append(this.cases[1]).append(" │ ").append(this.cases[2]).append(" │");
        builder.append("├───┼───┼───┤");
        builder.append("│ ").append(this.cases[3]).append(" │ ").append(this.cases[4]).append(" │ ").append(this.cases[5]).append(" │");
        builder.append("├───┼───┼───┤");
        builder.append("│ ").append(this.cases[6]).append(" │ ").append(this.cases[7]).append(" │ ").append(this.cases[8]).append(" │");
        builder.append("└───┴───┴───┘");


        //┌───┬───┬───┐
        //│ 0 │ 1 │ 2 │
        //├───┼───┼───┤
        //│ 3 │ 4 │ 5 │
        //├───┼───┼───│
        //│	6 │ 7 │ 8 │
        //└───┴───┴───┘

    }
}
