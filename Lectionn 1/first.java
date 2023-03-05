
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n!
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        try (Scanner number = new Scanner(System.in)) {
            System.out.print("Input number: ");
            String number_1 = number.nextLine();
            int intnum = Integer.parseInt(number_1);
            int triangle = 0;
            int faktorial = 1;
            for (int i = 1; i <= intnum; i++) {
                triangle = triangle + i;
                faktorial = faktorial * i;
            }
            System.out.println("Triangle is " + triangle);
            System.out.println("faktorial is " + faktorial);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}