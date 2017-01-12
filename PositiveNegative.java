/**
 * Created by Anargh on 12-01-2017.
 */
import java.util.Scanner;
public class PositiveNegative {
    public int number=0;
    void check(int number)
    {
        if(number!=0)
        {
            if(number>0)
            {
                System.out.println("The given number, "+number+" is Positive.");
            }
            else
            {
                System.out.println("The given number, "+number+" is Negative.");
            }
        }
        else
            System.out.println("The given number, zero is neither positive nor negative.");
    }
    public static void main(String args[])
    {
        PositiveNegative pn=new PositiveNegative();
        Scanner input=new Scanner(System.in);
        int numb=input.nextInt();
        pn.check(numb);
    }
}
