package lab3;

public class example8 {
    public static void main(String[] args) {
        int size = 10; // Размер массива
        char[] consonants = new char[size];
        char currentLetter = 'A'; // Начинаем с 'A'
        int index = 0;

        while (index < size) {
            if (currentLetter != 'A' && currentLetter != 'E' && currentLetter != 'I' && currentLetter != 'O' && currentLetter != 'U' && currentLetter != 'Y') {
                consonants[index] = currentLetter;
                index++;
            }
            currentLetter++;
            if (currentLetter > 'Z') {
                System.out.println("Невозможно заполнить массив размером " + size + " только согласными буквами.");
                return;
            }
        }

        // Вывод массива в консоль
        System.out.println("Массив согласных:");
        for (char consonant : consonants) {
            System.out.print(consonant + " ");
        }
        System.out.println();
    }
}
