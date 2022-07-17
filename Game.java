import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte num1 = scanner.nextByte();

        System.out.print(num1);
        System.out.print(9);
        System.out.println(9 - num1);
    }
}
