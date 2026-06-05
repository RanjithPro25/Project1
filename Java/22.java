import java.io.*;
import java.util.*;

class FileWriteDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        FileWriter fw = new FileWriter("output.txt");
        fw.write(data);
        fw.close();

        System.out.println("Data written");
    }
}