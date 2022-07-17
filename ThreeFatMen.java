import java.util.Scanner;

public class ThreeFatMen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int m1 = Integer.parseInt(input[0]);
        int m2 = Integer.parseInt(input[1]);
        int m3 = Integer.parseInt(input[2]);

        if (checkCorrectInput(m1, m2, m3)) {
            minMax(m1, m2, m3);
        }
    }

    static boolean checkCorrectInput (int m1, int m2, int m3) {
        if ((m1 < 94) || (m1 > 727)) {
            System.out.println("ERROR");
        } else {
            if ((m2 < 94) || (m2 > 727)) {
                System.out.println("ERROR");
            } else {
                if ((m3 < 94) || (m3 > 727)) {
                    System.out.println("ERROR");
                } else return true;
            }
        }
        return false;
    }

    static void minMax (int m1, int m2, int m3) {
        int var1 = Integer.max(m1, m2);
        int maximum = Integer.max(var1, m3);
        System.out.println(maximum);
    }
}