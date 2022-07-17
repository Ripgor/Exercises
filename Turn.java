import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Turn {
    public static void main(String[] args) throws IOException {
    /*
        FileWriter writer = new FileWriter("C:\\Java\\input.txt");
        String input = "5\n54 2 123 5 9";
        writer.write(input);
        writer.flush();

    */

        FileReader fr = new FileReader("C:\\Java\\input.txt");
        BufferedReader reader = new BufferedReader(fr);

        int size = Integer.parseInt(reader.readLine());
        String[] input = reader.readLine().split(" ");

        FileWriter writer = new FileWriter("C:\\Java\\output.txt");
        writer.write(reverse(input, size));
        writer.flush();
    }

    public static String reverse(String[] str, int size) {
        String res = "";
        for (int i = size - 1; i >= 0; i--) {
            res += str[i] + " ";
        }
        return res;
    }
}
