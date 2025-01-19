class Animal {
    void bark() {
        System.out.println("Barking!!!!!..");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Eating!!!...");
    }
}

class Tiger extends Animal {
    void weep() {
        System.out.println("Weeping!!!...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Tiger r = new Tiger();
        r.weep();
        // tiger.eat();
        // This will cause an error because `eat()` is not in `Tiger`
        r.bark();
    }
}
