import java.util.Scanner;

public class BasicCalcullatorII {

    public static int calculate(String s) {
        int length = s.length();
        int currentNumber = 0;
        char operation = '+';
        int result = 0;
        int lastNumber = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            if ((!Character.isDigit(currentChar) && currentChar != ' ') || i == length - 1) {
                switch (operation) {
                    case '+':
                        result += lastNumber;
                        lastNumber = currentNumber;
                        break;
                    case '-':
                        result += lastNumber;
                        lastNumber = -currentNumber;
                        break;
                    case '*':
                        lastNumber = lastNumber * currentNumber;
                        break;
                    case '/':
                        lastNumber = lastNumber / currentNumber;
                        break;
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        result += lastNumber;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan ekspresi matematika (misal: 3+2*2):");
        String input = scanner.nextLine();

        int hasil = calculate(input);
        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}

    

