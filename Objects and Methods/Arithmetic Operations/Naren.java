import java.util.Scanner;//importing scanner class

class Naren
{
public static void main(String [] args)//main method
{
Double a,b;//declaring variables

Scanner sc = new Scanner(System.in);//scanner object

System.out.println("Enter the First Number");//prompting user to enter the first number
a=sc.nextDouble();
System.out.println("Enter the second number");//prompting user to enter the second number
b=sc.nextDouble();

double result=a+b;//adding the two numbers
double difference=a-b;//subtracting the two numbers
double product=a*b;//multiplying the two numbers

System.out.println("Their the addition is - "+result);//printing the addition
System.out.println("Their Difference is - "+difference);//printing the difference
System.out.println("Their Product is  - "+product);//printing the product

}
}

