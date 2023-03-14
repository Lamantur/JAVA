
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
import java.util.LinkedList;

public class HW1 {
    public static void main(String args[]) {
        LinkedList<String> mylist = new LinkedList<String>();
        mylist.add("first!");
        mylist.add("second");
        mylist.add("onemore");
        System.out.println(mylist);
        System.out.println("\n");
        System.out.println(reverselist(mylist));

    }

    public static LinkedList<String> reverselist(LinkedList<String> list) {
        LinkedList<String> result = new LinkedList<String>();
        for (int i = 0; i < list.size(); i++) {
            result.addFirst(list.get(i));
        }

        return result;
    }
}