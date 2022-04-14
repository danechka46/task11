import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer a = s.nextInt();
        String a1 = Integer.toString(a);
        Integer b = s.nextInt();
        System.out.println(Math.max(a,b));
        double q = Math.min(a,b);
        System.out.println(q);
    }
}
