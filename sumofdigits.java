//sum of digits
import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=s.nextInt();
        int sum=0;
        while(a!=0)
        {
            sum=sum+a%10;
            a=a/10;
        }
        System.out.println("Sum of digits is 0"+sum);
    }
}
