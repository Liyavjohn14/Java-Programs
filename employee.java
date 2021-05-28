import java.io.*;


class Empolyee
{
String ename;
String eno;
int esalary;
}
void readData() throws IOException
{ DataInputStream dp=new DataInputStream(System.in);
System.out.println("ename:");
ename=dp.readLine();
System.out.println("eno:");
eno=dp.readLine();
System.out.println("esalary:");
esalary=Integer.parseInt(dp.readLine()); }
void display()
{
System.out.println("Empolyee Name:"+ ename);
System.out.println("Empolyee no:"+eno);
System.out.println("Employee salary:"+esalary);
}
}
class EmployeeClassDemo
{
public static void main(String args[])throws IOException
{
int n;
int emp=1;
System.out.println("no of employees:");
n=readLine();
Empolyee e[ ] =new Empolyee[n];
for (i=0; i<n; i++)
{
e[i]=new Empolyee();
e[i].readdata();
e[i].display();
}
System.out.println("no of employees:");
for(i=1; i<n; i++)
{
if(e
}
}