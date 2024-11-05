package dbConnectivity;
import java.util.*;
public class DriverLicence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Clear the newline left by nextInt()

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Name of the Person: ");
            String name = scanner.nextLine();

            System.out.print("Age of the Person: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Do they have a driver's license? (yes/no): ");
            String hasLicense = scanner.nextLine();

            Driver license = null;
            if (hasLicense.equalsIgnoreCase("yes")) {
                System.out.print("License Number: ");
                String licenseNumber = scanner.nextLine();
                license = new Driver(licenseNumber);
            }

            Person person = new Person(name, age, license);
            people.add(person);

            System.out.println();
        }

        // Sort only the people with driver licenses by age
        System.out.println("People with driver licenses (sorted by age in descending order):");
        people.stream()
                .filter(person -> person.getDriverLicense() != null) // Only sort those with a driver's license
                .sorted(Comparator.comparingInt(Person::getAge).reversed())  // Sort by age in descending order
                .forEach(Person::displayInfo); // Display each person with license in sorted order

        // Display people without driver licenses in original order
        System.out.println("\nPeople without driver licenses (original order):");
        people.stream()
                .filter(person -> person.getDriverLicense() == null)
                .forEach(Person::displayInfo);

        // Close the scanner
        scanner.close();
    }
}
