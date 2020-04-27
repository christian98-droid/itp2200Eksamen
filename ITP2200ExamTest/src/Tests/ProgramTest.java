package Tests;

import HomeExerciseProgram.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ProgramTest {

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
     * The first test, balancedProgramCheckTestFalse, will check if the Program will be considered not balanced
     * The second test, balancedProgramCheckTestTrue, will check if the Program will be considered balanced
     */
    @Test
    public void balancedProgramCheckTestFalse() {
        StrengthExercise se1 = new StrengthExercise("Biceps curl", "Curl your bicep using a dumbell", 6, 2, 3, 8, "Dumbell", 15);
        FlexibilityExercise fe1 = new FlexibilityExercise("Hamstring streach", "Streach your hamstring", 6, 5, 3, 1, "None");
        BalanceExercise be1 = new BalanceExercise("Balance pillow", "Keep your balance on the pillow", 6, 3, 6, 4, "Balancing ");
        StrengthExercise se2 = new StrengthExercise("Walking lunges", "Take one step, then get on one knee", 2, 4, 10, 3, "None/dumbbell", 0);

        ArrayList<Exercise> exercises = new ArrayList<>();

        //Adding 3 of the 4 needed exercises to be considered balanced. Endurance missing and expected return is FALSE
        exercises.add(se1);
        exercises.add(se2);
        exercises.add(fe1);
        exercises.add(be1);

        Program p = new Program(exercises);

        //Checking if the method returns the expected FALSE
        assertFalse(p.balancedProgramCheck(exercises));
    }

    @Test
    public void balancedProgramCheckTestTrue() {
        StrengthExercise se1 = new StrengthExercise("Biceps curl", "Curl your bicep using a dumbell", 6, 2, 3, 8, "Dumbell", 15);
        EnduranceExercise ee1 = new EnduranceExercise("Hill run", "Run up and down a hill", 6, 15, 3, 8, "None");
        FlexibilityExercise fe1 = new FlexibilityExercise("Hamstring streach", "Streach your hamstring", 6, 5, 3, 1, "None");
        BalanceExercise be1 = new BalanceExercise("Balance pillow", "Keep your balance on the pillow", 6, 3, 6, 4, "Balancing ");

        ArrayList<Exercise> exercises = new ArrayList<>();

        //Adding one of each exercise to make the program balanced
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
    public void arraySortedByIntensityTestTrue() {
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

        //Passing the array to the Program-class will automatically sort it through the Overridden Comparator-method
        //which can be found in line 25~
        Program p = new Program(exercises);

        boolean sorted = true;

        for (int i = 0; i < p.getExerciseArrayList().size() - 1; i++) {
            if(!((p.getExerciseArrayList().get(i).getIntensity()) < (p.getExerciseArrayList().get(i + 1).getIntensity()))) {
                sorted = false;
                break;
            }
        }

        assertTrue(sorted);
    }
    @Test
    public void arraySortedByIntensityTestFalse() {
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
        exercises.get(0).setIntensity(7);
        exercises.get(1).setIntensity(2);
        exercises.get(2).setIntensity(10);
        exercises.get(3).setIntensity(5);

        //Passing the array to the Program-class will automatically sort it through the Overridden Comparator-method
        //which can be found in line 25~
        Program p = new Program(exercises);

        boolean sorted = true;

        //Changing the value of the second index spot from 5 t0 10 after the array has ben sorted
        //to check if it returns false, as expected (intensities in the array is now 2,10,7,10)
        p.getExerciseArrayList().get(1).setIntensity(10);

        for (int i = 0; i < p.getExerciseArrayList().size() - 1; i++) {
            if(!((p.getExerciseArrayList().get(i).getIntensity()) < (p.getExerciseArrayList().get(i + 1).getIntensity()))) {
                sorted = false;
                break;
            }
        }

        assertFalse(sorted);
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