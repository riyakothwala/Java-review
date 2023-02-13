package ComparatorComparable;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Comparable is used to compare two object based on natural ordering.
For that, the comparing object class(Book) needs to implement comparable interface and implemet compareTo(object o) method.
See Book class.
 */
public class ComparableDriver {

    public static void main(String[] args) {
        Book b1 = new Book("pqr", 29);
        Book b2 = new Book("abc", 23);
        Book b3 = new Book("xya", 12);

        List<Book> list = Arrays.asList(b1, b2, b3);
        Collections.sort(list);

        for (Book b : list)
            System.out.println(b);

    }

}
