import java.util.Scanner;

public class Strawberry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String berries = scanner.nextLine();

        int misha = Integer.parseInt(berries.substring(0, berries.indexOf(" ")));
        int masha = Integer.parseInt(berries.substring(berries.indexOf(" ") + 1, berries.lastIndexOf(" ")));
        int ate = Integer.parseInt(berries.substring(berries.lastIndexOf(" ") + 1));

        if (ate <= masha + misha) System.out.println(masha + misha - ate);
        else System.out.println("IMPOSSIBLE");
    }
}
