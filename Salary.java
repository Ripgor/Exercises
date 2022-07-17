import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] salary = new int[3];

        for (int i = 0; i < 3; i++) {
            salary[i] = scanner.nextInt();
        }

        int min = salary[0], max = salary[0];


        for (int i = 0; i < 3; i++) {
            if (min > salary[i]){
                min = salary[i];
            }
            if (max < salary[i]){
                max = salary[i];
            }
        }

        System.out.println(max - min);
    }
}
