public class m1_q6 {
    public static void main(String[] args) {
        int n=7;
        int c=0;
        for (int i=2;i<30;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c<=1)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}