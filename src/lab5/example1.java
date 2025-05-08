package lab5;

public class example1 {
    private char symbol;

    public void setSymbol(char newSymbol) {
        this.symbol = newSymbol;
    }

    public int getSymbolCode() {
        return (int) symbol;
    }

    public void displaySymbolAndCode() {
        System.out.println("Символ: " + symbol);
        System.out.println("Код символа: " + getSymbolCode());
    }
    public static void main(String[] args) {
        example1 handler = new example1();

        handler.setSymbol('A');

        handler.displaySymbolAndCode();

        handler.setSymbol('b');

        handler.displaySymbolAndCode();
    }
}
