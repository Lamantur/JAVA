
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;

public class HW2 {
    public static void enqueue(LinkedList<String> args, String element) {
        args.addLast(element);

    }

    public static String dequeue(LinkedList<String> args) {
        String element = args.get(0);
        args.remove(0);
        return element;
    }

    public static String first(LinkedList<String> args) {
        String element = args.get(0);
        return element;
    }

    public static void main(String args[]) {
        LinkedList<String> mylist = new LinkedList<String>();
        enqueue(mylist, "1");
        System.out.println(mylist);
        enqueue(mylist, "2");
        System.out.println(mylist);
        System.out.println(dequeue(mylist));
        System.out.println(mylist);
        System.out.println(first(mylist));
        System.out.println(mylist);

    }
}