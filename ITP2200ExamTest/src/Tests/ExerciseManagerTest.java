package Tests;

import HomeExerciseProgram.BalanceExercise;
import HomeExerciseProgram.ExerciseManager;
import org.junit.jupiter.api.Test;


import static HomeExerciseProgram.ExerciseManager.parseIntensity;
import static HomeExerciseProgram.ExerciseManager.stringToIntConverter;
import static HomeExerciseProgram.ExerciseManager.generateBalanceExercise;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExerciseManagerTest {
    @Test
    public void generateUserTest() {
    }

    @Test
    public void generateBalanceExerciseTest(){
    }

    @Test
    public void stringToIntConverterTest() {
        /**
         * This test aims to test the output of the method stringToIntConverter, given
         * different possible inputs from the user. The aim is to not crash our program and provide the program
         * an oppertunity to give the user another chance to input data.
         * We accomplish that by exception handling with a try-catch statement.
         */
        String testcaseString = "wrong input"; //Expected value will be -1, wrong input, string
        String testcaseInteger = "6"; //Expected value after converting will be the integer 6
        assertTrue(stringToIntConverter(testcaseString) == -1);
        assertTrue(stringToIntConverter(testcaseInteger) == 6);
    }

    @Test
    public void parseIntensityTest() {
        /** This test aims to test the output of the method parseIntensity. This method is used to process
         * user input from string to integer, and handle exception if the user types a string instead of integer.
         * The method also checks if the user input is within allowed range (1-10).
         * The method will return -1 if the input is wrong.
         */
        String testcaseInteger = "8"; //Expected output will be the integer 8, converted successfully
        String testcaseString = "wrong input"; //Expected output will be -1, due to wrong input
        String testcaseTooSmallNumber = "0"; //Expected output will be -1, not within the accepted range (1-10)
        String testcaseTooBigNumber = "11"; //Same as above
        String testcaseDecimal = "9.2"; //Expected output will be -1, decimal not allowed input

        assertTrue(parseIntensity(testcaseInteger) == 8);
        assertTrue(parseIntensity(testcaseString) == -1);
        assertTrue(parseIntensity(testcaseTooSmallNumber) == -1);
        assertTrue(parseIntensity(testcaseTooBigNumber) == -1);
        assertTrue(parseIntensity(testcaseDecimal) == -1);
    }
}

