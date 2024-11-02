package y2021.q2;

import java.util.Stack;

public class c {

    static void func(Person person, int n){
        person.name = "Hello";
        person.age = 3;
        n = 44;
    }

    public static void main(String[] args) {
        Person person = new Person("Raihan", 20);
        System.out.println(person);
        int n = 3;
        func(person, n);
        System.out.println(person);
        System.out.println(n);

        Object g = person;
        System.out.println(g);

        Stack<Integer> in = new Stack<>();
        in.add(3);
        in.add(34);
        System.out.println(in.firstElement());
    }
}
