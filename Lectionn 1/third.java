import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        try (Scanner number = new Scanner(System.in)) {
            System.out.print("Input number 1 : ");
            String number_1 = number.next();
            int intnum1 = Integer.parseInt(number_1);
            System.out.print("Input `* / - +` : ");
            String symbol = number.next();
            char symbol1 = symbol.charAt(0);
            System.out.print("Input number 2 : ");
            String number_2 = number.next();
            int intnum2 = Integer.parseInt(number_2);
            if (symbol1 == 43) {
                System.out.println(intnum1 + intnum2);
            } else if (symbol1 == 45) {
                System.out.println(intnum1 - intnum2);
            } else if (symbol1 == 42) {
                System.out.println(intnum1 * intnum2);
            } else if (symbol1 == 47) {
                System.out.println(intnum1 / intnum2);
            } else {
                System.out.print("Введены неверные данные, только +-/*, вы ввели: ");

                System.out.println(symbol1);

            }

        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
        }
    }
}