import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Listdagi birir bir int elementni taxmin qilib ko'ring: ");
        int x = input.nextInt(); //to’plamning ichidan elementlarni biror qiymat bo’yicha qidirish
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(56);
        System.out.print("Original list: " + list);
        System.out.println();
        if (list.contains(x)) {
            System.out.println("listda " + x + " raqami mavjud");
        } else {
            System.out.println("listda " + x + " raqami mavjud emas");
        }
        System.out.print("Arraylistdan nusxa olish: ");//ArrayListdan nusxa olish
        System.out.println(list.clone());

        Collections.shuffle(list);// ArrayList elementlarni aralashtirish uchun dastur
        System.out.print("List elementlari aralashtirilgandan so'ng: ");
        System.out.println(list);
    }
}
