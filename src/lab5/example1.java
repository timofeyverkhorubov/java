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
        System.out.println("������: " + symbol);
        System.out.println("��� �������: " + getSymbolCode());
    }
    public static void main(String[] args) {
        example1 handler = new example1();

        handler.setSymbol('A');

        handler.displaySymbolAndCode();

        handler.setSymbol('b');

        handler.displaySymbolAndCode();
    }
}
