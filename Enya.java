import java.util.Scanner;

public class Enya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int panels = scanner.nextInt();
        int length = scanner.nextInt();
        int weight = scanner.nextInt();

        System.out.println("All you will need is sulfide: " + panels * length * weight * 2 + " ngr.");
    }
}
