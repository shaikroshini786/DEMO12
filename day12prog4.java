abstract class  Shape
{
abstract void draw();
}
class Rectangle extends Shape
{
public void draw()
{
System.out.println("Rectangle is darawing");
}
}
class Circle extends Shape
{
public void draw()
{
System.out.println("Circle is darawing");
}
}
class TestAbstraction
{
public static void main(String args[])
{
Shape s=new Rectangle();
s.draw();
Shape  r=new Circle();
r.draw();
}
}

 
