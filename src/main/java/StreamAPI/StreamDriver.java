package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Parent {
    private String name;

    Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parent{" + "name='" + name + '\'' + '}';
    }
}

class Student {
    private int age;
    private String name;
    private List<Parent> parents;

    public Student(int age, String name, List<Parent> parent) {
        this.age = age;
        this.name = name;
        this.parents = parent;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<Parent> getParent() {
        return parents;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(List<Parent> parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + ", parents=" + parents + '}';
    }
}

public class StreamDriver {
    public static void main(String[] args) {
        Parent p1 = new Parent("wer");
        Parent p2 = new Parent("jki");
        Parent p3 = new Parent("koe");
        Parent p4 = new Parent("pre");
        Parent p5 = new Parent("jki");

        Student s1 = new Student(20, "Riya", Arrays.asList(p1, p2));
        Student s2 = new Student(22, "Abc", Arrays.asList(p3, p2));
        Student s3 = new Student(21, "Xyz", Arrays.asList(p3, p4));
        Student s4 = new Student(20, "Lmn", Arrays.asList(p4, p5));
        Student s5 = new Student(23, "Riya", Arrays.asList(p2));

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
        String STUDENT_SEARCH_NAME = "Riya";
        String PARENT_SEARCH_NAME1 = "jki";
        String PARENT_SEARCH_NAME2 = "wer";

        Predicate<Student> studentPredicate = student -> student.getName().equals(STUDENT_SEARCH_NAME) && student.getParent().stream().anyMatch(parent -> parent.getName().equals(PARENT_SEARCH_NAME1) || parent.getName().equals(PARENT_SEARCH_NAME2));

        String collect = students.stream() // streaming
                .filter(studentPredicate) // filtering with student name and parents name
                .map(Student::getName) // convert it to String
                .collect(Collectors.joining(", ")); // collection of stream joinning with ", "
        System.out.println("collect = " + collect);

        Set<Parent> collect1 = students.stream()
                .flatMap(student -> student.getParent().stream())// convert list of list to list
                .collect(Collectors.toCollection(HashSet::new));
//              .collect(Collectors.toList());


        collect1.forEach(parents -> System.out.println(parents));


    }
}
