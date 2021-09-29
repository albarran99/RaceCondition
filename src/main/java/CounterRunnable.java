public class CounterRunnable implements Runnable{

    private int n;
    private Counter count;

    public CounterRunnable(int n, Counter count) {
        this.n = n;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0; i < n; i++) {
            count.ink();
        }
    }
}
