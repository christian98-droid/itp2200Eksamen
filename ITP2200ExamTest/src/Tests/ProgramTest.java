package Tests;

import HomeExerciseProgram.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ProgramTest { //TODO lage flere inputs og teste for flere bugs

    //Requirement 1c. Each program has the exercises sorted in order of increasing intensity.
    @Test
    public void arraySortedByIntensityTest(){
        //Input a number from 1-10, with the lowest number NOT in the first int
        int i1 = 9;
        int i2 = 3;
        int i3 = 10;
        int i4 = 1;

        //Write the variable with the highest intensity
        int expectedResult = i4;

        StrengthExercise se1 = new StrengthExercise("Benchpress", "x", i1,5,8,3,"x",70);
        EnduranceExercise ee1 = new EnduranceExercise("Intervalls", "x",i2,6,10,0,"x");
        FlexibilityExercise fe1 = new FlexibilityExercise("Stretch", "x",i3,10,0,0,"x");
        BalanceExercise be1 = new BalanceExercise("Jumprope","x",i4,5,0,3,"x");

        ArrayList<Exercise> exercises = new ArrayList<>();

        // Adding the exercises with higher intensity first to check if they get sorted
        exercises.add(se1);
        exercises.add(ee1);
        exercises.add(fe1);
        exercises.add(be1);

        Program p = new Program(exercises);

        int index0intensity = p.getExerciseArrayList().get(0).getIntensity();

        // The object with the lowest intensity should now be in the first index-spot -
        // Expected value = 1 (the lowest number you input at the top)
        assertTrue(index0intensity == expectedResult);
    }

    //Requirement 1a.  Each program keeps an account of the overall intensity (the highest intensity
    //among the included exercises). This tests the method in the Program class which finds the highest intensity
    @Test
    public void findHighestIntensityTest(){
        int i1 = 8;
        int i2 = 5;
        int i3 = 9;
        int i4 = 2;

        //Write the variable with the highest intensity
        int expectedResult = 9;

        //Adding the integers to the objects
        StrengthExercise se1 = new StrengthExercise("Benchpress", "x", i1,5,8,3,"x",70);
        EnduranceExercise ee1 = new EnduranceExercise("Intervalls", "x",i2,6,10,0,"x");
        FlexibilityExercise fe1 = new FlexibilityExercise("Stretch", "x",i3,10,0,0,"x");
        BalanceExercise be1 = new BalanceExercise("Jumprope","x",i4,5,0,3,"x");

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

    @Test
    public void findTotalDurationTest(){
        int d1 = 5;
        int d2 = 6;
        int d3 = 10;
        int d4 = 10;

        int expectedResult = (d1 + d2 + d3 + d4) * 2;

        //Adding the integers to the objects
        StrengthExercise se1 = new StrengthExercise("Benchpress", "x", 7,d1,8,3,"x",70);
        EnduranceExercise ee1 = new EnduranceExercise("Intervalls", "x",9,d2,10,0,"x");
        FlexibilityExercise fe1 = new FlexibilityExercise("Stretch", "x",1,d3,0,0,"x");
        BalanceExercise be1 = new BalanceExercise("Jumprope","x",3,d4,0,3,"x");

        ArrayList<Exercise> exercises = new ArrayList<>();
        exercises.add(se1);
        exercises.add(ee1);
        exercises.add(fe1);
        exercises.add(be1);

        Program p = new Program(exercises);

        int result = p.findTotalDuration(exercises);

        assertTrue(expectedResult == result);
    }
    @Test
    public void balancedProgramCheckTest(){
        StrengthExercise se1 = new StrengthExercise("Biceps curl", "Curl your bicep using a dumbell", 6, 2, 3, 8, "Dumbell", 15);
        EnduranceExercise ee1 = new EnduranceExercise("Hill run", "Run up and down a hill", 6, 15, 3, 8, "None");
        FlexibilityExercise fe1 = new FlexibilityExercise("Hamstring streach", "Streach your hamstring", 6, 5, 3, 1, "None");
        BalanceExercise be1 = new BalanceExercise("Balance pillow", "Keep your balance on the pillow", 6, 3, 6,4, "Balancing ");

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

        //Adding 3 of 4 of the exercises. Expected return FALSE
        exercises.add(se1);
        exercises.add(se1);
        exercises.add(fe1);
        exercises.add(be1);

        assertFalse(p.balancedProgramCheck(exercises));
    }
}
