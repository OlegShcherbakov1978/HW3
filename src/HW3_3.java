import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW3_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(7);
        numbers.add(15);
        numbers.add(3);
        numbers.add(20);

        // Нахождение минимального значения
        int min = Collections.min(numbers);
        System.out.println("Минимальное значение: " + min);

        // Нахождение максимального значения
        int max = Collections.max(numbers);
        System.out.println("Максимальное значение: " + max);

        // Вычисление среднего арифметического
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();
        System.out.println("Среднее арифметическое: " + average);
    }
}
