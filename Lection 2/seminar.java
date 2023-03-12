import java.io.*;
import java.util.Arrays;

public class seminar {

    public static void main(String[] args) {
        int[] mas = { 11, 3, 14, 16, 7, 56, 8, 1, 22 };

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                    try (FileWriter writer = new FileWriter("log.txt", true)) {

                        String text = Arrays.toString(mas);
                        writer.write(text);

                        writer.append('\n');
                        writer.flush();
                    } catch (IOException ex) {

                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }

}