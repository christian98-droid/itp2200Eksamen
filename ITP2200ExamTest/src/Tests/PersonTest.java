package Tests;

import HomeExerciseProgram.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

public class PersonTest {
    @Test
    public void personTest(){
        String fName = "Test";
        String lName = "Name";
        String prefExercise = "Strength";
        int accInt = 8;

        StrengthExercise se1 = new StrengthExercise("Biceps curl", "Curl your bicep using a dumbell", 6, 2, 3, 8, "Dumbell", 15);
        EnduranceExercise ee1 = new EnduranceExercise("Hill run", "Run up and down a hill", 6, 15, 3, 8, "None");
        FlexibilityExercise fe1 = new FlexibilityExercise("Hamstring streach", "Streach your hamstring", 6, 5, 3, 1, "None");
        BalanceExercise be1 = new BalanceExercise("Balance pillow", "Keep your balance on the pillow", 6, 3, 6, 4, "Balancing ");

        ArrayList<Exercise> exercises = new ArrayList<>();

        exercises.add(se1);
        exercises.add(ee1);
        exercises.add(fe1);
        exercises.add(be1);

        Program program = new Program(exercises);

        Person person1 = new Person(fName,lName,prefExercise,accInt,program);

        assertTrue(
                fName.equals(person1.getfName()) &&
                        lName.equals(person1.getlName()) &&
                        prefExercise.equals(person1.getPreferredExercise()) &&
                        (accInt == person1.getAcceptableIntensity()) &&
                        program.toString().equals(person1.getCurrentProgram().toString())
        );
    }
}
