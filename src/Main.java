import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Меркурий");
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");

        // Вывод названия каждой планеты и количество его повторений в списке
        for (String planet : planets) {
            int frequency = Collections.frequency(planets, planet);
            System.out.println(planet + ": " + frequency);
        }
    }
}
