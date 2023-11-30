import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(12);
        list1.add(32);
        list1.add(24);
        list2.add(12);
        list2.add(30);
        list2.add(24);
        ArrayList<Boolean> list3 = new ArrayList<>();
        list3.add(list1.get(0).equals(list2.get(0)));
        list3.add(list1.get(1).equals(list2.get(1)));
        list3.add(list1.get(2).equals(list2.get(2)));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
