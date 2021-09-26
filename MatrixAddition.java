import java.io.*;
import java.util.Scanner;
public class MatrixAddition
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
{
System.out.println("Enter the no of rows in 1st matrix: ");
int m1=sc.nextInt();
System.out.println("Enter the no of columns in 1st matrix: ");
int n1=sc.nextInt();
System.out.println("Enter the no of rows in 2nd matrix: ");
int m2=sc.nextInt();
System.out.println("Enter the no of columns in 2nd matrix: ");
int n2=sc.nextInt();
int a[][]= new int[m1][n1];
int b[][]= new int[m2][n2];
if ((m1!=m2) || (n1!=n2))
{
System.out.println("Not Possible");
System.exit(0);
}
else
{
int c[][]= new int[m1][n1]; 
int i,j;
System.out.println("Enter the elements of 1st matrix");
for(i=0;i<m1;i++)
 for(j=0;j<n1;j++)
   a[i][j]=sc.nextInt();
System.out.println("Enter the elements of 2nd matrix");
for(i=0;i<m1;i++)
 for(j=0;j<n1;j++)
   b[i][j]=sc.nextInt();
System.out.println("1st matrix is");
for(i=0;i<m1;i++)
{
 for(j=0;j<n1;j++)
 {
    System.out.println(a[i][j]);
 }
 System.out.println();
}
for(i=0;i<m2;i++)
{
 for(j=0;j<n2;j++)
 {
    System.out.println(b[i][j]);
 }
 System.out.println();
}
for(i=0;i<m1;i++){
for(j=0;j<n1;j++){
c[i][j]=a[i][j]+b[i][j];
}}
System.out.println("resulting matrix is");
for(i=0;i<m1;i++){
for(j=0;j<n1;j++){
System.out.println(c[i][j]);
}
System.out.println();
}
}
}
}
}

