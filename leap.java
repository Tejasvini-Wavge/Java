import java.lang.*;
import java.io.*;
class leap
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter year no:");
int year=Integer.parseInt(br.readLine());
if(year % 100 ==0 && year % 400==0)
System.out.println("It is leap");
else if(year % 100!=0 && year %4==0)
System.out.println("It is leap");
else
System.out.println("It is not leap");
}
}
 
