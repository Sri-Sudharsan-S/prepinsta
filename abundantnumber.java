import java.util.Scanner;

public class abundantnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>a)
        {
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not Abundant Number");
        }
    }
}
