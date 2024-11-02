package y2022.q7;

public class Pair <T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void setSecond(T2 second) {

        this.second = second;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair(1234, "Raihan");
        System.out.println(pair);
    }
}
