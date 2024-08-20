import java.lang.*;
import java.util.*;

public class perfectsquare {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        if(a>=0)
        {
            int x= (int)Math.sqrt(a);
            if(x*x==a)
            {
                System.out.println("Perfect Square");
            }
            else
            {
                System.out.println("Not Perfect Square");
            }
        }
        else
        {
            System.out.println("Negative Number");
        }

    }
}
