package oops_concepts.java;

//base class
//single
class Person
{
    String name = "Anubhav";
    int age =17;
    String city = "Lucknow";
    public void show()
    {
        System.out.println("Student inheriting properties from Person:\n");
    }
}

//child class
//multi-level
class Student extends Person
{
    // defining additional properties to child class
    int marks = 80;
    int roll_no = 18103013;
    void show1(){
        System.out.println("I am s student who belong to person class");
    }
}

class EngineeringStudent extends Student
{
    // defining additional properties to the child class
    String branch="Computer Science";
    public void show2()
    {
        System.out.println("Engineering Student inheriting properties from Student");
    }
}

//Hierarchichal Inheritance
class Teacher extends Person
{
    String Department="B.Tech";
    // defining additional properties to the child class
    public void show3()
    {
        System.out.println("I am a Teacher who is a Person");
    }
}
//child class3
class Doctor extends Person
{
    // defining additional properties to the child class
    String specialization = "Neuro Surgeon";
    public void show4()
    {
        System.out.println("I am a Doctor who is a Person");
    }
}

//MultipleInheritance using Interfaces

interface MotorBike
{
    int speed=50;
    void DistanceTravelled();
}
interface Cycle
{
    int distance=150;
    void speed();
}
class TwoWheeler implements MotorBike,Cycle
{
    int totalDistance;
    int avgSpeed;
    public void DistanceTravelled()
    {
        totalDistance=speed*distance;
        System.out.println("Total Distance Travelled : "+totalDistance);
    }
    public void speed()
    {
        int avgSpeed=totalDistance/speed;
        System.out.println("Average Speed maintained : "+avgSpeed);
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        EngineeringStudent obj = new EngineeringStudent();
        Doctor doctor = new Doctor();
        Teacher teacher = new Teacher();
        obj.show();
        obj.show1();
        obj.show2();
        teacher.show3();
        doctor.show4();
        System.out.println("Name of the student is: " + obj.name);
        System.out.println("Age of the student is: " + obj.age);
        System.out.println("Student lives in: " + obj.city);
        System.out.println("Student learns from: " + obj.roll_no);
        System.out.println("Marks obtained by the student is: " + obj.marks);
        System.out.println("My Branch is: " + obj.branch);

        //hierarchichal Inheritance
        System.out.println("The Department of Teacher id: "+teacher.Department);
        System.out.println("The Doctor having specialization in "+ doctor.specialization);

        //multiple inheritance
        TwoWheeler t1 = new TwoWheeler();
        t1.DistanceTravelled();
        t1.speed();
    }
}
