interface Printable
{
void print();
}
interface Showable
{
void print();
}
class A implements Printable,Showable
{
public void print()
{
System.out.println("Hello");
}
public void show()
{
System.out.println("Welcome");
}
}
class TestInterface3
{
public static void main(String args[])
{
A obj=new  A();
obj.print();
obj.show();
}
}





