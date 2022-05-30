import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

class hashnonce
{
    public static byte[] callsha(String s)throws NoSuchAlgorithmException
    {
        MessageDigest md=MessageDigest.getInstance("SHA-256") ;
        return(md.digest(s.getBytes(StandardCharsets.UTF_8)));
    }
    public static String tohex(byte[] h)
    {
            BigInteger number=new BigInteger(1,h);
            String hex=number.toString(16);
            while(hex.length()<64)
            hex='0'+hex;

        return hex;

    }
    public static void main(String[] args) throws java.lang.Exception 
    {
        try
        {
            long start=System.nanoTime();

                System.out.println("enter the string ");
                String s=new Scanner(System.in).nextLine();
                
                    
                String y="00000FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF";
                BigInteger n1=new BigInteger(y,16);
                int t=0;
                while(t>=0)
                {

                    String x=tohex(callsha(s+Integer.toString(t)));
                    BigInteger n2=new BigInteger(x,16);
                
                    if(n1.compareTo(n2)>0)
                    {break;}
                    t++;
                }
                System.out.println(s+Integer.toString(t));
                
                long end=System.nanoTime();

                System.out.println("time elapsed in millisecond="+(end-start)/1000000);
        }
        catch(Exception e)
        {
            return;
        }
        

    }

}