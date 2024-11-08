package java1.Inheritance;

public class PlainCircle extends Circle {
    public double cx,cy;
    public PlainCircle(double r,double x,double y){
        super();
        this.cx = x;
        this.cy = y;
    }
    public boolean isInside(double x, double y){
        x=20.0;
        double dx = x-cx, dy = y-cy;
        double distance = Math.sqrt(dx*dx + dy*dy);
        return(distance < r);
    }
    public static void main(String[]args){
        PlainCircle pc = new PlainCircle(20, 22, 65);
        
        System.out.println(pc.isInside(20.0,61.8));
    }
}

/*samples regarding abstraction and inheritance
ppt - this
----- obj.method/obj.java/ obj default method*/
