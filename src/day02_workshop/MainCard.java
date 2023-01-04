package day02_workshop;

import java.io.Console;

public class MainCard {

    public static void main(String[] args) {

        // randomly select a card
        Shape shapeOfFirstCard = new Shape();
        Symbol symbolOfFirstCard = new Symbol();
        Card firstCard = new Card(shapeOfFirstCard, symbolOfFirstCard);

        // randomly select a second card
        Shape shapeOfSecondCard = new Shape();
        Symbol symbolOfSecondCard = new Symbol();
        Card secondCard = new Card(shapeOfSecondCard, symbolOfSecondCard);

        // enter your card selection
        Console cons = System.console();
        int selection = 0;

        do {
            selection = Integer.parseInt(cons.readLine("Which card is your selection? 1 or 2? "));

            if (selection == 1) {
                if (firstCard.computeValue() < secondCard.computeValue()) {
                    System.out.printf("Your selection is %s %s versus opponent card of %s %s.\n", symbolOfFirstCard.getSymbol(), shapeOfFirstCard.getShape(), symbolOfSecondCard.getSymbol(), shapeOfSecondCard.getShape());
                    System.out.println("Too bad, you lose!");
                } else if (firstCard.computeValue() > secondCard.computeValue()) {
                    System.out.printf("Your selection is %s %s versus opponent card of %s %s.\n", symbolOfFirstCard.getSymbol(), shapeOfFirstCard.getShape(), symbolOfSecondCard.getSymbol(), shapeOfSecondCard.getShape());
                    System.out.println("Congrats, you won!");
                } else {
                    System.out.printf("Your selection is %s %s versus opponent card of %s %s.\n", symbolOfFirstCard.getSymbol(), shapeOfFirstCard.getShape(), symbolOfSecondCard.getSymbol(), shapeOfSecondCard.getShape());
                    System.out.println("It's a draw, no winner...");
                }
            }

            if (selection == 2) {
                if (firstCard.computeValue() < secondCard.computeValue()) {
                    System.out.printf("Your selection is %s %s versus opponent card of %s %s.\n", symbolOfSecondCard.getSymbol(), shapeOfSecondCard.getShape(), symbolOfFirstCard.getSymbol(), shapeOfFirstCard.getShape());
                    System.out.println("Congrats, you won!");
                } else if (firstCard.computeValue() > secondCard.computeValue()) {
                    System.out.printf("Your selection is %s %s versus opponent card of %s %s.\n", symbolOfSecondCard.getSymbol(), shapeOfSecondCard.getShape(), symbolOfFirstCard.getSymbol(), shapeOfFirstCard.getShape());
                    System.out.println("Too bad, you lose!");
                } else {
                    System.out.printf("Your selection is %s %s versus opponent's card of %s %s.\n", symbolOfSecondCard.getSymbol(), shapeOfSecondCard.getShape(), symbolOfFirstCard.getSymbol(), shapeOfFirstCard.getShape());
                    System.out.println("It's a draw, no winner...");
                }
            }

        } while(selection!=1 && selection !=2);

    }
    
}
