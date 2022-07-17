import java.util.Scanner;

public class Basketball {

    static int sum_1, sum_2;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            String score = scanner.nextLine();
            /*

            В строке ниже мы узнаём индекс пробела с помощью метода indexOf();
            Затем берём подстроку до пробела (очки первой команды) методом substring()
            И переводим очки типа String в тип int, используя метод parseInt() класса Integer;

            */
            int team_1 = Integer.parseInt(score.substring(0, score.indexOf(" ")));
            int team_2 = Integer.parseInt(score.substring(score.indexOf(" ") + 1));  // Ниже происходит то же самое, только работаем со второй половиной строки и для второй команды

            sum_1 += team_1;
            sum_2 += team_2;
        }

        if (sum_1 > sum_2) System.out.println(1);
        else if (sum_1 < sum_2) System.out.println(2);
        else System.out.println("DRAW");
    }
}
