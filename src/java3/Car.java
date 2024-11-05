package java3;

class Car 
{
    int seats;
    public Car(String brand, int seats) {

    }
    public Car(int seats) {
         this.seats = seats;
    }
    public void displayCarDetails() {
         System.out.println("Car Has - "+ this.seats); 
    }
}
