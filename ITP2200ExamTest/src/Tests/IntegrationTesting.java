package Tests;

import HomeExerciseProgram.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static HomeExerciseProgram.ExerciseManager.generateUser;

public class IntegrationTesting {
    @Test
    public void integrationTest(){
        //TODO skrive ferdig denne testen
        FlexibilityExercise fe8 = new FlexibilityExercise("Upper lats stretch", "stretch your lats", 8, 9, 1, 1, "None");
        BalanceExercise be8 = new BalanceExercise("Sideways walking", "Walk sideways", 8, 9, 6, 5, "None");
        EnduranceExercise ee8 = new EnduranceExercise("Fast walk", "Jump, and don't let the rope stop", 8, 9, 2, 2, "Rope");
        StrengthExercise se8 = new StrengthExercise("Regular plank", "Hold a regular plank position", 8, 9, 1, 1, "None", 0);

        StrengthExercise se1 = new StrengthExercise("Knees down push-ups", "Push-ups while knees on the ground", 1, 3, 10, 3, "None", 0);
        EnduranceExercise ee1 = new EnduranceExercise("Walk", "Walk in a normal pace", 1, 3, 1, 1, "None");
        FlexibilityExercise fe1 = new FlexibilityExercise("Hamstring stretch", "stretch your hamstring", 1, 3, 1, 1, "None");
        BalanceExercise be1 = new BalanceExercise("Balance pillow", "Keep your balance on the pillow", 1, 3, 6, 4, "Balancing ");

        ArrayList<Exercise> exercises1 = new ArrayList<>();
        ArrayList<Exercise> exercises2 = new ArrayList<>();

        Program program1 = new Program(exercises1);
        Program program2 = new Program(exercises2);


        Person p1 = new Person("Test", "User", "Strength", 8, program2);
        Person p2 = new Person("Test2", "User2", "Endurance", 5);



    }
}
