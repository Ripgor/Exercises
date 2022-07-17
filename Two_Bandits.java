import java.util.Scanner;

public class Two_Bandits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte garry = scanner.nextByte();
        byte larry = scanner.nextByte();

        int notGarry = (garry + larry - 1) - garry;
        int notLarry = (garry + larry - 1) - larry;

        System.out.print(notGarry + " ");
        System.out.println(notLarry);
    }
}
