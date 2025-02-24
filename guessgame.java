import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
   int attempts=5;
   int n1=sc.nextInt();
   int n2=sc.nextInt();
   int sum=n1+n2;
   while(attempts>0)
   {
       System.out.print("Enter your guess[2-12]: ");
       int guess=sc.nextInt();
       if(guess<2 || guess>12)
       {
           System.out.println("INVALID CHOICE");
       }
       if(sum == guess)
       {
           System.out.println("correct");
       }
       if(sum< guess)
       {
           System.out.println("too high");
       }
       if(sum > guess)
       {
           System.out.println("too low");
       }
       attempts--;
       System.out.println("number of attempts: " + attempts);
   }
   if(attempts==0)
   {
       System.out.println("no more attempts left");
   }
}
}
