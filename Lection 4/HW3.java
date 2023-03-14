import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class HW3 {
    public static void main(String[] args) {

        try (Scanner number = new Scanner(System.in)) {

            System.out.print("Input number 1 : ");
            String number_1 = number.next();

            int intnum1 = Integer.parseInt(number_1);
            int oldresult = 0;
            for (;;) {

                System.out.print("Input `* / - +` or r for reverse operation : ");
                String symbol = number.next();
                char symbol1 = symbol.charAt(0);
                int intnum2 = 0;
                int result = 0;

                if (symbol1 == 114) {
                    System.out.println("отмена операции");

                    result = oldresult;
                } else {
                    System.out.print("Input number 2 : ");
                    String number_2 = number.next();
                    intnum2 = Integer.parseInt(number_2);
                }

                if (symbol1 == 43) {
                    result = intnum1 + intnum2;

                } else if (symbol1 == 45) {
                    result = intnum1 - intnum2;

                } else if (symbol1 == 42) {
                    result = intnum1 * intnum2;

                    intnum1 = result;
                } else if (symbol1 == 47) {
                    result = intnum1 / intnum2;

                }
                System.out.println(result);
                oldresult = intnum1;
                intnum1 = result;

                try (FileWriter writer = new FileWriter("log3.txt", true)) {

                    StringBuilder mas = new StringBuilder(
                            intnum1 + " " + symbol1 + " " + intnum2 + " " + " = " + result);
                    String text = mas.toString();
                    text.subSequence(0, text.length()).toString();
                    writer.write(text);
                    writer.append('\n');
                    writer.flush();
                } catch (IOException ex) {
                    System.out.println("Ошибка записи в logfile");
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
        }

    }
}
