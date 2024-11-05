package java3;

class Bike {
    String type; 
    public Bike(String brand, String type) {

    }
    public Bike(String type) {
        this.type = type;
    } 
    public void displayBikeDetails() {
        System.out.println("Bike Type - "+ this.type);
    } 
}