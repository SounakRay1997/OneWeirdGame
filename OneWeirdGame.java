import java.util.*;
public class OneWeirdGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int T=sc.nextInt();
        int r[]=new int[T];
        for(int i=0; i<T; i++)
        {
            System.out.println();
            int m=sc.nextInt();
            int n=sc.nextInt();
            r[i]=(m+n-2)+(2*(m-1)*(n-1));
        }
        for(int i=0; i<T; i++)
        {
            System.out.println(r[i]);
        }
    }
}
