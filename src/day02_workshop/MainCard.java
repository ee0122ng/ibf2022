package day02_workshop;

public class MainCard {

    public static void main(String[] args) {

        // randomly select a card
        Shape shapeOfFirstCard = new Shape();
        Symbol numOfFirstCard = new Symbol();

        System.out.printf("The first card selected is a %d %s.\n", numOfFirstCard.getSymbol(), shapeOfFirstCard.getShape());

        Card firstCard = new Card(shapeOfFirstCard, numOfFirstCard);
        System.out.printf("Net value of first card = %d\n", firstCard.computeValue());

        // randomly select a second card
        Shape shapeOfSecondCard = new Shape();
        Symbol numOfSecondCard = new Symbol();

        System.out.printf("The second card selected is a %d %s.\n", numOfFirstCard.getSymbol(), shapeOfFirstCard.getShape());

        Card secondCard = new Card(shapeOfSecondCard, numOfSecondCard);
        System.out.printf("Net value of first card = %d\n", secondCard.computeValue());


    }
    
}
