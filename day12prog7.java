//EXAMPLE FOR AN ABSTRACT CLASS AND NON ABSTRACT METHODS
abstract class Bike
{
Bike()
{
System.out.println("Bike is created");
}
abstract  void run();
void  gearChanged()
{
System.out.println("Gear changed");
}
}
class Honda extends  Bike
{
void run()
{
System.out.println("running safely.....");
}
}
class Test45
{
public static void main(String args[])
{
Bike obj=new Honda();
obj.run();
obj.gearChanged();
}
}


