package HomeExerciseProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExerciseManager {
    public static void main(String[] args) { //La til en prøvetekst for å teste kode
        StrengthExercise s2 = new StrengthExercise(9,7,10,3,50, "dumbbell", "Lift high");
        StrengthExercise s1 = new StrengthExercise(8,5,10,3,30,"Barbell","Lift the barbell from shoulder-height and up");
        StrengthExercise s3 = new StrengthExercise(10,10,8,3,70,"Barbell", "Deadlifts");


        ArrayList<Exercise> exercises = new ArrayList<>();

        exercises.add(s2);
        exercises.add(s1);
        exercises.add(s3);

        Program p = new Program(exercises);


    }
}
