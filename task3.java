
import java.util.*;
import java.util.stream.*;

public class task3 {

    static class Result {
        int current;
        int maximum;

        Result(int current, int maximum) {
            this.current = current;
            this.maximum = maximum;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> profits = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            profits.add(sc.nextInt());
        }

        Result result = profits.stream()
                .skip(1)
                .reduce(
                    new Result(
                        profits.get(0),
                        profits.get(0)
                    ),
                    (r, value) -> {

                        r.current = Math.max(
                            value,
                            r.current + value
                        );

                        r.maximum = Math.max(
                            r.maximum,
                            r.current
                        );

                        return r;
                    },
                    (r1, r2) -> r1.maximum > r2.maximum ? r1 : r2
                );

        System.out.println(result.maximum);
    }
}

//output: 2
//input:250
//input:650
//output:900



