import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sj=new Scanner(System.in);
int a=0;
int b=0;
System.out.print("Enter first Number: ");
a=sj.nextInt();
System.out.print("Enter second Number: ");
b=sj.nextInt();
int big= (a>b)?a:b;
int res=big;
while(true)
{
   if(res%a==0 && res%b==0)
   break;
   else
   res=res+big;
}
System.out.println("The lcm is: " +res);
}
}
