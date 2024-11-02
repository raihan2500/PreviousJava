package y2022.q7.q4;

public class c {
    public static void main(String[] args) {
        Calculator multiply = (a, b)-> (a * b);
        Calculator add = (a, b)->(a + b);
        Calculator sub = (a, b)->(a - b);

        System.out.println(multiply.operate(3, 5));
        System.out.println(add.operate(34, 5));
    }
}
