package lab5;

public class example2 {
    private char startChar;
    private char endChar;

    public example2(char startChar, char endChar) {
        this.startChar = startChar;
        this.endChar = endChar;
    }

    public void printCharacterRange() {
        if (startChar > endChar) {
            System.out.println("��������� ������ ������ ���� ������ ��� ����� ��������� �������.");
            return;
        }

        for (char c = startChar; c <= endChar; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        example2 range1 = new example2('A', 'D');
        System.out.println("������� � ��������� A-D:");
        range1.printCharacterRange();

        example2 range2 = new example2('F', 'J');
        System.out.println("������� � ��������� F-J:");
        range2.printCharacterRange();

        example2 range3 = new example2('P', 'T');
        System.out.println("������� � ��������� P-T:");
        range3.printCharacterRange();
    }
}
