import java.util.Scanner;

class Naren
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter you distance in Kilometers");
    double KM=sc.nextDouble();
    double Miles=KM*1.6093;

    System.out.println("Your distance in Miles is "+Miles);
}
}