import java.util.Scanner;

class BinaryNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        while (num != 0) {
            if (num % 2 == 0) num /= 2;
            else {
                System.out.println("NO");
                break;
            }
            if (num == 2) {
                System.out.println("YES");
                break;
            }
        }
    }
}