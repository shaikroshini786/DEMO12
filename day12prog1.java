// abstract class 
abstract class Animal
 {
 public abstract void sound();
}
  class Dog extends Animal
{
public  void sound()
{System.out.println("WOOF");
}
}
class Lion extends Animal
{
public  void sound()
{
System.out.println("Roar");
}
}
class Cat extends Animal
{
public  void sound()
{
System.out.println("Meow");
}
}
class Test
{
public static void main(String args[])
{
Animal obj;
obj=new Dog();
obj.sound();
obj=new Lion();
obj.sound();
obj=new Cat();
obj.sound();
}
}