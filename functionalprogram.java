import java.util.*;
import java.util.stream.*;
public class functionalprogram {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IntStream.range(5,n)
                .map(i-> sc.nextInt())
                .map(salary->salary+salary/20)
                .forEach(salary->System.out.println(salary+" "));
        sc.close();

    }
}
// import java.util.*;
// import java.util.stream.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         IntStream.range(0, n)
//                  .map(i -> sc.nextInt())
//                  .map(salary -> salary + salary / 10)
//                  .forEach(salary -> System.out.print(salary + " "));

//         sc.close();
//     }
// }