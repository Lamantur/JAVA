import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Input : ");
        String input_string = number.nextLine();
        char A = input_string.charAt(0);
        int AA = Character.digit(A, 10);
        char B = input_string.charAt(1);
        int BB = Character.digit(B, 10);
        char C = input_string.charAt(3);
        int CC = Character.digit(C, 10);
        char D = input_string.charAt(4);
        int DD = Character.digit(D, 10);
        char E = input_string.charAt(6);
        int EE = Character.digit(E, 10);
        char F = input_string.charAt(7);
        int FF = Character.digit(F, 10);

        for (int i = 0; i < 9; i++) {
            if (A == 63) {
                AA = i;

            }
            if (B == 63) {
                BB = i;
            }
            if (C == 63) {
                CC = i;
            }
            if (D == 63) {
                DD = i;
            }
            if (E == 63) {
                EE = i;
            }
            if (F == 63) {
                FF = i;
            }
            if (10 * AA + BB + CC * 10 + DD == EE * 10 + FF) {

                System.out.print(AA);
                System.out.print(BB);
                System.out.print("+");
                System.out.print(CC);
                System.out.print(DD);
                System.out.print("=");
                System.out.print(EE);
                System.out.print(FF);
            }
        }
    }
}
