import java.util.Scanner;

public class Nuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cones = scanner.nextInt();
        int nuts = scanner.nextInt();
        int allNuts = scanner.nextInt();

        if ((cones * nuts) >= allNuts) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
