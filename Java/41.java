import java.util.concurrent.*;

class CallableDemo {
    public static void main(String[] args) throws Exception {

        ExecutorService ex =
                Executors.newFixedThreadPool(2);

        Callable<Integer> c = () -> 10 + 20;

        Future<Integer> f = ex.submit(c);

        System.out.println(f.get());

        ex.shutdown();
    }
}