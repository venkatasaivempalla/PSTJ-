import java.util.*;
public class Demo8 {
    public static void main(String[]args){
        List<Integer> prices = Arrays.asList(500,1200,800,1500,1200,700,2000,900);
        prices.stream()
                .filter(price  -> price >800)
                .distinct()
                .skip(1)
                .limit(3)
                .forEach(price -> System.out.println(price+" "));
    }
    
}
