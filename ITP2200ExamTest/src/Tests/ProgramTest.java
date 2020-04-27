package Tests;

import HomeExerciseProgram.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ProgramTest { //TODO lage flere inputs og teste for flere bugs

    /** findHighestIntensityTest
     * This method aims to test for requirement 1A:
     * "Each program keeps an account of the overall intensity (the highest intensity
     * among the included exercises)." This tests the method in the Program class which finds the highest intensity
     */

    @Test
    public void findHighestIntensityTest() {
        //I chose to make 4 ints for input, rather than putting the intensity in the object itself, for easier use of test-inputs
        int i1 = 8;
        int i2 = 5;
        int i3 = 9;
        int i4 = 2;

        //Write the variable with the highest intensity
        int expectedResult = 9;

        //Adding the integers to the objects
        StrengthExercise se1 = new StrengthExercise("Benchpress", "x", i1, 5, 8, 3, "x", 70);
        EnduranceExercise ee1 = new EnduranceExercise("Intervalls", "x", i2, 6, 10, 0, "x");
        FlexibilityExercise fe1 = new FlexibilityExercise("Stretch", "x", i3, 10, 0, 0, "x");
        BalanceExercise be1 = new BalanceExercise("Jumprope", "x", i4, 5, 0, 3, "x");

        //Creating an array to pass to the Program-class
        ArrayList<Exercise> exercises = new ArrayList<>();
        exercises.add(se1);
        exercises.add(ee1);
        exercises.add(fe1);
        exercises.add(be1);
        Program p = new Program(exercises);

        //Using the method getIntensityLevel within the Program-class to obtain the result
        assertTrue(expectedResult == p.getIntensityLevel());
    }

    /** balancedProgramCheckTest
     * This method aims to test for requirement 1B:
     * "Each program keeps account of whether or not it is balanced.
     * A balanced program has at least one exercise of each type."
     * The first test, balancedProgramCheckTestTrue, will check if the Program will be considered balanced
     * The second test, balancedProgramCheckTestFalse, will check if the Program will be considered not balanced
     */
    @Test
    public void balancedProgramCheckTestFalse() {
        StrengthExercise se1 = new StrengthExercise("Biceps curl", "Curl your bicep using a dumbell", 6, 2, 3, 8, "Dumbell", 15);
        FlexibilityExercise fe1 = new FlexibilityExercise("Hamstring streach", "Streach your hamstring", 6, 5, 3, 1, "None");
        BalanceExercise be1 = new BalanceExercise("Balance pillow", "Keep your balance on the pillow", 6, 3, 6, 4, "Balancing ");

        ArrayList<Exercise> exercises = new ArrayList<>();

        //Adding 3 of the 4 needed exercises to be considered balanced. 1 missing and expected return is FALSE
        exercises.add(se1);
        exercises.add(fe1);
        exercises.add(be1);

        Program p = new Program(exercises);

        assertFalse(p.balancedProgramCheck(exercises));
    }

    @Test
    public void balancedProgramCheckTestTrue() {
        StrengthExercise se1 = new StrengthExercise("Biceps curl", "Curl your bicep using a dumbell", 6, 2, 3, 8, "Dumbell", 15);
        EnduranceExercise ee1 = new EnduranceExercise("Hill run", "Run up and down a hill", 6, 15, 3, 8, "None");
        FlexibilityExercise fe1 = new FlexibilityExercise("Hamstring streach", "Streach your hamstring", 6, 5, 3, 1, "None");
        BalanceExercise be1 = new BalanceExercise("Balance pillow", "Keep your balance on the pillow", 6, 3, 6, 4, "Balancing ");

        ArrayList<Exercise> exercises = new ArrayList<>();

        //Adding one of each exercise
        exercises.add(se1);
        exercises.add(ee1);
        exercises.add(fe1);
        exercises.add(be1);

        Program p = new Program(exercises);

        //Checking if the method returns the expected TRUE
        assertTrue(p.balancedProgramCheck(exercises));
    }


    /** arraySortedByIntensityTest
     * This method aims to test for requirement 1C:
     * "Each program has the exercises sorted in order of increasing intensity."
     */
    @Test
    public void arraySortedByIntensityTest() {
        StrengthExercise se1 = new StrengthExercise("Benchpress", "x", 0, 5, 8, 3, "x", 70);
        EnduranceExercise ee1 = new EnduranceExercise("Intervalls", "x", 0, 6, 10, 0, "x");
        FlexibilityExercise fe1 = new FlexibilityExercise("Stretch", "x", 0, 10, 0, 0, "x");
        BalanceExercise be1 = new BalanceExercise("Jumprope", "x", 0, 5, 0, 3, "x");

        ArrayList<Exercise> exercises = new ArrayList<>();

        exercises.add(se1);
        exercises.add(ee1);
        exercises.add(fe1);
        exercises.add(be1);

        /**
         * Use these setters for test-input
         */
        exercises.get(0).setIntensity(9);
        exercises.get(1).setIntensity(4);
        exercises.get(2).setIntensity(10);
        exercises.get(3).setIntensity(7);

        //variables for print output
        int a = exercises.get(0).getIntensity();
        int b = exercises.get(1).getIntensity();
        int c = exercises.get(2).getIntensity();
        int d = exercises.get(3).getIntensity();

        //Passing the array to the Program-class will automatically sort it through the Overridden Comparator-method
        //which can be found in line 25~
        Program p = new Program(exercises);

        boolean sorted = false;

        for (int i = 0; i < p.getExerciseArrayList().size() - 1; i++) {
            if (p.getExerciseArrayList().get(i).getIntensity() < p.getExerciseArrayList().get(i + 1).getIntensity()) {
                sorted = true;
            }
        }

        assertTrue(sorted == true);
    }

    /** findTotalDurationTest
     * This method is for testing for requirement 1D:
     * "Each program has an overall duration. The duration of an exercise is the twice the sum
     * of the durations of all the exercises it includes (to account for rest)."
     */
    @Test
    public void findTotalDurationTest() {
        /**
         * Use these ints for test-input
         */
        int d1 = 5;
        int d2 = 6;
        int d3 = 10;
        int d4 = 10;

        int expectedResult = (d1 + d2 + d3 + d4) * 2;

        //Adding the integers to the objects
        StrengthExercise se1 = new StrengthExercise("Benchpress", "x", 7, d1, 8, 3, "x", 70);
        EnduranceExercise ee1 = new EnduranceExercise("Intervalls", "x", 9, d2, 10, 0, "x");
        FlexibilityExercise fe1 = new FlexibilityExercise("Stretch", "x", 1, d3, 0, 0, "x");
        BalanceExercise be1 = new BalanceExercise("Jumprope", "x", 3, d4, 0, 3, "x");

        ArrayList<Exercise> exercises = new ArrayList<>();
        exercises.add(se1);
        exercises.add(ee1);
        exercises.add(fe1);
        exercises.add(be1);

        //Passing the array to the Program-class will automatically pass it through the findTotalDuration-method
        Program p = new Program(exercises);

        int result = p.findTotalDuration(exercises);

        assertTrue(expectedResult == result);
    }
}