package JStudios_Software.Fish;

import java.io.*;
import java.util.Scanner;
import org.apache.commons.lang3.time.StopWatch;

public class Trackers {
    PrintWriter writer;
    StopWatch stopWatch = new StopWatch();
    int feeding = 0, cleaning = 0;
    public void create_writer() throws IOException {
        try {
            writer = new PrintWriter(new FileWriter("Values.txt", true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void reader() {
        try {
            File file = new File("C:/Users/JAAT2/Desktop/IntelliJ Projects/Fish/Values.txt");
            Scanner sc = new Scanner(file);
            int happy_file = 0;
            System.out.println(file.exists());
            while(sc.hasNextInt()) {
                int i = sc.nextInt();
                happy_file += i;
            }
            sc.close();
            System.out.println("the current happiness is " + happy_file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}