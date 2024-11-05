package Collections;
import java.util.*;
public class ComparableInterface{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "kkr";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "KAR";
        s2.age = 20;

        Student s3 = new Student();
        s3.name = "KPR";
        s3.age = 30;

        Student s4 = new Student();
        s4.name = "KKR";
        s4.age = 26;

        ArrayList<Student> list = new ArrayList<>();
        // Student.add(new ("Alice", 30));
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        list.forEach(x -> {
            System.out.println(x.age +"-"+x.name);
        });

        // Collections.sort(list);
        ComparatorExample c = new ComparatorExample();
        Collections.sort(list,c);
        System.out.println("After Sorting with Comparator");

        list.forEach(x ->{
            System.out.println(x.age + "-" +x.name);
        });
    }
}