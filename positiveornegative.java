//Positive or Negative
import java.util.*;
class positiveornegative
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=s.nextInt();
        if(a<0)
        {
            System.out.print("Nigaative");
        }
        else if(a>0){
            System.out.print("Positive");
        }
        else
        {
            System.out.print("Zero");

        }
    }
}