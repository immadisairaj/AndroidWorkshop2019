import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Enter Integer");
        int k = scan.nextInt();
        System.out.println(k);

        System.out.println("Enter Double");
        double d = scan.nextDouble();
        System.out.println(d);

        System.out.println("Enter a String");
        String in = scan.next();
        System.out.println(in);

        String inp = scan.next();
        System.out.println(inp);
        */

        int roll = scan.nextInt();
        String c = scan.next();
        scan.nextLine();
        String name = scan.nextLine();
        String univ = scan.nextLine();

        System.out.println(roll);
        System.out.println(c);
        System.out.println(name);
        System.out.println(univ);
    }
}