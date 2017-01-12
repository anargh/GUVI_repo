/**
 * Created by Anargh on 12-01-2017.
 */
import java.util.Scanner;
public class OddEven {
 public static void main(String args[])
 {
     CheckOddEven oe=new CheckOddEven();
     Scanner input=new Scanner(System.in);
     int num=input.nextInt();
     oe.check(num);
 }
}
class CheckOddEven
{
    public int number=0;
    void check(int number)
    {
        if(number!=0)
        {
            if(number%2==0)
                System.out.println(number+" is even.");
            else
                System.out.println(number+" is odd.");
        }
        else
            System.out.println("0 is even.");
    }
}
