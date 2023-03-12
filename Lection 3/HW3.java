import java.util.LinkedList;
import java.util.List;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class HW3 {
    public static void main(String args[]) {
        List<Integer> ArrayList = randomlist(100, 0, 100);
        System.out.println("Сам массив:");
        System.out.println(ArrayList);
        System.out.print("минимальное: ");
        System.out.println(minOfList(ArrayList));
        System.out.print("максимальное: ");
        System.out.println(maxOfList(ArrayList));
        System.out.print("среднее арифметическое: ");
        System.out.println(averageOfList(ArrayList));

    }

    // генератор списка с указанием размера, максимума и минимума
    public static List<Integer> randomlist(int size, int min, int max) {
        List<Integer> mylist = new LinkedList<>();
        for (int index = 0; index < size; index++) {
            int a = (int) (Math.random() * (max * 2 + 1)) - min;
            mylist.add(a);
        }
        return mylist;
    }

    // максимальный элемент
    public static int maxOfList(List<Integer> list) {
        int max = list.get(0);
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) > max) {
                max = list.get(index);
            }
        }
        return max;
    }

    // минимальный элемент
    public static int minOfList(List<Integer> list) {
        int min = list.get(0);
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) < min) {
                min = list.get(index);
            }
        }
        return min;
    }

    // среднее арифметическое
    public static int averageOfList(List<Integer> list) {
        int average = 0;
        for (int index = 0; index < list.size(); index++) {
            average = average + list.get(index);
        }
        return average / list.size();
    }

}