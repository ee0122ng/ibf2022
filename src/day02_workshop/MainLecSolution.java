package day02_workshop;

public class MainLecSolution {

    public static void main(String[] args) {
        
        // DeckLecSolution deck = new DeckLecSolution();

        DeckLecSolution deck = new DeckLecSolution();
        System.out.printf(">> before : %s\n", deck);

        deck.shuffle();

        System.out.println();
        System.out.printf(">> after : %s\n", deck);

    }
    
}
