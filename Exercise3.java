import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);             //original list
        System.out.println(list.reversed());  //teskari tertibdagi list
        list.remove(0);
        list.remove(list.size() - 1);
        System.out.println(list);             //birinchi va oxirgi elementlarini kesib olingan list
    }
}
