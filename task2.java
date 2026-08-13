import java.util.*;
import java.util.stream.*;

public class task2 {

    static class Reading {
        String id;
        double temperature;

        Reading(String id, double temperature) {
            this.id = id;
            this.temperature = temperature;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Reading> readings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            readings.add(
                new Reading(sc.next(), sc.nextDouble())
            );
        }

        readings.stream()
                .filter(r -> r.temperature > 50)
                .collect(Collectors.groupingBy(
                    r -> r.id,
                    Collectors.averagingDouble(r -> r.temperature)
                ))
                .entrySet()
                .stream()
                .sorted(
                    (a, b) -> Double.compare(
                        b.getValue(),
                        a.getValue()
                    )
                )
                .forEach(
                    e -> System.out.println(
                        e.getKey() + " " + e.getValue()
                    )
                );
    }
}
    
