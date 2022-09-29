package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela?", "ok", "poka");
//        list.forEach(System.out::println);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        list1.forEach(el ->
                {
                    System.out.println(el);
                    el *= 2;
                    System.out.println(el);
                }
        );
    }
}
