interface Bank
{
float rateOfInterest();
}
class SBI implements Bank
{
public float rateOfInterest()
{
return 9.42f;
}
}
class PNB implements Bank
{
public float rateOfInterest()
{
return 9.76f;
}
}
class TestInterface1
{
public static void main(String args[])
{
Bank b=new SBI();
System.out.println(" ROI:"+b.rateOfInterest());
}
}
