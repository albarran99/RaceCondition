public class Counter {
    private int counter;

    public Counter() {
        this.counter = 0;
    }

    private void ink() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
