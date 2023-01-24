package JStudios_Software.Fish;

import java.io.IOException;
import java.util.Scanner;
public class Menu extends Fish_Functions {
    Fish_Functions fishobj = new Fish_Functions();
    Scanner input = new Scanner(System.in);
    int option = 0, run_counter = 0, feeding_time = 0, cleaning_time = 0;
    String fish_name = "";
    void menu() throws IOException {
        System.out.println("<°))))><");
        System.out.println("1. Feed \n2. Clean Tank \n3. Debug \n 4. Exit");

        option = input.nextInt();

        while (option != 4) {

            if(run_counter == 0) {

            }
            switch (option) {
                case 1 -> {
                    fishobj.feed();
                    option = input.nextInt();
                }
                case 2 -> {
                    fishobj.clean_tank();
                    option = input.nextInt();
                }
                case 3 -> {
                    fishobj.debug();
                    option = input.nextInt();
                }
                default -> {
                }
            }
            run_counter++;
        }
    }

    void first_time() {
        System.out.println("Let's name your fish. Type any name you like:");
        fish_name = input.next();

    }
}
