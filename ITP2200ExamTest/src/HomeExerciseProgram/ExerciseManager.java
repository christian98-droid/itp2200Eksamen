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

/*                                          Scanner in, (not finished just a start)
package homeExercisesPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseManager {

    public static void main(String[] args) {

        ArrayList<Exercise> userExercises = new ArrayList<>();
        Scanner userIn = new Scanner(System.in);
        String response = "";
        Boolean notDone = true;

        while (notDone) {

            System.out.println("Create strength exercise - (S)");
            System.out.println("Create endurance exercise - (E)");
            System.out.println("Create flexibility exercise - (F)");
            System.out.println("Create balance exercise - (B)");
            System.out.println("Print out program - (P)");
            System.out.println("Quit program - (Q)");

            response = userIn.nextLine();

            switch(response) {

                case "S":

                    Strength userStrengthExercise = generateStrengthExercise(userIn);
                    userExercises.add(userStrengthExercise);
                    break;

                case "E":

                    Endurance userEnduranceExercise = generateEnduranceExercise(userIn);
                    userExercises.add(userEnduranceExercise);
                    break;

                case "F":

                    Flexibility userFlexibilityExercise = generateFlexibilityExercise(userIn);
                    userExercises.add(userFlexibilityExercise);
                    break;


                case "B":

                    Balance userBalanceExercise = generateBalanceExercise(userIn);
                    userExercises.add(userBalanceExercise);
                    break;

                case "P":

                    //for(int i = 0; i > userExercises.size(); i++){

                      //  System.out.println(userExercises.get(i).toString());
                    //}

                    for(Exercise p : userExercises ){

                        System.out.println(p.toString());

                    }

                    break;

                case "Q":

                    notDone = false;
                    System.out.println("Exercise Manager is quitting");
                    break;

                default: System.out.println("User input is unknown");
                break;
            }
        }
    }


    // Can be tested to prevent user errors.
    private static String generateExerciseName(Scanner systemIn){

        System.out.println("Enter name of exercise:");
                String eNavn = systemIn.nextLine();
        return eNavn;
    }

    private static String generateDescription(Scanner systemIn){

        System.out.println("Describe exercise:");
        String eDescription = systemIn.nextLine();
        return eDescription;
    }

    private static int generateIntensity(Scanner systemIn){

        System.out.println("Enter intensity:");
        String intensity = systemIn.nextLine();
        int intensityInt = Integer.parseInt(intensity);
        return intensityInt;

    }

    private static int generateDuration(Scanner systemIn){

        System.out.println("Enter duration:");
        String duration = systemIn.nextLine();
        int durationInt = Integer.parseInt(duration);
        return durationInt;

    }

    private static int generateRepetitions(Scanner systemIn){

        System.out.println("Enter repetitions:");
        String repetitions = systemIn.nextLine();
        int repetitionsInt = Integer.parseInt(repetitions);
        return repetitionsInt;
    }

    private static int generateSets(Scanner systemIn){

        System.out.println("Enter sets:");
        String sets = systemIn.nextLine();
        int setsInt = Integer.parseInt(sets);
        return setsInt;

    }

    private static String generateEquipment(Scanner systemIn){

        System.out.println("Enter equipment:");
        String equipment = systemIn.nextLine();
        return equipment;

    }

    private static int generateWeights(Scanner systemIn){

        System.out.println("Enter weights in kg:");
        String weights = systemIn.nextLine();
        int weightsInt = Integer.parseInt(weights);
        return weightsInt;

    }

    private static Strength generateStrengthExercise(Scanner systemIn){

        String eName = generateExerciseName(systemIn);
        String eDescription = generateDescription(systemIn);
        int intensityInt = generateIntensity(systemIn);
        int durationInt = generateDuration(systemIn);
        int repetitionsInt = generateRepetitions(systemIn);
        int setsInt = generateSets(systemIn);
        String equipment = generateEquipment(systemIn);
        int weightsInt = generateWeights(systemIn);

        Strength userStrengthExercise = new Strength(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment, weightsInt);

        return userStrengthExercise;

    }

    private static Endurance generateEnduranceExercise(Scanner systemIn){

        String eName = generateExerciseName(systemIn);
        String eDescription = generateDescription(systemIn);
        int intensityInt = generateIntensity(systemIn);
        int durationInt = generateDuration(systemIn);
        int repetitionsInt = generateRepetitions(systemIn);
        int setsInt = generateSets(systemIn);
        String equipment = generateEquipment(systemIn);

        Endurance userEnduranceExercise = new Endurance(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment);

        return userEnduranceExercise;

    }

    private static Flexibility generateFlexibilityExercise(Scanner systemIn){

        String eName = generateExerciseName(systemIn);
        String eDescription = generateDescription(systemIn);
        int intensityInt = generateIntensity(systemIn);
        int durationInt = generateDuration(systemIn);
        int repetitionsInt = generateRepetitions(systemIn);
        int setsInt = generateSets(systemIn);
        String equipment = generateEquipment(systemIn);

        Flexibility userFlexibilityExercise = new Flexibility(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment);

        return userFlexibilityExercise;

    }

    private static Balance generateBalanceExercise(Scanner systemIn){

        String eName = generateExerciseName(systemIn);
        String eDescription = generateDescription(systemIn);
        int intensityInt = generateIntensity(systemIn);
        int durationInt = generateDuration(systemIn);
        int repetitionsInt = generateRepetitions(systemIn);
        int setsInt = generateSets(systemIn);
        String equipment = generateEquipment(systemIn);

        Balance userBalanceExercise = new Balance(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment);

        return userBalanceExercise;

    }

}                                       Random stuff
        /* ArrayList<Exercise> lightExercises = new ArrayList<>();
        ArrayList<Exercise> mediumExercises = new ArrayList<>();
        ArrayList<Exercise> hardExercises = new ArrayList<>();

        ArrayList<Program> programs = new ArrayList<>();


        Program light = new Program("Light program", 120, 3);
        Program medium = new Program("Medium program", 120, 5);
        Program hard = new Program("Hard program", 120, 9);


        Person p1 = new Person("Simen", "Kandahl", "Strenght", 7, medium);

        // Endurence exercises
        Strength se1 = new Strength("Bicep curler","Curl your biceps using a dumbell.", 10, 2, 4, 6, "Dumbell", 15);
        Strength se2 = new Strength("Push-ups","Lay flat and push your body up.", 9, 3, 4, 6, "Nothing", 15);
        Strength se3 = new Strength("Sit-ups","Lay on the back and use your abs.", 8, 3, 4, 6, "Nothing", 15);
        Strength se4 = new Strength("Squats","Squat down and push yourself up.", 5, 3, 4, 6, "Nothing", 15);
        Strength se5 = new Strength("Pull-ups","Find something you can hang from and pull up.", 6, 2, 4, 6, "Nothing", 15);
        Strength se6 = new Strength("Triceps","Using a dumbell, target your triceps.", 3, 2, 4, 6, "Dumbell", 15);

        Endurance ee1 = new Endurance("Jump Rope","Jump using a jumping rod.", 7, 7, 1, 1, "Rope");
        Endurance ee2 = new Endurance("Run HIT","Run up a hill.", 8, 7, 1, 1, "Nothing");
        Endurance ee3 = new Endurance("Jogging","Slow jogging.", 7, 7, 1, 1, "Nothing");
        Endurance ee4 = new Endurance("Rowing","Rowing on machine.", 5, 7, 1, 1, "Rowing machine");
        Endurance ee5 = new Endurance("Walk","Walk with a good pace.", 3, 7, 1, 1, "Nothing");
        Endurance ee6 = new Endurance("Hill run","HIIT Hillrun.", 10, 7, 1, 1, "Nothing");

        Balance be1 = new Balance("Balance pillow","Balance on a balancing pillow.", 3, 3, 2, 1, "Balancing pillow");
        Balance be2 = new Balance("Balance squat","Squat while on one foot.", 5, 3, 2, 1, "Nothing");
        Balance be3 = new Balance("Line walk","Balance on a line or rope.", 6, 3, 2, 1, "Rope / Line");
        Balance be4 = new Balance("Jump leg","Jump and land on one leg.", 3, 3, 2, 1, "Balancing pillow");
        Balance be5 = new Balance("Plank","Keep a plank position.", 3, 3, 2, 1, "Balancing pillow");
        Balance be6 = new Balance("Handstand","Hold a handstand.", 9, 3, 2, 1, "Balancing pillow");

        Flexibility fe1 = new Flexibility("Hamstring","Stretch your hamstring.", 8, 0, 1, 1, "Nothing");
        Flexibility fe2 = new Flexibility("Chest stretch","Stretch your chest by placing arm on a wall, and turn.", 3, 0, 1, 1, "None");
        Flexibility fe3 = new Flexibility("Akilles stretch ","Streach your akilles", 7, 0, 1, 1, "None");
        Flexibility fe4 = new Flexibility("bla bla ","Streach your bla bla", 3, 0, 1, 1, "None");
        Flexibility fe5 = new Flexibility("hey hey ","Streach your hey hey", 2, 0, 1, 1, "None");
        Flexibility fe6 = new Flexibility("osv osv.. ","Streach your osv osv", 9, 0, 1, 1, "None");


// Adding exercises to programs. light // medium // hard

        lightExercises.add(se6);
        lightExercises.add(ee5);
        lightExercises.add(be5);
        lightExercises.add(fe5);

        mediumExercises.add(se4);
        mediumExercises.add(ee4);
        mediumExercises.add(be3);
        mediumExercises.add(fe4);

        hardExercises.add(se1);
        hardExercises.add(ee6);
        hardExercises.add(be6);
        hardExercises.add(fe6);


    } */
