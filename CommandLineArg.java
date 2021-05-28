import java.io.*;
class CommandLineArg
{
public static void main(String [ ]args)
{
int len= args.length;
int sum=0;
if ( len > 0)
{
System.out.println("The command line arguments are : " ) ;
for (int i=0;i <len; i++ )
{
System.out.println(args[i] ) ;
int a=Integer.parseInt(args[i] ); 
sum=sum+a;
}
}
else{
System.out.println( "No commandline arguments found . " ) ;
}
System.out.println("the sum ="+sum);
}}
