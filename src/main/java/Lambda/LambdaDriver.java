package Lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
Anonymous inner class and Lambda exercise:
when we want to use class object only once at that time it is efficient to use anonymous class without creating the separate class.
 */

/*
an interface that has only one method is called functional interface and we can use lambda expression with functional interface
 */
@FunctionalInterface
interface Process {
    public float findAvarage(List<Integer> number);
}

public class LambdaDriver {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(67, 78, 45, 53, 23, 47, 90);

        //Anonymous class using lambda expression
        Process pro = (number) -> {
            int sum = 0;
            int iteration=0;
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                sum += iterator.next();
                System.out.println("Sum after iteration" + iteration + ": " + sum);
                iteration++;
            }
            return sum;
        };
        System.out.println("Final sum: " + pro.findAvarage(list));

    }

}
