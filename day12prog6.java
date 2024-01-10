abstract class Bank
{
abstract int getRateOfInterest();
}
class SBI extends Bank
{
int getRateOfInterest()
{
return 7;
}
}
class ICC extends Bank
{
int getRateOfInterest()
{
return 8;
}
}
class PNB extends Bank
{
int getRateOfInterest()
{
return 9;
}
}
class AXIS extends Bank
{
int getRateOfInterest()
{
return 9;
}
}
class IDBI extends Bank
{
int getRateOfInterest()
{
return 3;
}
}
class TestBank1
{
public static void main(String args[])
{
Bank b;
b=new SBI();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new PNB();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new ICC();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new AXIS();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new IDBI();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
}
}

