import java.util.LinkedList;
import java.util.List;

public class CounterMain {

    public static void main(String[] args) throws InterruptedException {
        Counter count = new Counter();
        List<Thread> threadList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            Thread threadOne = new Thread(new CounterRunnable(1000000, count));
            threadOne.start();
        }
        for (Thread thread : threadList) {
            thread.join();
        }

        System.out.println(count.getCounter());
    }
}
