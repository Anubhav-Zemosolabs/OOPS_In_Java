package oops_concepts.java;

class Area{
    // fields to calculate area
    int length, breadth;
    //constructor to initialize the values
    Area(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //method to calculate Area
    public void calArea(){
        int totalArea = length*breadth;
        System.out.println("The Area of square is: " + totalArea);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Area a = new Area(8,10);
        a.calArea();
    }
}
