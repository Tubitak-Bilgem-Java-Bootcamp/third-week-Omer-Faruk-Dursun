package customlist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.getCapacity());

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println("--------------------");

        MyList<Integer> listCustomSize = new MyList<>(50);

        listCustomSize.add(8);
        listCustomSize.add(2);
        listCustomSize.add(15);
        listCustomSize.set(1, 9);
        System.out.println(listCustomSize);
        System.out.println(listCustomSize.size());
        System.out.println(listCustomSize.getCapacity());
        System.out.println(listCustomSize.indexOf(9));
    }

}
