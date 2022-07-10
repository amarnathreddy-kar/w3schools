package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class P02_ArrayListOld {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Hello");
        al.add("World");
        al.add(123);
        al.add(true);
        al.add(123);

        System.out.println(al);


    }
}
