import java.io.File;
import java.util.Scanner;
public class TestFile
{
public static void main(String args[])
{
File f1=new File("C://Users//user//javam");
if(f1.isDirectory())
{
String s[]=f1.list();
System.out.println("total no of files :"+s.length);
for(int i=0;i<s.length;i++)
{
 File f2=new File("C://Users//user//javam"+"//"+s[i]);
 if(f2.isDirectory())
 {
  System.out.println(f2+" is a directory");
 }
 else
 {
  System.out.println(f2+" is a file");
 }
}
}
else
{
 System.out.println(f1+" is not a directory");
}
System.out.println("Enter a file name:");
Scanner sc=new Scanner(System.in);
String fname= sc.nextLine();
boolean found=false;
String filelist[]=f1.list();
for(int i=0;i<filelist.length;i++)
{
File f3=new File("C://Users//user//javam"+"//"+filelist[i]);
if(fname.equals(f3.getName()))
{
System.out.println("found");
found=true;
break;
}
}
if(!found)
{
System.out.println("File do not exist");
}
}
}


 
  