// Person class containing driver details
package dbConnectivity;
class Person {
    private String name;
    private int age;
    private Driver driverLicense;

    public Person(String name, int age, Driver driverLicense) {
        this.name = name;
        this.age = age;
        this.driverLicense = driverLicense;  // This could be null if no license
    }

    public int getAge() {
        return age;
    }

    public Driver getDriverLicense() {
        return driverLicense;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (driverLicense != null) {
            System.out.println("License Number: " + driverLicense.getLicenseNumber());
        } else {
            System.out.println("No Driver License.");
        }
    }
}
