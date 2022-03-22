package customlist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Create MyList object with default size");

        MyList<Integer> list = new MyList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Elements : " + list);
        System.out.println("Size : " + list.size());
        System.out.println("Capacity : " + list.getCapacity());

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        System.out.println("Elements : " + list);
        System.out.println("Size : " + list.size());
        System.out.println("Capacity : " + list.getCapacity());

        System.out.println("Remove element at the second index");
        list.remove(2);
        System.out.println("Elements : " + list);


        System.out.println("--------------------");

        System.out.println("Create MyList object with custom size of 50");

        MyList<Integer> listCustomSize = new MyList<>(50);

        listCustomSize.add(8);
        listCustomSize.add(2);
        listCustomSize.add(9);
        System.out.println("Elements : " + listCustomSize);
        System.out.println("Size : " + listCustomSize.size());
        System.out.println("Capacity : " + listCustomSize.getCapacity());
        System.out.println("Get index of 9 (value) : " + listCustomSize.indexOf(9));

        System.out.println("Clear the list");
        listCustomSize.clear();

        System.out.println("After clearing the MyList object with custom size of 50");
        System.out.println("Elements :" + listCustomSize);
        System.out.println("Size : " + listCustomSize.size());
        System.out.println("Capacity : " + listCustomSize.getCapacity() + " (Capacity returns to default size of 10)" );
    }

}
