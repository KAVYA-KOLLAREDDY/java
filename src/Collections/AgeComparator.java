package Collections;
import java.util.Comparator;
public class AgeComparator implements Comparator<Student>{
    
    public int compare(Student o1, Student o2){
        return o1.age - o2.age;
    }
    
}

public class NameComparator implements Comparator<Student>{
    
}
