import java.util.Scanner;
class Goldbach
{
    public static void main ()
    {
        int g=0;
        Scanner br=new Scanner (System.in);
        System.out.println ("Enter the EVEN number");
        int N=br.nextInt();
        if (N>4)
        {
            for (int j=3;j<=N/2;j=+2)
            {
                int b=N-j;
            for (int i=2;i<b;i++)
            { 
              if (b%i==0)
              {
                  g++;
              }
              
            }
            if(g==0)
              {
                  System.out.println ("The gold bach number are "+b+" and "+j);
                  break;
              }
              g=0;
            }
            
        }
    }
}