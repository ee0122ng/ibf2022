package day02_workshop;

import java.util.List;
import java.util.Random;
import java.security.SecureRandom;
import java.util.LinkedList;

public class DeckLecSolution {

    private List<CardLecSolution> deck;

    public DeckLecSolution() {
        this.deck = new LinkedList<>();
        for (int i = 0; i < Constant.SUITS.length; i++) {
            String suit = Constant.SUITS[i];
            for (int j = 0; j < Constant.VALUES.length; j++) {
                Integer value = Constant.VALUES[j];
                String name = Constant.NAMES[j];
                CardLecSolution card = new CardLecSolution(suit, value, name);
                deck.add(card);
            }
        }
        // System.out.println("The new deck");
        // System.out.println(deck);       // invoke the toString from CardLecSolution class, since deck is a type of CardLecSolution 
    }

    public void shuffle() {

        Random rand = new SecureRandom();

        for (int curr = 0; curr < deck.size(); curr++) {

            int toSwap = rand.nextInt(deck.size());
            CardLecSolution c = deck.get(curr);
            CardLecSolution d = deck.get(toSwap);
            deck.set(curr, d);
            deck.set(toSwap, c);

        }
    }

    @Override
    public String toString() {
        return "Deck [deck=" + deck + "]";
    }
    
}
