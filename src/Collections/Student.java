package Collections;
import java.util.*;
public class Student implements Comparable<Student>{
    public String name;
    public int age;

    public int compareTo(Student o){
        return this.age - o.age;
    }
}