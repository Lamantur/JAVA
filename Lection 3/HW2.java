import java.util.LinkedList;
import java.util.List;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class HW2 {
    public static void main(String args[]) {
        List<Integer> mylist = randomlist(100, 0, 100);
        System.out.print(mylist);
        System.out.println("\n");
        for (int index = 0; index < mylist.size(); index++) {
            if (mylist.get(index) % 2 == 0) {
                mylist.remove(index);
                index--;
            }
        }
        System.out.print(mylist);
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
}