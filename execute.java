public class execute
{
    public static void output()
    {
        double amot=0.0,i=0.0;
        schemes a=new schemes();
        a.acc_detail();
        a.deatils();

        loancalc object=new loancalc(a.amt, a.rate,a.time);
        
        if(a.c==0)
        {amot=object.compound();i=object.ci;}
        else
        {amot=object.simple();i=object.si;}
        System.out.println("amount to be paid  =  "+amot);
        System.out.println("interest  =  "+i);
        System.out.println("installement amount per month for "+a.time*12+"  =  "+(amot/(a.time*12)));
    }
    
    
}
