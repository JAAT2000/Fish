package JStudios_Software.Fish;

import java.io.IOException;
public class Main extends Menu {
    public static void main(String[]args) throws IOException, InterruptedException {

        Menu menuobj = new Menu();
        Trackers trackers = new Trackers();

        menuobj.menu();
    }
}