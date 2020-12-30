import java.util.Scanner;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        System.out.println("hello world");
        Float mC = 45.2f;
        System.out.println(mC);
        Scanner scanf = new Scanner(System.in);
        Float input = scanf.nextFloat();
        scanf.close();
        System.out.println(input);
    }
}