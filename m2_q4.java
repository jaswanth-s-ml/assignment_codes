public class m2_q4 {

        String name;
        int marks;
        public m2_q4(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    public static void main(String[] args) {
        m2_q4 s = new m2_q4("sam",45);
        System.out.println(s.name+"  "+s.marks);
        m2_q4 s1 = new m2_q4("j",56);
        s1.marks=77;
        s1.name="ram";
        System.out.println(s1.name+" "+s1.marks);

    }
}
