package JStudios_Software.Fish;

import java.io.IOException;
import java.util.Scanner;
public class Menu extends Fish_Functions {
    Fish_Functions fishobj = new Fish_Functions();
    Trackers trackers = new Trackers();
    Scanner input = new Scanner(System.in);
    int option = 0;
    void menu() throws IOException, InterruptedException {
        System.out.println("<°))))><");
        System.out.println("1. Feed \n2. Clean Tank \n3. Debug \n 4. Exit");

        option = input.nextInt();

        do {
            switch (option) {
                case 1 -> {
                    fishobj.feed();
                    System.out.println("<°))))><");
                    System.out.println("1. Feed \n2. Clean Tank \n3. Debug \n 4. Exit");
                    option = input.nextInt();
                }
                case 2 -> {
                    fishobj.clean_tank();
                    System.out.println("<°))))><");
                    System.out.println("1. Feed \n2. Clean Tank \n3. Debug \n 4. Exit");
                    option = input.nextInt();
                }
                case 3 -> {
                    fishobj.debug();
                    option = input.nextInt();
                }
                default -> {
                }
            }

        } while (option != 4);
    }
}
