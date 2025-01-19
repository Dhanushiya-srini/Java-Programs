class Animal {
    void Dog()
    {
    System.out.println("Barkingg!!!!!..");
    }
    }
    class Cat extends Animal{
    void Eat()
    {
    System.out.println("Eatingg!!!...");
    }
    }
    class Tiger extends Cat{
    void Weep()
    {
    System.out.println("Weepinggg!!!!....");
    }
    }
    public class MultipleIheritance{
    public static void main(String[] args)
    {
    Tiger x = new Tiger();
    x.Weep();
    x.Eat();
    x.Dog();
    }
    }