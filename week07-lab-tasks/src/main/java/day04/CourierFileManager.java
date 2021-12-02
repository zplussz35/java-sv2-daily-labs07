package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CourierFileManager {
    public Courier createCourierByFile(Path path){
            List<String> lines = readFile(path);
            Courier c = new Courier();
            Ride r;
            for (String line: lines) {
                String[] data=line.split(" ");
                r= new Ride(Integer.parseInt(data[0]),Integer.parseInt(data[0]),Integer.parseInt(data[0]));
                c.addRide(r);
            }
            return c;
    }

    private List<String> readFile(Path path) throws IllegalStateException{
        try{
            List<String> lines=Files.readAllLines(path);
            return lines;
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot read file!",ioe);
        }
    }
}
