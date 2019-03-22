package com.company;

public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

        String[] suits = {"blue", "red", "blue"};
        int[] pointValues = {11, 12, 13};
        String[] ranks  = {"jack", "queen", "king" };
        Deck d = new Deck(ranks, suits, pointValues);


    }
}