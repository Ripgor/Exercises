import java.util.Scanner;

public class Crane {

    static int input;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("enter a number that is divisible by six");
            input = scanner.nextInt();
            if (input % 6 == 0) break;

        } while (input % 6 != 0);

        System.out.print(input / 6 + " ");
        System.out.print(input - (2 * (input / 6)) + " ");
        System.out.print(input / 6);
    }
}
