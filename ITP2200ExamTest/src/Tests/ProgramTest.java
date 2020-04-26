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
     */
    @Test
    public void balancedProgramCheckTest() {
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

        exercises.clear();

        //Adding 3 of the exercises. 1 missing and expected return is FALSE
        exercises.add(se1);
        exercises.add(se1);
        exercises.add(fe1);
        exercises.add(be1);

        assertFalse(p.balancedProgramCheck(exercises));
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

        System.out.println("Test of array-sorting method" + "\n" +
                "Numbers before: " + a + ", " + b + ", " + c + ", " + d + "\n" +
                "Numbers after: " + p.getExerciseArrayList().get(0).getIntensity() + ", " +
                p.getExerciseArrayList().get(1).getIntensity() + ", " +
                p.getExerciseArrayList().get(2).getIntensity() + ", " +
                p.getExerciseArrayList().get(3).getIntensity()
        );
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

/*
* String name = "Testname";
        String description = "Testdescription";
        int intensity = 8;
        int duration = 7;
        int reps = 6;
        int sets = 3;
        String equipment = "Test Equipment";
        int weights = 55;

        StrengthExercise strengthExercise = new StrengthExercise(name,description,intensity,duration,reps,sets,equipment,weights);

        strengthExercise.setName(name);
        strengthExercise.setDescription(description);
        strengthExercise.setIntensity(intensity);
        strengthExercise.setDuration(duration);
        strengthExercise.setRepetitions(reps);
        strengthExercise.setSets(sets);
        strengthExercise.setEquipment(equipment);
        strengthExercise.setWeights(weights);

        assertTrue(
                name.equals(strengthExercise.eName) &&
                description.equals(strengthExercise.eDescription) &&
                intensity == strengthExercise.getIntensity() &&
                duration == strengthExercise.getDuration() &&
                reps == strengthExercise.getRepetitions() &&
                sets == strengthExercise.getSets() &&
                equipment.equals(strengthExercise.equipment) &&
                weights == strengthExercise.weights
        );
    }
* */