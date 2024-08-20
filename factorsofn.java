import java.util.*;
public class factorsofn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        System.out.println("Factors are : ");
        for(int i=1;i<a/2;i++)
        {
            if(a%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
