package ComparatorComparable;

class Book implements java.lang.Comparable<Book> {
    private final String name;
    private final int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

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


