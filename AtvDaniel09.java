import java.util.Scanner;
public class AtvDaniel09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int num = 1; num <= 50; num++) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}