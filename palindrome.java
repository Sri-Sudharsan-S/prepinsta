//palindrome
import java.util.*;
public class palindrome {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int t=a,rev=0;
        while(t!=0)
        {
            rev=rev*10+t%10;
            t/=10;
        }
        if(a==rev)
        {
            System.out.println("Palindrome");
        }
        else{
            System.err.println("Not a palindrome");
        }
    }
}
