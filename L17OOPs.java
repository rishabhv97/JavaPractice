public class L17OOPs {
    public static void main(String[] args) {

        Students s1= new Students();
        s1.schoolName="JMV";

        Students s2 = new Students();
        System.out.println(s2.schoolName);


        // Queen q = new Queen();
        // q.moves();
        // bear b = new bear();
        // b.eatnonveg();
        // b.eatveg();



        // Calculator calc= new Calculator();
        // System.out.println(calc.sum(1, 4));
        // System.out.println(calc.sum((float)1.5, (float)4.5));
        
        // Dogs Dogesh = new Dogs();
        // Dogesh.eat();
        // Dogesh.legs=4;
        // System.out.println(Dogesh.legs);
        


    //    Student s1 = new Student("Rishabh");
    //    s1.roll=456;
    //    s1.password="abcd";
    //    s1.marks[0]=100;
    //    s1.marks[1]=90;
    //    s1.marks[2]=80;



    //    Student s2 = new Student(s1);
    //    s2.password ="xyz";
    //    s1.marks[2]=100;
    //    for(int i=0; i<3; i++){
    //     System.out.println(s2.marks[i]);
    //    }

       
       
       
        // Pen p1= new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());


        // BankAccount myAccount= new BankAccount();
        // myAccount.username="Aman";
        
    }
}

// Static Keyword
class Students {
    String name;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}


// Interfaace

interface Herbivore{
    void eatnonveg();
}
interface Carnivore{
    void eatveg();
}
class bear implements Herbivore, Carnivore{
    public void eatnonveg(){
        System.out.println("Eat Fish");
    }
    public void eatveg(){
        System.out.println("Eat Grass");
    }
}

// Interface
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}


// Abstract Class

abstract class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    void walk(){
        System.out.println("Walks On 4 legs");
    }
}

class Hen extends Animal {
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        
        return a+b ;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
} 

// BAse Class
// class Animal {
//     String color;
//     void eat(){
//         System.out.println("Eats");

//     }
//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// class Mammals extends Animal{
//     int legs;
// }

// class Dogs extends Mammals{
//     String bread;
// }

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow Copy Constructer
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    // Deep copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0; i<marks.length ; i++){
            this.marks[i]=s1.marks[i];
        }

    }


    Student(String name){
        marks = new int[3];
        this.name =name;
    }
    Student(){
        System.out.println("Constructor is called...");
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}


class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color= newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password="pwd";
    }
}


