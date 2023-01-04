package day02_workshop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Card {

    private Shape shape;
    private Symbol symbol;

    public Card(Shape shape, Symbol symbol) {
        this.shape = shape;
        this.symbol = symbol;
    }

    public Shape getShape() {
        return shape;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public int computeValue() {
        return shape.getRank() * symbol.getValue();
    }

}

class Shape {

    private String shape;

    public Shape() {
        List<String> shapeList = Arrays.asList("DIAMOND", "CLUB", "HEART", "SPADE");
        Random rand = new Random();
        int randomIndex = rand.nextInt(0, 4);

        this.shape = shapeList.get(randomIndex);
    }

    public Shape(String shape) {
        
        if (shape.matches("DIAMOND|CLUB|HEART|SPADE")) {
            this.shape = shape;
        }
    }

    public String getShape() {
        return shape;
    }

    public int getRank() {

        Map<String, Integer> shapeMap = new HashMap<>();
        shapeMap.put("DIAMOND", 1);
        shapeMap.put("CLUB", 2);
        shapeMap.put("HEART", 3);
        shapeMap.put("SPADE", 4);

        return shapeMap.get(this.shape);

    }

}

class Symbol {

    private String symbol;

    public Symbol() {
        List<String> symbolList = Arrays.asList("ACE", "TWO", "THREE", "FOUR", "FIVE",
                                                    "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
                                                    "JACK", "QUEEN", "KING");
        Random rand = new Random();
        int randomNumber = rand.nextInt(0, 13);

        this.symbol = symbolList.get(randomNumber);
    }

    public Symbol(String symbol) {
        if (symbol.matches("ACE|TWO|THREE|FOUR|FIVE|SIX|SEVEN|EIGHT|NINE|TEN|JACK|QUEEN|KING")) {
            this.symbol = symbol;
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        int value;
        
        switch(this.symbol) {
            case "ACE" : 
                value = 1;
                break;
            case "TWO" : 
                value = 2;
                break;
            case "THREE" :
                value = 3;
                break;
            case "FOUR" :
                value = 4;
                break;
            case "FIVE" :
                value = 5;
                break;
            case "SIX" :
                value = 6;
                break;
            case "SEVEN" :
                value = 7;
                break;
            case "EIGHT" :
                value = 8;
                break;
            case "NINE" :
                value = 9;
                break;
            case "TEN" :
                value = 10;
                break;
            case "JACK" :
                value = 11;
                break;
            case "QUEEN" :
                value = 12;
                break;
            case "KING" :
                value = 13;
                break;
            default : 
                value = 0;
                break;
        }

        return value;
    }

}