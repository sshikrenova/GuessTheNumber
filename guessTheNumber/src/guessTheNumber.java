import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        // Създаване на скенер за четене на потребителски вход
        Scanner scanner = new Scanner(System.in);
        // Създаване на генератор за случайни числа
        Random random = new Random();

        // Генериране на случайно число между 1 и 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean win = false;

        System.out.println("Добре дошли в играта 'Познай числото'!");
        System.out.println("Опитайте се да познаете числото между 1 и 100:");

        // Главен цикъл на играта
        while (!win) {
            // Четене на предположението на потребителя
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Моля, въведете число между 1 и 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Числото е по-голямо от " + guess + ". Опитайте отново:");
            } else if (guess > numberToGuess) {
                System.out.println("Числото е по-малко от " + guess + ". Опитайте отново:");
            } else {
                win = true;
                System.out.println("Поздравления! Познахте числото " + numberToGuess + " за " + numberOfTries + " опита.");
            }
        }

        // Затваряне на скенера
        scanner.close();
    }
}

