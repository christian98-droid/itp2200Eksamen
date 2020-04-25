package Tests;

import HomeExerciseProgram.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExerciseManagerTest {
    @Test
    public void generateUserTest() {
    }

    @Test
    public void test(){
        String test = "g";
        int x = ExerciseManager.stringToIntConverter(test);
        if(x == -1){ //Kan legge inn en slik if-statement under der man spør om input
            String y = "8";
            int test2 = ExerciseManager.stringToIntConverter(y);
            assertTrue(test2 == 8);
            System.out.println(test2);
        }
    }
}
