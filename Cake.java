import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int answer = (n % 2 == 0) ? n / 2 : n;
        System.out.println(answer);
    }
}
