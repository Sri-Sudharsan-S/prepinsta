import java.lang.*;
import java.util.*;
public class perfectsquarerange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range:");
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++)
        {
            int x=(int)Math.sqrt(i);
            if(x*x==i)
            {
                System.out.print(i+",");
            }
            else{
                y=1;
            }
        }
            
        }
    }
}
