class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
     String name;
     int age;

     public void printInfo(){
         System.out.println(this.name);
         System.out.println(this.age);
     }

     Student(String name, int age){
         this.name = name;
         this.age = age;
     }

     Student(Student s2){
         this.name = s2.name;
         this.age = s2.age;
     }

     Student(){
         //Empty constructor
     }
}

public class Main{
    public static void main(String args[]){

        Student s1 = new Student("Aman",25);
        s1.name = "Yuva";
        s1.age = 23;
        s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();

        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "White";
        pen2.type = "Ball";
        pen2.write();
        pen2.printColor();

    }
}