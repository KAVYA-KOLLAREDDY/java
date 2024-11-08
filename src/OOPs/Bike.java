package OOPs;

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