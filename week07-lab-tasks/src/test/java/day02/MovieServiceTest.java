package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {


    @Test
    void testInit(){
        MovieService movieService = new MovieService(Paths.get("src/main/resources/movies.csv"));

        assertEquals("Steven Spielberg", movieService.getMovies().get(0).getProducer());
    }

}