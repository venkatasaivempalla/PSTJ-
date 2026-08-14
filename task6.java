import java.util.*;
import java.util.stream.IntStream;

public class task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        IntStream.range(0, n).forEach(i -> {
            String type = sc.next();
            int distance = sc.nextInt();

            int fare = switch (type) {
                case "Bike" -> distance * 5;
                case "Auto" -> distance * 12;
                case "Cab" -> distance * 15;
                default -> 0;
            };

            System.out.println(fare);
        });

        sc.close();
    }
}
//output
// 3
// Bike 10
// Cab 15
// Auto 8
// 50
// 225
// 96