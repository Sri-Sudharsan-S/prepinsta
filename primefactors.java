import java.util.*;

public class primefactors {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        for(int i=2;i<=a;i++)
        {
            if(a%i==0)
            {
                if(checkprime(i,2))
                {
                    System.out.print(i+",");
                }
            }
        }
    }
    static boolean checkprime(int a,int i)
        {
            if(a==i)
            {
            return true;
            }
            else if(a<2)
            {
                return false;
            }
            else if(a%i==0)
            {
                return false;
            }
            i++;
            return checkprime(a, i); 

        }
}
