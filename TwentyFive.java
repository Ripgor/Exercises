import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TwentyFive {
    public static void main(String[] args) throws IOException {

//Здесь я записал в файл значение. Если захотите запустить с другими данными:
    //Раскомментируйте строки 16-21
    //Закомментируйте строки 22-53
    //Измените значение input в 18-й строке
    //Запустите
    //Закомментируйте строки 16-22
    //Запустите
/*
        try (FileWriter fileWriter = new FileWriter("C:\\Java\\input.txt")) {
            String input = "399995";
            fileWriter.write(input);
            fileWriter.flush();
        }
*/
        // Чтение из файла
        FileReader fr = new FileReader("C:\\Java\\input.txt");
        BufferedReader reader = new BufferedReader(fr);

        int number;
        String input = reader.readLine();

        // Если последний символ не равен пяти, выводим сообщение об ошибке
        if (input.lastIndexOf("5") != input.length() - 1) {
            System.out.println("Incorrect number");
        // Иначе -- переводим в числовой формат строку вплоть до последней пятёрки
        } else {
            number = Integer.parseInt(input.substring(0, input.length() - 1));
        // Записываем в файл результат метода square
            try (FileWriter fileWriter = new FileWriter("C:\\Java\\output.txt")) {
                fileWriter.write(square(number));
                fileWriter.flush();
            }
        }
    }

    public static String square(int num) {
        // Чтобы посчитать квадрат числа, заканчивающегося на 5, надо:
            // Убрать последнюю пятёрку (сделали в main)
            // Умножить на следующее за получившимся число
            // приписать 25 к ответу
            // например 125^2 = 12 * 13 (убрали 5 и умножили на следующее) = 156 и приписываем 25 = 15625
            // ответ 15625
        String answer = Integer.toString(num * (num + 1));
        return answer + "25";


    }
}