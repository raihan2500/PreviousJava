package y2022.q7.q6;

import java.util.LinkedList;
import java.util.ListIterator;

public class c {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        ListIterator<String> iterator = staff.listIterator();

        iterator.add("Tom");
        iterator.add("Diana");
        iterator.add("Harry");
        iterator = staff.listIterator();
        if(iterator.next().equals("Tom")){
            iterator.remove();
        }

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
