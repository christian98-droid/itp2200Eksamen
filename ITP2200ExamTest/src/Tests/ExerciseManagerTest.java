package Tests;

import HomeExerciseProgram.BalanceExercise;
import HomeExerciseProgram.ExerciseManager;
import HomeExerciseProgram.*;
import org.junit.jupiter.api.Test;


import java.util.Scanner;

import static HomeExerciseProgram.ExerciseManager.parseIntensity;
import static HomeExerciseProgram.ExerciseManager.stringToIntConverter;
import static HomeExerciseProgram.ExerciseManager.generateUser;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExerciseManagerTest {
    @Test
    public void generateUserTest(){
    }

    @Test
    public void generateBalanceExerciseTest(){
        /*
        String eName;
        String eDescription;
        String equipment;
        int intensityInt;
        int durationInt;
        int repetitionsInt;
        int setsInt;


        generateBalanceExercise().eName = "test";
        generateBalanceExercise().eDescription = "testy";
        generateBalanceExercise().equipment = "tesda";
        generateBalanceExercise().intensity = 1;
        generateBalanceExercise().duration = 2;
        generateBalanceExercise().repetitions = 3;
        generateBalanceExercise().sets = 5;

        generateBalanceExercise().
*/
    }

    /** The method tested in the following tests can be found in the ExerciseManager class.
     * This test aims to test the output of the method stringToIntConverter given
     * different possible inputs from the user. The aim is to not crash our program and provide the program
     * an oppertunity to give the user another chance to input data.
     * We accomplish that by exception handling with a try-catch statement.
     */
    @Test
    public void stringToIntConverterTestSuccess() {
        String testcaseInteger = "6"; //Expected value after converting will be the integer 6
        assertTrue(stringToIntConverter(testcaseInteger) == 6);
    }
    @Test
    public void stringToIntConverterTestExceptionCaught(){
        String testcaseString = "wrong input"; //Expected value will be -1, wrong input, string
        assertTrue(stringToIntConverter(testcaseString) == -1);

    }

    /** The following tests aims to test the output of the method parseIntensity. This method is used to process
     * user input from string to integer, and handle exception if the user types a string instead of integer.
     * The method also checks if the user input is within allowed range (1-10).
     * The method will return -1 if the input is wrong.
     * We have chosen to put each test-value in a seperate test to more easily figure out whats wrong should something come up in a later stage
     */
    @Test
    public void parseIntensityTestInteger() {
        String testcaseInteger = "8"; //Expected output will be the integer 8, converted successfully
        assertTrue(parseIntensity(testcaseInteger) == 8);
    }
    @Test
    public void parseIntensityTestString(){
        String testcaseString = "wrong input"; //Expected output will be -1, due to wrong input
        assertTrue(parseIntensity(testcaseString) == -1);
    }
    @Test
    public void parseIntensityTestStringAndInteger(){
        String testcaseStringAndInteger = "test8 8";
        assertTrue(parseIntensity(testcaseStringAndInteger) == -1);
    }
    @Test
    public void parseIntensityTestTooSmallNumber(){
        String testcaseTooSmallNumber = "0"; //Expected output will be -1, not within the accepted range (1-10)
        assertTrue(parseIntensity(testcaseTooSmallNumber) == -1);

    }
    @Test
    public void parseIntensityTestTooBigNumber(){
        String testcaseTooBigNumber = "11"; ////Expected output will be -1, not within the accepted range (1-10)
        assertTrue(parseIntensity(testcaseTooBigNumber) == -1);

    }
    @Test
    public void parseIntensityTestDecimal(){
        String testcaseDecimal = "9.2"; //Expected output will be -1, decimal not allowed input
        assertTrue(parseIntensity(testcaseDecimal) == -1);
    }

    @Test
    public void recommendAppropriateProgramTest(){
        //TODO skrive ferdig denne testen
        /*
        BalanceExercise be8 = new BalanceExercise("Sideways walking", "Walk sideways", 8, 9, 6, 5, "None");
        Person p = new Person("Test", "Ja", "Strength", 8,//program);

         */
    }

    //TODO integration testing?
}

