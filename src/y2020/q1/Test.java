package y2020.q1;

import java.awt.*;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {

        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println("Before: " + box.getWidth());

        box.translate(25, 40);
        System.out.println("After: " + box.getWidth());

        Vector<String> v = new Vector<String>(103);
        v.add("Raihan");
        v.add("Ahmed");
        System.out.println(v.size());
        for(var i : v) System.out.println(i);

        StringBuffer str = new StringBuffer("Raihan");
        System.out.println(str);
        str.deleteCharAt(3);
        str.reverse();
        System.out.println(str);

        String st = "hello";
        int ind = 2;
        String temp = st.substring(0, ind - 1) + st.substring(ind, st.length());
        System.out.println(temp);

        String stars = "*****";
        String strips = "=====";
        for(int i = 0; i < 5; i++){
            System.out.print(stars.substring(0,i));
            System.out.println(strips.substring(i, 5));
        }

    }
}
