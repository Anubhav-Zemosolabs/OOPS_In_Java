package oops_concepts.java;

class GeometricalShape{
    public void area(int length, int breadth){
        int SquareArea = length*breadth;
        System.out.println("Area of Square: " + SquareArea);
    }

    public void area(int length, int breadth, int height){
        int CuboidArea = length*breadth + breadth*height + height*length;
        System.out.println("Area of Square: " + CuboidArea);
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        GeometricalShape myshape = new GeometricalShape();
        myshape.area(8,10);
        myshape.area(2,3,6);
    }
}
