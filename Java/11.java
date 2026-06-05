import java.util.*;

class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 50; // fixed number
        int guess;

        do {
            guess = sc.nextInt();

            if(guess > num)
                System.out.println("Too High");
            else if(guess < num)
                System.out.println("Too Low");

        } while(guess != num);

        System.out.println("Correct");
    }
}