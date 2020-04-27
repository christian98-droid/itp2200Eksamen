package Tests;

import HomeExerciseProgram.*;
import org.junit.jupiter.api.Test;

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
    @Test
    public void enduranceExerciseTest(){
        String name = "Testname";
        String description = "Testdescription";
        int intensity = 8;
        int duration = 7;
        int reps = 6;
        int sets = 3;
        String equipment = "Test Equipment";

        EnduranceExercise enduranceExercise = new EnduranceExercise(name,description,intensity,duration,reps,sets,equipment);

        enduranceExercise.setName(name);
        enduranceExercise.setDescription(description);
        enduranceExercise.setIntensity(intensity);
        enduranceExercise.setDuration(duration);
        enduranceExercise.setRepetitions(reps);
        enduranceExercise.setSets(sets);
        enduranceExercise.setEquipment(equipment);

        assertTrue(
                name.equals(enduranceExercise.eName) &&
                        description.equals(enduranceExercise.eDescription) &&
                        intensity == enduranceExercise.getIntensity() &&
                        duration == enduranceExercise.getDuration() &&
                        reps == enduranceExercise.getRepetitions() &&
                        sets == enduranceExercise.getSets() &&
                        equipment.equals(enduranceExercise.equipment)
        );
    }

    @Test
    public void balanceExerciseTest(){
        String name = "Testname";
        String description = "Testdescription";
        int intensity = 8;
        int duration = 7;
        int reps = 6;
        int sets = 3;
        String equipment = "Test Equipment";

        BalanceExercise balanceExercise = new BalanceExercise(name,description,intensity,duration,reps,sets,equipment);

        balanceExercise.setName(name);
        balanceExercise.setDescription(description);
        balanceExercise.setIntensity(intensity);
        balanceExercise.setDuration(duration);
        balanceExercise.setRepetitions(reps);
        balanceExercise.setSets(sets);
        balanceExercise.setEquipment(equipment);

        assertTrue(
                name.equals(balanceExercise.eName) &&
                        description.equals(balanceExercise.eDescription) &&
                        intensity == balanceExercise.getIntensity() &&
                        duration == balanceExercise.getDuration() &&
                        reps == balanceExercise.getRepetitions() &&
                        sets == balanceExercise.getSets() &&
                        equipment.equals(balanceExercise.equipment)
        );
    }

    @Test
    public void flexibilityExerciseTest(){
        String name = "Testname";
        String description = "Testdescription";
        int intensity = 8;
        int duration = 7;
        int reps = 6;
        int sets = 3;
        String equipment = "Test Equipment";

        FlexibilityExercise flexibilityExercise = new FlexibilityExercise(name,description,intensity,duration,reps,sets,equipment);

        flexibilityExercise.setName(name);
        flexibilityExercise.setDescription(description);
        flexibilityExercise.setIntensity(intensity);
        flexibilityExercise.setDuration(duration);
        flexibilityExercise.setRepetitions(reps);
        flexibilityExercise.setSets(sets);
        flexibilityExercise.setEquipment(equipment);

        assertTrue(
                name.equals(flexibilityExercise.eName) &&
                        description.equals(flexibilityExercise.eDescription) &&
                        intensity == flexibilityExercise.getIntensity() &&
                        duration == flexibilityExercise.getDuration() &&
                        reps == flexibilityExercise.getRepetitions() &&
                        sets == flexibilityExercise.getSets() &&
                        equipment.equals(flexibilityExercise.equipment)
        );
    }
}
