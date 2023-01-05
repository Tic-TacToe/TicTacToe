package com.codingf.morpion;

import com.codingf.morpion.game.Game;


public class Program {
    public static void main(String[] args) {
        // point d'entrée

        Game game = new Game();

        System.out.println("                                                                                                                                                                                \n" +
                "                                                                                                                                                                                \n" +
                "TTTTTTTTTTTTTTTTTTTTTTT  iiii                           TTTTTTTTTTTTTTTTTTTTTTT                                        TTTTTTTTTTTTTTTTTTTTTTT                                  \n" +
                "T:::::::::::::::::::::T i::::i                          T:::::::::::::::::::::T                                        T:::::::::::::::::::::T                                  \n" +
                "T:::::::::::::::::::::T  iiii                           T:::::::::::::::::::::T                                        T:::::::::::::::::::::T                                  \n" +
                "T:::::TT:::::::TT:::::T                                 T:::::TT:::::::TT:::::T                                        T:::::TT:::::::TT:::::T                                  \n" +
                "TTTTTT  T:::::T  TTTTTTiiiiiii     cccccccccccccccc     TTTTTT  T:::::T  TTTTTTaaaaaaaaaaaaa      cccccccccccccccc     TTTTTT  T:::::T  TTTTTTooooooooooo       eeeeeeeeeeee    \n" +
                "        T:::::T        i:::::i   cc:::::::::::::::c             T:::::T        a::::::::::::a   cc:::::::::::::::c             T:::::T      oo:::::::::::oo   ee::::::::::::ee  \n" +
                "        T:::::T         i::::i  c:::::::::::::::::c             T:::::T        aaaaaaaaa:::::a c:::::::::::::::::c             T:::::T     o:::::::::::::::o e::::::eeeee:::::ee\n" +
                "        T:::::T         i::::i c:::::::cccccc:::::c             T:::::T                 a::::ac:::::::cccccc:::::c             T:::::T     o:::::ooooo:::::oe::::::e     e:::::e\n" +
                "        T:::::T         i::::i c::::::c     ccccccc             T:::::T          aaaaaaa:::::ac::::::c     ccccccc             T:::::T     o::::o     o::::oe:::::::eeeee::::::e\n" +
                "        T:::::T         i::::i c:::::c                          T:::::T        aa::::::::::::ac:::::c                          T:::::T     o::::o     o::::oe:::::::::::::::::e \n" +
                "        T:::::T         i::::i c:::::c                          T:::::T       a::::aaaa::::::ac:::::c                          T:::::T     o::::o     o::::oe::::::eeeeeeeeeee  \n" +
                "        T:::::T         i::::i c::::::c     ccccccc             T:::::T      a::::a    a:::::ac::::::c     ccccccc             T:::::T     o::::o     o::::oe:::::::e           \n" +
                "      TT:::::::TT      i::::::ic:::::::cccccc:::::c           TT:::::::TT    a::::a    a:::::ac:::::::cccccc:::::c           TT:::::::TT   o:::::ooooo:::::oe::::::::e          \n" +
                "      T:::::::::T      i::::::i c:::::::::::::::::c           T:::::::::T    a:::::aaaa::::::a c:::::::::::::::::c           T:::::::::T   o:::::::::::::::o e::::::::eeeeeeee  \n" +
                "      T:::::::::T      i::::::i  cc:::::::::::::::c           T:::::::::T     a::::::::::aa:::a cc:::::::::::::::c           T:::::::::T    oo:::::::::::oo   ee:::::::::::::e  \n" +
                "      TTTTTTTTTTT      iiiiiiii    cccccccccccccccc           TTTTTTTTTTT      aaaaaaaaaa  aaaa   cccccccccccccccc           TTTTTTTTTTT      ooooooooooo       eeeeeeeeeeeeee  \n" +
                "                                                                                                                                                                                \n" +
                "                                                                                                                                                                                \n" +
                "                                                                                                                                                                                \n" +
                "                                                                                                                                                                                \n" +
                "                                                                                                                                                                                \n" +
                "                                                                                                                                                                                \n" +
                "                                                                                                                                                                                ");
        System.out.println("Le but est simple : remplire une ligne ou une colonne ou une diagonale avec son symbole ( X ou O");
        game.start();



    }

}
