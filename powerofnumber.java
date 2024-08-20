import java.util.*;
public class powerofnumber {
    public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=s.nextInt();
    System.out.println("Enter the power");
    int b=s.nextInt();
    int result=1;
    while(b!=0)
    {
        result=result*a;
        b--;
    }
    System.out.println("Result = "+result);

    }
}
