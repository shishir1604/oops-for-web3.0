import java.util.Scanner;

class schemes extends account
{
    static double amt,rate;
    static int time,c=0;
    schemes()
    {
        this.amt=0.0;
        this.time=0;
        this.rate=0.0;
    }
    public  static void deatils()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("1. house loan- rate 8.65% for 2 years");
        System.out.println("2. education loan- rate 7% for 4 years");
        System.out.println("3. personnel loan- rate 10% for 2 years");
        System.out.println("4. simple lending @6% from third party");
        System.out.println("Enter your choice");
        int i=obj.nextInt();
        switch(i)
        {
            case 1:
            {
                System.out.println("enter the amount");
                amt=obj.nextDouble();
                rate=8.65;
                time=2;
                break;
            }
            case 2:
            {
                System.out.println("enter the amount");
                amt=obj.nextDouble();
                rate=7;
                time=4;
                break;

            }
            case 3:
            {
                System.out.println("enter the amount");
                amt=obj.nextDouble();
                time=2;
                rate=10;
                break;
            }
            case 4:
            {
                System.out.println("enter the amount");
                amt=obj.nextDouble();
                System.out.println("enter the time");
                time=obj.nextInt();c=1;
                rate=6;
                break;
                
            }
            default: System.out.println("sorry no match found");
        }
        
    }
    
}
