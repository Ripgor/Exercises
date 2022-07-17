import java.io.*;

public class Coin {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\Java\\input.txt");
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        int rd = Integer.parseInt(line);

        int zero = 0; int one = 0;

        for (int i = 0; i < rd; i++) {
            line = reader.readLine();
            if (line.equals("0")) zero += 1;
            else one += 1;
        }
        String min = Integer.toString(Math.min(zero, one));
        try (FileWriter writer = new FileWriter("C:\\Java\\output.txt")) {
            writer.write(min);
            writer.flush();
        } catch (IOException e) {
            throw new IOException();
        }
    }
}
