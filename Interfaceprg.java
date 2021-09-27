import java.util.Scanner;
interface shapes
{
void area(float x,float y);
void perimeter(float x,float y);
}
class circle implements shapes 
{
public void area(float x,float y)
{
float a=(float)3.14*x*x;
System.out.println("THE AREA OF CIRCLE IS: "+a);
}
public void perimeter(float x,float y)
{
float b=(float)3.14*x*2;
System.out.println("THE AREA OF CIRCLE IS: "+b);
}
}
class rectangle implements shapes 
{
public void area(float x,float y)
{
float c=(float)x*y;
System.out.println("THE AREA OF RECTANGLE IS: "+c);
}
public void perimeter(float x,float y)
{
float d=(float)2*(x+y);
System.out.println("THE AREA OF RECTANGLE IS: "+d);
}
}
public class Interfaceprg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Choose any: 1.Rectangle 2.Circle");
int n=sc.nextInt();
if(n==1)
{
rectangle rec=new rectangle();
System.out.println("Enter length and breadth");
float l=sc.nextFloat();
float b=sc.nextFloat();
System.out.println("Choose any: 1.Area 2.Perimeter");
n=sc.nextInt();
if(n==1)
{
rec.area(l,b);
}
else if(n==2)
{
rec.perimeter(l,b);
}
}
else if(n==2)
{
circle c=new circle();
System.out.println("Enter radius");
float r=sc.nextFloat();
System.out.println("Choose any: 1.Area 2.Perimeter");
n=sc.nextInt();
if(n==1)
{
c.area(r,0);
}
else if(n==2)
{
c.perimeter(r,0);
}
}
else
{
System.out.println("Wrong choice");
}
}
}
