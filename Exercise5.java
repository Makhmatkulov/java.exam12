import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("Original list: " + arrayList);
        Collections.swap(arrayList, 0, 1);    // a)elementni o’rnini almashtirish
        Collections.swap(arrayList, 2, 3);    // a)elementni o’rnini almashtirish
        System.out.println("Elementlari almashtirilgan list: " + arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(40);
        System.out.println("Ikkinchi list: " + arrayList1);
        List<Integer> collectedList = new ArrayList<>(arrayList);
        collectedList.addAll(arrayList1);
        System.out.println("Combined list: " + collectedList); // b)ikkita arraylist elementlarini birlashtirish


        ArrayList<Integer> jongategdilistlar = new ArrayList<>(3);
        jongategdilistlar.add(55);
        jongategdilistlar.add(66);
        jongategdilistlar.add(77);
        while (jongategdilistlar.size() < 6) {
            jongategdilistlar.add(null);
        }
        System.out.println("3 tali list 6 taliga o'tkazildi: " + jongategdilistlar); // 3 tali list 6 taliga o'tkazildi

    }
}
