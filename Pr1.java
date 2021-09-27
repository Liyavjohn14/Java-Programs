import java.util.Scanner;
class Product
{
int pcode;
String pname;
int price;
Scanner sc =new Scanner(System.in);
void readdetails()
{
    System.out.println("enter code: ");
	this.pcode=sc.nextInt();
	sc.nextInt();
    System.out.println("enter name: ");
	this.pname=sc.nextLine();
    System.out.println("enter price: ");
	this.price=sc.nextInt();
	sc.nextInt();
}
void display()
{
    System.out.println(this.pcode);
    System.out.println(this.pname);
    System.out.println(this.price);
}
void compare(Product p1,Product p2,Product p3)
{
 if(p1.price<p2.price && p1.price<p3.price)
 {
         System.out.println("lowest price: "+p1.price);}
else if (p2.price<p3.price && p2.price<p1.price)
	{
		 System.out.println("lowest price: "+p2.price);
	}
	else
	{
		System.out.println("lowest price: "+p3.price);
	}
}
}
public class Pr1
{
public static void main(String args[])
{
Product prod[] = new Product[3];
for(int i=0;i<3;i++)
{
	prod[i]=new Product();
	prod[i].readdetails();
}
for(int i=0;i<3;i++)
{
    prod[i].display();
}
prod[1].compare(prod[0], prod[1], prod[2]);
}
}
