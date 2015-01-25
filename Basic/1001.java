import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Integer count = 0;
        while (n != 1) {
            if (n % 2 == 0)
                n /= 2;
            else
                n = (3 * n + 1) / 2;
            count++;
        }
        System.out.println(count);
    }
}
