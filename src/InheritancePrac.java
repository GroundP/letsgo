import Polymorphism.Bouncer;

class Parent{
    String name;
    void setName(String _name){
        name = _name;
    }

    void printName(){
        System.out.println(name);
    }
}

public class InheritancePrac extends Parent {
    InheritancePrac(){
        System.out.println("Constructor without param");
    }

    InheritancePrac(int i){
        System.out.println("Constructor without param: " + i);
    }

    void sleep()
    {
        System.out.println("zzz");
    }

    void printName(){
        System.out.println("Child name is "+name);
    }

}

class Main{
    public static void main(String[] args) {
        Bouncer b = new Bouncer();

        InheritancePrac child = new InheritancePrac();
        child.setName("SEOA");
        child.printName();
        child.sleep();

        Parent parentClass = new InheritancePrac(6);
        parentClass.setName("YJ");
        parentClass.printName();
    }
}
