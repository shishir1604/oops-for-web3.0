import java.math.BigInteger;            //to handle large integers.
import java.nio.charset.StandardCharsets;          // contains set of various unicode
import java.security.MessageDigest;             //contains the function that use various hash algo like sha-256 ,md1
import java.security.NoSuchAlgorithmException;
import java.util.*;

class hashnonce
{
    public static byte[] callsha(String s)throws NoSuchAlgorithmException
    {
        MessageDigest md=MessageDigest.getInstance("SHA-256") ;   
        return(md.digest(s.getBytes(StandardCharsets.UTF_8)));// returns byte array of the hash of string which is converted first into unicode character set of utf 8
    }
    public static String tohex(byte[] h)
    {
            BigInteger number=new BigInteger(1,h); // handles byte array and converts it into signum format 
            String hex=number.toString(16); //converts the value to hexadecimal string
            while(hex.length()<64)
            hex='0'+hex;// adds the necesary number of 0 to make the string of 64 length although not required

        return hex;

    }
    public static void main(String[] args) throws java.lang.Exception 
    {
        try
        {
            long start=System.nanoTime();// stores the initial time

                System.out.println("enter the string ");
                String s=new Scanner(System.in).nextLine();// read a string
                
                    
                String y="00000FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF";// strores the target hexadecimal.
                BigInteger n1=new BigInteger(y,16);// converts the hexadecimal into integer.
                int t=0;
                while(t>=0)
                {

                    String x=tohex(callsha(s+Integer.toString(t)));// to apppend the string
                    BigInteger n2=new BigInteger(x,16);// conerts the string into integer
                
                    if(n1.compareTo(n2)>0)// compares the two integer
                    {break;}
                    t++;
                }
                System.out.println(s+Integer.toString(t));
                
                long end=System.nanoTime();//stors the end time.

                System.out.println("time elapsed in millisecond="+(end-start)/1000000);
        }
        catch(Exception e)
        {
            return;
        }
        

    }

}
