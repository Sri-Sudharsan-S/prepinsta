//fibonacci
import java.util.*;

public class fibonacci
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the nth Term");
        int a=s.nextInt();
        if(a>2)
        {
        System.out.print("0"+","+"1"+",");
        int x=0,y=1;
        for(int i=2;i<a;i++)
        {
            int sum=x+y;
            x=y;
            y=sum;
            System.out.print(sum+",");
        }
        }
        else{
            if(a==0)
            {
                System.out.println("0");
            }
            else if(a==1)
            {
                System.err.println("1");
            }
            else{
                System.out.println("Error");
            }
        }
    }

}