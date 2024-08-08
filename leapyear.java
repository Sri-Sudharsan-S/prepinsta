//leap year or not
import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");

        int a=s.nextInt();
        if((a%4==0&&a%100!=0)||a%400==0)
        {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not A Leap Year");
        }
    }
}
