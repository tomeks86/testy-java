import java.io.FileNotFoundException;
import java.util.Formatter;

public class Testowa {
    public static void main(String[] args) {
        System.out.println("test!");
        System.out.println("test2!");
        try {
            Formatter f = new Formatter("test.dat");
            f.format("%s", "abc\n");
            f.format("%s", "abc\n");
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
