package Collections;

public class HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 88);
        System.out.println("Initial HashMap: " + studentMarks);
    }
}
