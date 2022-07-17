import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mouse {
    public static void main(String[] args) throws IOException {
/*
        FileWriter writer = new FileWriter("C:\\Java\\input.txt");
        String whr = "5 7 2";
        writer.write(whr);
        writer.flush();

    */

        FileReader fr = new FileReader("C:\\Java\\input.txt");
        BufferedReader reader = new BufferedReader(fr);

        String[] line = reader.readLine().split(" ");

        String out = Integer.parseInt(line[2]) * 2 < Integer.parseInt(line[0]) && Integer.parseInt(line[2]) * 2 < Integer.parseInt(line[1]) ? "YES" : "NO";
        FileWriter writer = new FileWriter("C:\\Java\\output.txt");
        writer.write(out);
        writer.flush();
    }
}
