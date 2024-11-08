//Constructer
package java1.Inheritance;

public class Circle {
    public static final double PI = 3.14159;
    public double r;
    public Circle(double r){
        this.r = r;
    }
    public Circle(){
        r = 1.0;//this(1.0);
    }
    public Circle(int r){
        r=5;
    }
    public double circumference(){
        return 2*PI*r;
    }
    public double area(){
        return PI*r*r;
    }
    public static void main(String[] args){
        Circle c = new Circle();
        System.out.println(c.circumference());
        System.out.println(c.area());
    }
    
}
