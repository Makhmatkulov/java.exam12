import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Blue");
        list.add("Grey");
        System.out.println("Original list: " + list);
        list.set(0, "Pink");
        System.out.println("After the change of an element: " + list);
        System.out.println("Number of elements in the list: " + list.size());




    }
}