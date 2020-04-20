/*
package Tests;

import HomeExerciseProgram.Exercise;
import HomeExerciseProgram.Program;
import HomeExerciseProgram.StrengthExercise;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertTrue;


public class ArraylistSortingTest {
    public static void main(String[] args){
        StrengthExercise s1 = new StrengthExercise(8,5,10,3,30,1,"Lift the barbell from shoulder-height and up", 33);
        StrengthExercise s2 = new StrengthExercise(9,7,10,3,50, 12, "Lift high",77);
        StrengthExercise s3 = new StrengthExercise(10,10,8,3,70,12, "Deadlifts", 88);


        ArrayList<Exercise> exercises = new ArrayList<>();

        // Adding the exercises with highest intensity first to check if they get sorted
        exercises.add(s3);
        exercises.add(s2);
        exercises.add(s1);

        Program p = new Program(exercises);

        int intensitySortedCheck = p.getExerciseArrayList().get(0).getIntensity();

        // The object with the lowest intensity should now be in the first index-spot - expected value = 8
        assertTrue(intensitySortedCheck == 8);
    }
}
*/