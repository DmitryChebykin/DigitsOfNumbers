import java.util.Scanner;

public class MyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число, не более чем");
        System.out.println("2147483647 :");
        int examinedNumber = scanner.nextInt();

        int i = 10;
        int allDigitsSum = 0;
        int oddDigitsSum = 0;
        int evenDigitsSum = 0;

        StringBuilder allDigitsSumString = new StringBuilder();
        StringBuilder oddDigitsSumString = new StringBuilder();
        StringBuilder evenDigitsSumString = new StringBuilder();

        boolean isLoopContinue = true;
        int iteration = 1;

        while (isLoopContinue) {
            int currentDigit;

            if (iteration == 10) {
                currentDigit = examinedNumber / 1000000000;
                isLoopContinue = false;
            } else {
                currentDigit = (examinedNumber % i) / (i / 10);

                if (!(examinedNumber > i - 1)) {
                    isLoopContinue = false;
                }
            }

            allDigitsSum += currentDigit;
            allDigitsSumString = allDigitsSumString.insert(0, " + " + currentDigit);

            if (currentDigit % 2 == 0) {
                evenDigitsSum += currentDigit;
                evenDigitsSumString = evenDigitsSumString.insert(0, " + " + currentDigit);
            } else {
                oddDigitsSum += currentDigit;
                oddDigitsSumString = oddDigitsSumString.insert(0, " + " + currentDigit);
            }

            i *= 10;
            iteration += 1;
        }

        System.out.println("Сумма всех цифр введенного числа равна:");
        allDigitsSumString.delete(0, 2).append(" = ").append(allDigitsSum);
        System.out.println(allDigitsSumString);

        System.out.println("Сумма всех четных цифр введенного числа равна:");
        evenDigitsSumString.delete(0, 2).append(" = ").append(evenDigitsSum);
        System.out.println(evenDigitsSumString);

        System.out.println("Сумма всех нечетных цифр введенного числа равна:");
        oddDigitsSumString.delete(0, 2).append(" = ").append(oddDigitsSum);
        System.out.println(oddDigitsSumString);
    }
}