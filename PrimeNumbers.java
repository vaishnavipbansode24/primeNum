import java.util.Scanner;
class PrimeNumbers{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a num:");
int a=sc.nextInt();

int count=0;
if(a==0||a==1){
System.out.println("is not a prime number");
}

for(int i=2;i<a;i++)
{
if(a%i==0)
{
count++;
break;
}
}
if(count==0)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}