package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("John", 25);
        map.put("Alice", 23);
        map.put("Bob", 29);

        // Displaying the HashMap
        System.out.println("Initial HashMap: " + map);

        // Accessing elements in the HashMap
        System.out.println("Age of Alice: " + map.get("Alice"));

        // Iterating over HashMap entries
        System.out.println("All entries in the HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing an element
        map.remove("Bob");
        System.out.println("HashMap after removal: " + map);
    }
}
