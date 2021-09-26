import java.util.Scanner;
class Ol
{
int r,t;
char s;
void calculate(int n, char ch)
{
r=n;
s=ch;
if(s=='s')
{
System.out.println("The square of "+r+" is "+r*r); 
}
else 
{
System.out.println("The cube of "+r+" is "+r*r*r);
}
}
void calculate(int n, int m, char ch)
{
r=n;
t=m;
s=ch;
if(s=='p')
{
System.out.println("The product is "+(r*t));
}
else
{
System.out.println("The sum is "+(r+t));
}
}
void calculate(String str1, String str2)
{
int k=str1.compareTo(str2);
if(k==0)
{
System.out.println("The Strings Matched");
}
else
{
System.out.println("The Strings do not match");
}
}
}
public class overloads
{
public static void main(String args[])
{
Ol o=new Ol();
o.calculate(3,'s');
o.calculate(3,8,'p');
o.calculate("Paper","Popper");
}
}
