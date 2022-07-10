package arraylist;

import java.util.ArrayList;

public class P01_ArrayListBasics {

    public static void main(String[] args) {
        //Create an ArrayList object called cars that will store strings
        ArrayList<String> cars = new ArrayList<String>();

        System.out.println(cars);

        //to add elements to the ArrayList, use the add() method:
        cars.add("Tiago");
        cars.add("Mahindra XUV500");
        cars.add("BMW 520D");
        cars.add("Ford Figo");
        cars.add("Hyundai I20 Active");

        System.out.println(cars);

        //use the get() method and refer to the index number:
        System.out.println("First elements of cars list: "+cars.get(0));

        //To modify an element, use the set() method and refer to the index number:
        System.out.println(cars.set(4,"Mahinder THAR"));
        System.out.println("After update: "+cars);

        //To find out how many elements an ArrayList have, use the size method:
        System.out.println("Total Elements in the list: "+cars.size());

        //To remove an element, use the remove() method and refer to the index number:
        cars.remove(cars.size()-2);
        System.out.println("After removing last but one element: "+cars);

        //To remove all the elements in the ArrayList, use the clear() method:
        cars.clear();
        System.out.println(cars);

    }


}
