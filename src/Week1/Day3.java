package Week1;
import java.util.Scanner;

public class Day3
{
    public static void main(String[]args)
    {
        System.out.print("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==0)
        System.out.println("number is even:"+ a);
        else
            System.out.println("number is odd:"+ a);

    }
}
