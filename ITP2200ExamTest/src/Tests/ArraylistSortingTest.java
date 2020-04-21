package Tests;
import HomeExerciseProgram.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ArraylistSortingTest {
    @Test
    public static void main(String[] args){
        StrengthExercise se1 = new StrengthExercise("Benchpress", "Lie on bench and push barbell up", 7,5,8,3,"Barbell, bench",70);
        EnduranceExercise ee1 = new EnduranceExercise("Intervalls", "Run for 20 seconds, then walk for 10 seconds",9,6,10,0,"Anywhere you can run");
        FlexibilityExercise fe1 = new FlexibilityExercise("Stretch", "Do your desired stretch",1,10,0,0,"Nothing");
        BalanceExercise be1 = new BalanceExercise("Jumprope","Jump rope",4,5,0,3,"Rope");

        ArrayList<Exercise> exercises = new ArrayList<>();

        // Adding the exercises with highest intensity first to check if they get sorted
        exercises.add(se1);
        exercises.add(ee1);
        exercises.add(fe1);
        exercises.add(be1);

        Program p = new Program(exercises);

        int intensitySortedCheck = p.getExerciseArrayList().get(0).getIntensity();

        // The object with the lowest intensity should now be in the first index-spot - expected value = 1
        assertTrue(intensitySortedCheck == 1);
    }
}
