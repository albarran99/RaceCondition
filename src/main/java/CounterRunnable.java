public class CounterRunnable implements Runnable{

    private int n;
    private int count;

    @Override
    public void run() {
        for(int i = 0; i < n; i++) {
            System.out.println(count);
        }
    }
}
