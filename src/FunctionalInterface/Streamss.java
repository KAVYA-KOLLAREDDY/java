import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<Student> getStudents() {
        return new ArrayList<>(
                List.of(
                        new Student("John", 25),
                        new Student("Alice", 23),
                        new Student("Bob", 29),
                        new Student("Jasmine", 22),
                        new Student("Katrina", 27)));
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    // IDE generated hashCode()
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    // IDE generated equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

}

public class Streamss {
    public static void main(String[] args) {
        List<Student> students = Student.getStudents();

        // Getting Students Where age is greater than 25
        List<Student> students25 = students.stream()
                .filter(new Predicate<Student>() {
                    @Override
                    public boolean test(Student t) {
                        return t.getAge() > 25;
                    }
                    
                })
                .toList();
        System.out.println("Students Of Age > 25 - " + students25);

        // Getting Students Whose Names Start With 'j'
        List<Student> studentsj = students.stream()
                .filter(student -> student.getName().startsWith("J"))
                .toList();
        System.out.println("Students Whose name starts with j - " + studentsj);

        // Getting All Student Names From List Of Students
        List<String> studentNames = students.stream()
                .map(student -> student.getName())
                .toList();
        System.out.println("Student Names - " + studentNames);

        // Sorting Students By Age And Getting First 3 Names
        List<String> students3 = students.stream()
                .sorted((student1, student2) -> Integer.compare(student1.getAge(), student2.getAge()))
                .map(student -> student.getName())
                .limit(3)
                .toList();
        System.out.println("First 3 Younger Students - " + students3);

        // Sorting Students By Names (Descending Order) and Removing First 2 Studentss
        List<String> studentsDesc = students
                .stream()
                .sorted((stu1, stu2) -> stu2.getName().compareTo(stu1.getName()))
                .skip(2) // Skips first 2 records
                .map(student -> student.getName())
                .toList();
        System.out.println("Student Names In Descending Order (Skipping 2 Students) - " + studentsDesc);

        // Sorting Students By Age and Considering Students Untill Age Of 25
        List<Student> stus25 = students.stream()
                .sorted((stu1, stu2) -> Integer.compare(stu1.getAge(), stu2.getAge()))
                .takeWhile(student -> student.getAge() <= 25) // Takes Elements From Stream Untill The Condition Is True
                .toList();
        System.out.println("Students Untill Age Of 25 - " + stus25);

        // Sorting Students By Age and Considering Students After Age Of 25
        List<Student> stus25A = students.stream()
                .sorted((stu1, stu2) -> Integer.compare(stu1.getAge(), stu2.getAge()))
                .dropWhile(student -> student.getAge() <= 25) // Drops Elements From Stream Untill Condition Is True
                .toList();
        System.out.println("Considering Students After Age Of 25 - " + stus25A);

        // Another Example - Adding Same Student Again
        students.add(new Student("Jasmine", 22));

        System.out.println("Students - " + students);

        // Unique Student Names
        List<String> uniqueStudents = students.stream()
                .distinct() // Must and should implement equals() and hashCode() to get unique records
                .map(student -> student.getName())
                .toList();
        System.out.println("Unique Student Names - " + uniqueStudents);

        // Getting No.of Students and Debugging Names Of Students Whose Age Is Greater
        // than 25
        long stu25Count = students.stream()
                .filter(student -> student.getAge() > 25)
                .peek(student -> System.out.println("Student - " + student.getName())) // Debugging
                .count();
        System.out.println("No.of Students Whose Age Is Greater than 25 - " + stu25Count);
    }
}