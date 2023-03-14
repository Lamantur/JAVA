import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;

public class HW3 {
    public static void main(String[] args) {

        try (Scanner number = new Scanner(System.in)) {

            System.out.print("Input number 1 : ");
            String number_1 = number.next();
            int intnum1 = Integer.parseInt(number_1);
            LinkedList<Integer> allresults = new LinkedList<Integer>();
            for (;;) {
                System.out.print("Input `* / - +` or r for reverse operation : ");
                String symbol = number.next();
                char symbol1 = symbol.charAt(0);
                int intnum2 = 0;
                int result = 0;
                if (symbol1 == 114) {
                    result = revers(allresults, result);
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
                } else if (symbol1 == 47) {
                    result = intnum1 / intnum2;
                }
                System.out.println(result);
                allresults.addLast(result);
                intnum1 = result;
                StringBuilder logToFile = new StringBuilder(
                        intnum1 + " " + symbol1 + " " + intnum2 + " " + " = " + result);
                logging(logToFile);
            }
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
        }

    }

    public static Integer revers(LinkedList<Integer> allresults, Integer result) {

        System.out.println("отмена операции");
        try {
            allresults.removeLast();
            result = allresults.getLast();
            allresults.removeLast();
        } catch (Throwable e) {
            System.out.println("отмена операции невозможна, т.к. это первая операция");

        }
        return result;

    }

    public static void logging(StringBuilder mas) {
        try (FileWriter writer = new FileWriter("log3.txt", true)) {

            String text = mas.toString();
            text.subSequence(0, text.length()).toString();
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Ошибка записи в logfile");
        }

    }
}
