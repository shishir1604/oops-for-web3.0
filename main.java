import java.util.Scanner;
public class main 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of customers");    
        int n=new Scanner(System.in).nextInt();
        execute c[]=new execute[n];
        for(int i=0;i<n;i++)
        {
            c[i]=new execute();
            c[i].output();
            System.out.println();
        }
    }
    
}
