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
public class SingleInheritance{
public static void main(String[] args)
{
Cat x = new Cat();
x.Eat();
x.Dog();
}
}