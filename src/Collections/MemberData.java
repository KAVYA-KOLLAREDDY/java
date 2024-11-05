package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Member {
    String name;
    int age;
    boolean isDriver;
    String licenseNumber;

    // Constructor
    public Member(String name, int age, boolean isDriver, String licenseNumber) {
        this.name = name;
        this.age = age;
        this.isDriver = isDriver;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        if (isDriver) {
            return "Name: " + name + ", Age: " + age + ", Driver: Yes, License Number: " + licenseNumber;
        } else {
            return "Name: " + name + ", Age: " + age + ", Driver: No";
        }
    }
}

public class MemberData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        ArrayList<Member> members = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for member " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Is the person a driver? (yes/no): ");
            String driverResponse = sc.next();
            boolean isDriver = driverResponse.equalsIgnoreCase("yes");

            String licenseNumber = null;
            if (isDriver) {
                System.out.print("Enter License Number: ");
                licenseNumber = sc.next();
            }

            sc.nextLine(); // clear the buffer

            // Add member data to the list
            members.add(new Member(name, age, isDriver, licenseNumber));
        }

        // Sort the members by age
        Collections.sort(members, Comparator.comparingInt(m -> m.age));

        // Display the sorted data
        System.out.println("\nMember Data (Sorted by Age):");
        for (Member member : members) {
            System.out.println(member);
        }

        sc.close();
    }
}
