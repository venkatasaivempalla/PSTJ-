import java.util.*;

public class Demo5 {
    public static void main(String[]args){
        List<Integer> marks = Arrays.asList(10,20,30,40,50);
        marks.stream()
              .filter(mark -> mark >= 50)
              .map(mark -> mark + 5)
              .forEach(mark -> System.out.println(mark+" "));

    }
    
}
