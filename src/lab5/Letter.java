package lab5;

public class Letter {

    private char symbol; // A, a

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "" + symbol;
//        return Character.toString(symbol);
    }
}