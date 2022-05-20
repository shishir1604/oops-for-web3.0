public class execute
{//to call objects of required classes and carry out the loaning.
    public static void output()
    {
        double amot=0.0,i=0.0;
        schemes a=new schemes();//object of scheme class
        a.acc_detail();//calls function of super class i.e.account class
        a.deatils();

        loancalc object=new loancalc(a.amt, a.rate,a.time);//object of loancalc class it initialises variables with certain inputs.
        
        if(a.c==0)
        {amot=object.compound();i=object.ci;}
        else
        {amot=object.simple();i=object.si;}
        System.out.println("amount to be paid  =  "+amot);
        System.out.println("interest  =  "+i);
        System.out.println("installement amount per month for "+a.time*12+"  =  "+(amot/(a.time*12)));
    }
    
    
}
