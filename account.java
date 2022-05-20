import java.util.Scanner;

public class account 
{
    String name,accno,type;
        long balance;
    Scanner sc=new Scanner(System.in);
    public void acc_detail()
    {
        System.out.println("enter the name of account holder");
        name=sc.nextLine();
        System.out.println("enter the  account number");
        accno=sc.nextLine();
        System.out.println("enter the type of account ");
        type=sc.nextLine();
        System.out.println("enter the balance");
        balance=sc.nextLong();
        
    }
}
