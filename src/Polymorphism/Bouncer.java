package Polymorphism;

public class Bouncer {
    public void barkAnimal(Barkable animal){
        animal.bark();
    }

    public void feed(Animal animal){
        System.out.println("Feed " + animal.getFood());
    }

    public static void main(String[] args) {
        Bouncer b = new Bouncer();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        b.barkAnimal(tiger);
        b.barkAnimal(lion);
        b.feed(tiger);
        b.feed(lion);
    }
}
