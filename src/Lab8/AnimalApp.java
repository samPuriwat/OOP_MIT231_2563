package Lab8;

public class AnimalApp {

    public static void main(String[] args) {

        Dog d = new Dog("Lulu", 10);
        Cat c = new Cat("Samock", 5);

        d.makeNoise();
        c.makeNoise();

        //polymorphism หรือ การพ้องรูป
        Animal a1 = new Dog("kiki", 8);
        Animal a2 = new Cat("jeejee", 3);

        a1.makeNoise();
        a2.makeNoise();


    }
}
