import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW3_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Удаление четных чисел из списка
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        // Вывод списка после удаления четных чисел
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
