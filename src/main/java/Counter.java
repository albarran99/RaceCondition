public class Counter {
    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public synchronized void ink() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
