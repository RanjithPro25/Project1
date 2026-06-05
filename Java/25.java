import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Alice");
        map.put(2, "Bob");

        int id = sc.nextInt();
        System.out.println(map.get(id));
    }
}