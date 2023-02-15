package ComparatorComparable;

import java.util.*;

/*
Comparator is used when we want to compare object based on our logic (not the natural ordering).
For that, we need to create comparator class that implements comparator interface and add your comparison logic to compare(T o1, T o2).
see comparator class.(you can also create comparator anonymous class if you use the comparator class object only once.)
Now, use the comparator class in below driver class with collection.sort(list, comparator)

Advantage of comparator:
we already have comparable.compareTo() then why we should use comparator?
- Sometimes we can modify compare object class(Book) then this is useful.
- if we want to write our own comparison logic then have to use comparator which is not possible in comparable.
- last, you don't need to write additional code(comparison code that you write in comparable) in domain class(book).
 */

public class ComparatorDriver {
    public static void main(String[] args) {

//  You can anonymous class as below without creating comparator class
//        Comparator<Book> comp=new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return Integer.compare(o1.getId(), o2.getId());
//            }
//        };

        Book b1 = new Book("pqr", 29);
        Book b2 = new Book("abc", 23);
        Book b3 = new Book("xya", 12);

        List<Book> list = Arrays.asList(b1, b2, b3);

        Comparator<Book> comp=new ComparatorId();
        Collections.sort(list,comp);

        for (Book b : list)
            System.out.println(b);

    }
}
