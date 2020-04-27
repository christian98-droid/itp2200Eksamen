package Tests;

import HomeExerciseProgram.BalanceExercise;
import HomeExerciseProgram.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static HomeExerciseProgram.ExerciseManager.*;
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

    /**
     * recommendAppropriateProgramTest()
     *
     * This test-method is for testing for requirement 3c:
     * "A method for recommending, from a given collection of Programs, which is most appropriate for a given Person."
     *
     * This method also works as an integration-test. This test simulates a lot of the functionality, without user input.
     */
    @Test
    public void recommendAppropriateProgramTest(){
        // Adding all 40 Exercises of different intensity and type for testing purposes

        StrengthExercise se1 = new StrengthExercise("Knees down push-ups", "Push-ups while knees on the ground", 1, 3, 10, 3, "None", 0);
        StrengthExercise se2 = new StrengthExercise("Walking lunges", "Take one step, then get on one knee", 2, 4, 10, 3, "None/dumbbell", 0);
        StrengthExercise se3 = new StrengthExercise("Dumbbell shoulder press", "Use your dumbbell and push up over shoulders", 3, 4, 10, 3, "dumbbell", 7);
        StrengthExercise se4 = new StrengthExercise("Dumbbell step-ups", "One dumbbell in each arm, and one step up", 4, 5, 10, 4, "Dumbell", 15);
        StrengthExercise se5 = new StrengthExercise("Lateral raise", "Use dumbbells to target your lats", 5, 6, 10, 4, "Dumbbell", 5);
        StrengthExercise se6 = new StrengthExercise("Dumbbell triceps kickback", "Target your triceps", 6, 7, 3, 10, "Dumbbell", 5);
        StrengthExercise se7 = new StrengthExercise("Burpees", "Preform burpees non-stop", 7, 8, 3, 8, "None", 15);
        StrengthExercise se8 = new StrengthExercise("Regular plank", "Hold a regular plank position", 8, 9, 1, 1, "None", 0);
        StrengthExercise se9 = new StrengthExercise("Regular push-ups", "Push your body up using chest muscle.", 9, 10, 15, 4, "None", 0);
        StrengthExercise se10 = new StrengthExercise("Sideways plank", "Planking position only sideways", 10, 11, 1, 1, "None", 0);

        EnduranceExercise ee1 = new EnduranceExercise("Walk", "Walk in a normal pace", 1, 3, 1, 1, "None");
        EnduranceExercise ee2 = new EnduranceExercise("Fast walk", "Walk in a high tempo", 2, 4, 1, 1, "None");
        EnduranceExercise ee3 = new EnduranceExercise("Jump rope", "Using a rope, jump.", 3, 4, 100, 3, "Rope");
        EnduranceExercise ee4 = new EnduranceExercise("HIIT run", "Run up and down a hill", 4, 5, 1, 1, "None");
        EnduranceExercise ee5 = new EnduranceExercise("Jumping jacks", "Do jumping jacks", 5, 6, 20, 4, "Rope");
        EnduranceExercise ee6 = new EnduranceExercise("Cycling", "Cycle in a high+ tempo", 6, 7, 1, 1, "Bicycle");
        EnduranceExercise ee7 = new EnduranceExercise("Stairs run", "Run up an down stairs", 7, 8, 1, 1, "None");
        EnduranceExercise ee8 = new EnduranceExercise("Fast walk", "Jump, and don't let the rope stop", 8, 9, 2, 2, "Rope");
        EnduranceExercise ee9 = new EnduranceExercise("Rowing", "Row in high tempo", 9, 10, 5, 2, "Rowing machine");
        EnduranceExercise ee10 = new EnduranceExercise("Hill run", "Run up and down a hill", 10, 11, 2, 2, "None");

        FlexibilityExercise fe1 = new FlexibilityExercise("Hamstring stretch", "stretch your hamstring", 1, 3, 1, 1, "None");
        FlexibilityExercise fe2 = new FlexibilityExercise("Chest stretch", "stretch your chest using your arms against the wall", 2, 4, 1, 1, "None");
        FlexibilityExercise fe3 = new FlexibilityExercise("Leg stretch", "stretch your leg using wall", 3, 4, 1, 1, "None");
        FlexibilityExercise fe4 = new FlexibilityExercise("Back stretch", "stretch your hamstring", 4, 5, 1, 1, "None");
        FlexibilityExercise fe5 = new FlexibilityExercise("Bridge", "Make your body do a bridge", 5, 6, 1, 1, "None");
        FlexibilityExercise fe6 = new FlexibilityExercise("Lower back", "stretch your lower back", 6, 7, 1, 1, "None");
        FlexibilityExercise fe7 = new FlexibilityExercise("Shoulder stretch", "stretch your chest using your arms against the wall", 7, 8, 1, 1, "None");
        FlexibilityExercise fe8 = new FlexibilityExercise("Upper lats stretch", "stretch your lats", 8, 9, 1, 1, "None");
        FlexibilityExercise fe9 = new FlexibilityExercise("Decline stretch", "Regular decline stretch", 9, 10, 1, 1, "None");
        FlexibilityExercise fe10 = new FlexibilityExercise("Bridge", "Make your body do a bridge", 10, 11, 1, 1, "None");

        BalanceExercise be1 = new BalanceExercise("Balance pillow", "Keep your balance on the pillow", 1, 3, 6, 4, "Balancing ");
        BalanceExercise be2 = new BalanceExercise("Balance squat", "Squat down on one leg, keep your balance", 2, 4, 6, 5, "None");
        BalanceExercise be3 = new BalanceExercise("Line walk", "Walk on a line and keep your balance", 3, 4, 3, 2, "Line/Rope ");
        BalanceExercise be4 = new BalanceExercise("One handed push-up", "Push-ups with one hand", 4, 5, 6, 4, "None ");
        BalanceExercise be5 = new BalanceExercise("One legged hold jump", "Hold one leg in the air", 5, 6, 6, 5, "None");
        BalanceExercise be6 = new BalanceExercise("Heel-to-toe walk", "Walk from heel to heel.", 6, 7, 3, 2, "None ");
        BalanceExercise be7 = new BalanceExercise("Step-up", "Find an object to step up onto", 7, 8, 6, 4, "Stairs/Bench ");
        BalanceExercise be8 = new BalanceExercise("Sideways walking", "Walk sideways", 8, 9, 6, 5, "None");
        BalanceExercise be9 = new BalanceExercise("Simple grapevine", "Avoid dropping your hips as you step. ", 9, 10, 3, 2, "None ");
        BalanceExercise be10 = new BalanceExercise("One foot balance pillow", "Keep your balance on the pillow, one foot", 10, 11, 6, 4, "Balancing Pillow ");


        // We start by generating ArrayLists of exercises grouped by intensity.
        ArrayList<Exercise> exercises1 = new ArrayList<>();
        ArrayList<Exercise> exercises2 = new ArrayList<>();
        ArrayList<Exercise> exercises3 = new ArrayList<>();
        ArrayList<Exercise> exercises4 = new ArrayList<>();
        ArrayList<Exercise> exercises5 = new ArrayList<>();
        ArrayList<Exercise> exercises6 = new ArrayList<>();
        ArrayList<Exercise> exercises7 = new ArrayList<>();
        ArrayList<Exercise> exercises8 = new ArrayList<>();
        ArrayList<Exercise> exercises9 = new ArrayList<>();
        ArrayList<Exercise> exercises10 = new ArrayList<>();

        // Add the exercises
        exercises1.add(se1);
        exercises1.add(ee1);
        exercises1.add(fe1);
        exercises1.add(be1);

        exercises2.add(se2);
        exercises2.add(ee2);
        exercises2.add(fe2);
        exercises2.add(be2);

        exercises3.add(se3);
        exercises3.add(ee3);
        exercises3.add(fe3);
        exercises3.add(be3);

        exercises4.add(se4);
        exercises4.add(ee4);
        exercises4.add(fe4);
        exercises4.add(be4);

        exercises5.add(se5);
        exercises5.add(ee5);
        exercises5.add(fe5);
        exercises5.add(be5);

        exercises6.add(se6);
        exercises6.add(ee6);
        exercises6.add(fe6);
        exercises6.add(be6);

        exercises7.add(se7);
        exercises7.add(ee7);
        exercises7.add(fe7);
        exercises7.add(be7);

        exercises8.add(se8);
        exercises8.add(ee8);
        exercises8.add(fe8);
        exercises8.add(be8);

        exercises9.add(se9);
        exercises9.add(ee9);
        exercises9.add(fe9);
        exercises9.add(be9);

        exercises10.add(se10);
        exercises10.add(ee10);
        exercises10.add(fe10);
        exercises10.add(be10);

        // From there we create different Programs, passing the exercise-arrays into them
        Program program1 = new Program(exercises1);
        Program program2 = new Program(exercises2);
        Program program3 = new Program(exercises3);
        Program program4 = new Program(exercises4);
        Program program5 = new Program(exercises5);
        Program program6 = new Program(exercises6);
        Program program7 = new Program(exercises7);
        Program program8 = new Program(exercises8);
        Program program9 = new Program(exercises9);
        Program program10 = new Program(exercises10);

        ArrayList<Program> programs = new ArrayList<>();

        //Adding ArrayList of exercises into the ArrayList of Programs so
        // we can pass it through to the recommendAppropriateProgram method for testing
        programs.add(program1);
        programs.add(program2);
        programs.add(program3);
        programs.add(program4);
        programs.add(program5);
        programs.add(program6);
        programs.add(program7);
        programs.add(program8);
        programs.add(program9);
        programs.add(program10);


        //Creating Person-objects which we can pass through to the recommendAppropriateProgram method for testing
        Person p1 = new Person("Testcase1", "Testcase1", "Testcase1", 1);
        Person p2 = new Person("Testcase2", "Testcase2", "Testcase2", 6);
        Person p3 = new Person("Testcase3", "Testcase3", "Testcase3", 2);

        /*
        This method iterates through all the different Program-objects in the ArrayList of Programs, and
            stops when it finds the Program that matches the users preferred intensity. */
        recommendAppropriateProgram(p1,programs);
        recommendAppropriateProgram(p2,programs);
        recommendAppropriateProgram(p3,programs);

        // The method than passes the Program with the correct acceptableIntensity to
        // the setCurrentProgram() method inside the Person-class.

        assertTrue(
                p1.getCurrentProgram().getIntensityLevel() == 1 && //The expected value is 1, the acceptableIntensity of p1
                        p2.getCurrentProgram().getIntensityLevel() == 6 && //The expected value is 6, the acceptableIntensity of p2
                        p3.getCurrentProgram().getIntensityLevel() == 2 //The expected value is 2, the acceptableIntensity of p3
        );
    }
}

