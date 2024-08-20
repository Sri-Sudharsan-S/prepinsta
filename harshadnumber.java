import java.util.*;
public class harshadnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int t=a,sum=0;
        while(t!=0)
        {
            sum=sum+t%10;
            t/=10;
        }
        if(a%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }
}
