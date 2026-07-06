package day

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats");
    }
}

class Cow extends Animal {
    void eat() {
        System.out.println("Cow eats");
    }
}

public class usingextends {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

        Animal b = new Cow();
        b.eat();
    }
}