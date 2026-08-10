import java.util.*;
public class Demo7 {
    public static void main(String[] args) {
        List<List<String>> departments = Arrays.asList(
                Arrays.asList("CSE", "ECE"),
                Arrays.asList("CSE", "IT"),
                Arrays.asList("EEE", "IT")
        );

        departments.stream()
                .flatMap(List -> List.stream())
                .filter(dept -> dept.startsWith("C"))
                .distinct()
                .forEach(dept -> System.out.println(dept + " "));
    }
}
