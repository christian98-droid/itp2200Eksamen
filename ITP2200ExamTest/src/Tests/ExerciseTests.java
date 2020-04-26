package Tests;

import HomeExerciseProgram.Exercise;
import HomeExerciseProgram.StrengthExercise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ExerciseTests {

    @Test
    public void strengthExerciseTest(){
        String name = "Testname";
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
}
