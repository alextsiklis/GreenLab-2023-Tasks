public class Number {
    private int first;
    private int second;

    public Number(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public Number() {
    }

    public void swapFunc(){
        int a = first;
        int b = second;
        // проверка на переполнение
        long A = ((long) a) + b;
        if (A > Integer.MAX_VALUE) {
            throw new RuntimeException("Overflow occured");
        } else if (A < Integer.MIN_VALUE) {
            throw new RuntimeException("Underflow occured");
        } else {
            a = a + b;
            b = b - a;
            b = -b;
            a = a - b;
        }
        first = a;
        second = b;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
