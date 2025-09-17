public class L17OOPs {
    public static void main(String[] args) {
       Student s1 = new Student("Rishabh");
       System.out.println(s1.name);
       
       
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

class Student {
    String name;
    int roll;
    String password;

    Student(String name){
        this.name =name;
    }
    Student(){
        System.out.println("Constructor is called...");
    }
    Student(int roll){
        this.roll = roll;
    }
}


