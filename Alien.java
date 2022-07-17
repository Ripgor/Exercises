import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Alien {
    public static void main(String[] args) throws IOException {
/*
        FileWriter writer = new FileWriter("C:\\Java\\input.txt");
        String input = "10 10 10";
        writer.write(input);
        writer.flush();
*/
        FileReader fr = new FileReader("C:\\Java\\input.txt");
        BufferedReader reader = new BufferedReader(fr);

        String[] input = reader.readLine().split(" ");
        FileWriter writer = new FileWriter("C:\\Java\\output.txt");

        String out = Integer.parseInt(input[0]) < Integer.parseInt(input[1]) + Integer.parseInt(input[2]) ? "NO" : "YES";
        writer.write(out);
        writer.flush();
    }
}
