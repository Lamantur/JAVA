
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class second {

    // построчное считывание файла
    public static void main(String[] args) {
        try {
            File file = new File("second.txt");
            // создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            // создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {

                System.out.println(MyParsing(line));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder MyParsing(String str) {
        String[] subStr;
        String delimeter = "\",\""; // Разделитель ","
        subStr = str.split(delimeter); // Разделения строки str с помощью метода split()

        String familia = subStr[0].replaceAll("\"фамилия\":\"", "");
        String ocenka = subStr[1].replaceAll("оценка\":\"", "");
        String discipline = subStr[2].replaceAll("предмет\":\"", "");
        StringBuilder result = new StringBuilder(
                "студент " + familia + " получил ценку: " + ocenka + " по предмету: " + discipline);
        return result;

    }

}