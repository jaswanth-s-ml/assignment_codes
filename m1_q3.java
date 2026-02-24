import java.util.*;
public class m1_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();
        int m=marks/10;
        String grade;
        switch (m) {
            case 9 -> grade = "a";
            case 8 -> grade = "b";
            case 7 -> grade = "c";
            case 6 -> grade = "d";
            default -> grade = "f";
        }
        System.out.println(grade);
    }
}