public class loancalc 
{//to calculate loan 
    static double amt,rate,ci,si;
    static int time;
    loancalc(double A,double R,int T)// constructor to initialise
    {
        this.amt=A;
        this.rate=R;
        this.time=T;
    }    
    static double compound()// to calculate compound interest
    {
        double x=(1+0.01*rate);
        ci=Math.pow(x, time)*amt;
        return (ci+amt);
    }
    static double simple()//to calculate simple interest
    {
        si=amt*rate*time/100;
        return (si+amt);
    }
    
}
