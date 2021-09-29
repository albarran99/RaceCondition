import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CounterMain {

    public static void main(String[] args) throws InterruptedException {
        Counter count = new Counter();
        List<Thread> threadList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            Thread threadOne = new Thread(new CounterRunnable(1000000, count));
            threadOne.start();
            threadList.add(threadOne);
        }
        for (Thread thread : threadList) {
            try {
                thread.join();

            } catch (InterruptedException e ) {
                e.printStackTrace();
            }
        }

        System.out.println("El resultado es: " + count.getCounter());
    }
}
