package lambda;

import java.util.ArrayList;

public class AbstractClass {
    public static void main(String[] args) {
        ArrayList list = new ArrayList() {
            @Override
            public boolean add(Object o) {
                System.out.println("Add a new element to list: " + o);
                return super.add(o);
            }
        };
        list.add(100500);
    }
}
