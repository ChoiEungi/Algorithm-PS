import java.lang.Math;

class Shape {
    private String name;
    Shape(String s){
        name =s ;
    }

    String getName() {return name;}

    public double area(){return 0.0;}

}

class Circle extends Shape{
    protected double r;
    private double pi = Math.PI;

    public Circle(double r) {
        super("Circle");
        this.r = r;
    }

    public double getRedius() {return r;}

    public double area(){return pi*r*r;}
}

class Rectangle extends Shape{
    protected double w, h;

    public Rectangle(double w, double h) {
        super("Rectangle");
        this.w = w;
        this.h = h;
    }

    public double getWidth() {return w;}

    public double getHeight() {return h;}

    public double area(){return w*h;}
}

public class ShapeProject {
    public static void main(String[] args){
        Shape[] shapes = new Shape[3]; // Shape 객체 배열을 생성
// Shape 객체를 생성
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(2.0, 3.0);
        shapes[2] = new Rectangle(4.0, 1.0);
        for(int i = 0; i < shapes.length; i++) {
            System.out.println(" 객체는 " + shapes[i].getName());
            System.out.println(" 면적은 " + shapes[i].area());
            System.out.println();
        }

    }
}