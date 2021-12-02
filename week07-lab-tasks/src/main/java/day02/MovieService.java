package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private List<Movie> movies;

    public MovieService(Path path){
        this.movies=readFile(path);

    }

    private List<Movie> readFile(Path path) throws IllegalStateException{
        List<Movie> movies=new ArrayList<>();
        Movie movie;
        try{
            List<String> lines =Files.readAllLines(path);
            for (String line :lines) {
                String[] data=line.split(";");
                movie=new Movie(data[0],Integer.parseInt(data[1]),data[2]);
                movies.add(movie);
            }

            return movies;

        }catch(IOException ioe){
            throw new IllegalStateException("Cannot read file!",ioe);
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
