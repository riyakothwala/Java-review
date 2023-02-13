package ComparatorComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Book implements java.lang.Comparable<Book> {
    private final String name;
    private final int id;

    public Book(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "name:" + name + " id:" + id;
    }

    @Override
    public int compareTo(Book o) {
//        String comparison
//        return this.name.compareTo(o.name);

        // int comparison
        if (this.id == o.id) {
            return 0;
        }
        if (this.id > o.id) {
            return 1;
        } else
            return -1;

    }
}


public class Comparator {
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
