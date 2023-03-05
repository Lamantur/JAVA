//Вывести все простые числа от 1 до 1000
public class second {
    public static void main(String[] args) {
        for (int index = 1; index <= 1000; index++) {
            int a = 0;
            for (int i = 2; i <= index; i++) {

                if (index % i == 0 && index != i) {
                    a++;
                }
            }
            if (a == 0) {
                System.out.print(index);
                System.out.print(" | ");
            }

        }

    }
}
