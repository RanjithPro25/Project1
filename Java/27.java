import java.util.*;

class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Banana");
        list.add("Apple");
        list.add("Mango");

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println(list);
    }
}