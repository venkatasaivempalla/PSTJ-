import java.util.*;
public class Demo6 {
    public static void main(String[]args){
        List<Integer> salaries = Arrays.asList(25000,35000,42000,28000,50000);
          salaries.stream().map(y->y*1.1)
                  .mapToDouble(y->y.doubleValue())
                    .forEach(y->System.out.println(y+" "));
    }
    
}
