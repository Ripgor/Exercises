import java.util.Scanner;

public class A_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String variable = scanner.nextLine();
        char[] str = variable.toCharArray();

        int result = (str[0] - '0') + (str[2] - '0');
        System.out.println(result);
    }
}
