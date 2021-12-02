package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store = new Store();

    @TempDir
    File tempFolder;

    @BeforeEach
    void init(){
            store.addProduct(new Product("alma", LocalDate.of(1999, Month.AUGUST,25),250));
            store.addProduct(new Product("körte", LocalDate.of(2002, Month.SEPTEMBER,25),250));
            store.addProduct(new Product("szilva", LocalDate.of(2021, Month.AUGUST,25),250));
    }

    @Test
    void testWriteToCsvFileWithMonth() throws IOException {
        Path path=tempFolder.toPath().resolve("result.txt");
        Path correctPath=store.writeToCsvByMonth(path,Month.AUGUST);


        List<String> lines = Files.readAllLines(correctPath);
        assertEquals("szilva",lines.get(1).split(";")[0]);

    }

    @Test
    void writeToCsvByMonth() {
    }
}