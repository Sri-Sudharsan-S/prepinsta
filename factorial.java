import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int f=fact(a);
        System.err.println("Factorial is "+f);

    }
    public static int fact(int a)
    {
        if(a==1)
        {
            return  1;
        }
        else{
            return a*fact(a-1);
        }
    }
}
