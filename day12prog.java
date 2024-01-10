// abstract class 
abstract class Animal
{
public abstract void sound();
}
class Dog extends Animal
{
public  void sound()
{
System.out.println("WOOF");
}
public static void main(String args[])
{
Animal ob=new Animal();
ob.sound();
}
}