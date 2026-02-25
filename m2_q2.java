public class m2_q2 {
    //int flag =0;
    static void cp(String a)
    {   int flag =1;
        char[] arr=a.toCharArray();
        for (int i=0;i<arr.length;i++)
        {
            if(arr[arr.length-1-i]!=arr[i])
            {
                flag=0;
                break;
            }
        }
        if (flag==1)
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
        cp("abma");
    }
}
