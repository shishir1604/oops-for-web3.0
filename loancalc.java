public class loancalc 
{
    static double amt,rate,ci,si;
    static int time;
    loancalc(double A,double R,int T)
    {
        this.amt=A;
        this.rate=R;
        this.time=T;
    }    
    static double compound()
    {
        double x=(1+0.01*rate);
        ci=Math.pow(x, time)*amt;
        return (ci+amt);
    }
    static double simple()
    {
        si=amt*rate*time/100;
        return (si+amt);
    }
    
}
