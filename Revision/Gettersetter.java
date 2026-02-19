package Revision;
import Revision.a;

class student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Gettersetter {
    static public void main(String[] args) {
        
        student s1 = new student();
        s1.setName("Rohan");
        System.out.println(s1.getName());

        a s2 =new a();
        s2.setName("Chomu");
        System.out.println(s2.getName());
    }

}
