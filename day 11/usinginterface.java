package day

abstract class Animal {
    abstract void eat();
}
class Dog extends Animal {
    void eat(){
        System.out.println("Dog is eating");
    }
}
interface pet{
    void eat();
}

class Cow extends Animal implements pet {
    public void eat() {
        System.out.println("Cow is eating");
    }
}

public class usinginterface {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

        Animal b = new Cow();
        b.eat();
    }
}
