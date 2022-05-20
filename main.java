import java.util.Scanner;
// this is the main class to be executed 
// it lets us create number of instance of our loan service project 
// thus we can serve various customers.
public class main 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of customers");    
        int n=new Scanner(System.in).nextInt();
        execute c[]=new execute[n];// array of objects.
        for(int i=0;i<n;i++)
        {
            c[i]=new execute();
            c[i].output();
            System.out.println();
        }
    }
    
}
