package oops_concepts.java;

class Shape{
    public void area(){
        System.out.println("Area");
    }
}

class Circle extends  Shape{
    public void area(){
        System.out.println("Circle Area is pi*radius*radius");
    }
}

class Triangle extends Shape{
    public void area(){
        System.out.println("Triangle Area is (1/2)*base*height");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();
        Circle circle = new Circle();
        circle.area();
        Triangle triangle = new Triangle();
        triangle.area();
    }
}
