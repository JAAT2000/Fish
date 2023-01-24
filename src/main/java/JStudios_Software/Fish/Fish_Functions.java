package JStudios_Software.Fish;

import java.io.IOException;
public class Fish_Functions extends Trackers {
    Trackers trackersobj = new Trackers();
    int happiness = 0;

    public void writer() throws IOException {
        try {
            create_writer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        writer.println(happiness);
        writer.close();
    }
    //actual fish functions
    void feed() {
        happiness = happiness + 1;
        try {
            writer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("fish has been fed!");
    }
    void clean_tank() throws IOException {
        happiness = happiness + 1;
        writer();
        System.out.println("the tank has been cleaned!");
    }
    void debug() {
        trackersobj.reader();
    }
}