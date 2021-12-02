package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HumanTest {

    @Test
    void testIsValidName(){
        assertTrue(Human.isValidName("Zoltán Tóth"));
    }
    @Test
    void testIsValidYearOfBirth(){
        assertThrows(IllegalArgumentException.class,()->Human.isValidYearOfBirth(1999));
    }

}