package HomeExerciseProgram;
import java.util.Scanner;
import java.util.ArrayList;

//                                 Scanner in, (not finished just a start)

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

            switch (response) {

                case "S":

                    StrengthExercise userStrengthExercise = generateStrengthExercise(userIn);
                    userExercises.add(userStrengthExercise);
                    break;

                case "E":

                    EnduranceExercise userEnduranceExercise = generateEnduranceExercise(userIn);
                    userExercises.add(userEnduranceExercise);
                    break;

                case "F":

                    FlexibilityExercise userFlexibilityExercise = generateFlexibilityExercise(userIn);
                    userExercises.add(userFlexibilityExercise);
                    break;


                case "B":

                    BalanceExercise userBalanceExercise = generateBalanceExercise(userIn);
                    userExercises.add(userBalanceExercise);
                    break;

                case "P":

                    //for(int i = 0; i > userExercises.size(); i++){

                    //  System.out.println(userExercises.get(i).toString());
                    //}

                    for (Exercise p : userExercises) {

                        System.out.println(p.toString());

                    }

                    break;

                case "Q":

                    notDone = false;
                    System.out.println("Exercise Manager is quitting");
                    break;

                default:
                    System.out.println("User input is unknown");
                    break;
            }
        }
    }


    // Can be tested to prevent user errors.
    private static String generateExerciseName(Scanner systemIn) {

        System.out.println("Enter name of exercise:");
        String eNavn = systemIn.nextLine();
        return eNavn;
    }

    private static String generateDescription(Scanner systemIn) {

        System.out.println("Describe exercise:");
        String eDescription = systemIn.nextLine();
        return eDescription;
    }

    private static int generateIntensity(Scanner systemIn) {

        System.out.println("Enter intensity:");
        String intensity = systemIn.nextLine();
        int intensityInt = Integer.parseInt(intensity);
        return intensityInt;

    }

    private static int generateDuration(Scanner systemIn) {

        System.out.println("Enter duration:");
        String duration = systemIn.nextLine();
        int durationInt = Integer.parseInt(duration);
        return durationInt;

    }

    private static int generateRepetitions(Scanner systemIn) {

        System.out.println("Enter repetitions:");
        String repetitions = systemIn.nextLine();
        int repetitionsInt = Integer.parseInt(repetitions);
        return repetitionsInt;
    }

    private static int generateSets(Scanner systemIn) {

        System.out.println("Enter sets:");
        String sets = systemIn.nextLine();
        int setsInt = Integer.parseInt(sets);
        return setsInt;

    }

    private static String generateEquipment(Scanner systemIn) {

        System.out.println("Enter equipment:");
        String equipment = systemIn.nextLine();
        return equipment;

    }

    private static int generateWeights(Scanner systemIn) {

        System.out.println("Enter weights in kg:");
        String weights = systemIn.nextLine();
        int weightsInt = Integer.parseInt(weights);
        return weightsInt;

    }

    private static StrengthExercise generateStrengthExercise(Scanner systemIn) {

        String eName = generateExerciseName(systemIn);
        String eDescription = generateDescription(systemIn);
        int intensityInt = generateIntensity(systemIn);
        int durationInt = generateDuration(systemIn);
        int repetitionsInt = generateRepetitions(systemIn);
        int setsInt = generateSets(systemIn);
        String equipment = generateEquipment(systemIn);
        int weightsInt = generateWeights(systemIn);

        StrengthExercise userStrengthExercise = new StrengthExercise(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment, weightsInt);

        return userStrengthExercise;

    }

    private static EnduranceExercise generateEnduranceExercise(Scanner systemIn) {

        String eName = generateExerciseName(systemIn);
        String eDescription = generateDescription(systemIn);
        int intensityInt = generateIntensity(systemIn);
        int durationInt = generateDuration(systemIn);
        int repetitionsInt = generateRepetitions(systemIn);
        int setsInt = generateSets(systemIn);
        String equipment = generateEquipment(systemIn);

        EnduranceExercise userEnduranceExercise = new EnduranceExercise(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment);

        return userEnduranceExercise;

    }

    private static FlexibilityExercise generateFlexibilityExercise(Scanner systemIn) {

        String eName = generateExerciseName(systemIn);
        String eDescription = generateDescription(systemIn);
        int intensityInt = generateIntensity(systemIn);
        int durationInt = generateDuration(systemIn);
        int repetitionsInt = generateRepetitions(systemIn);
        int setsInt = generateSets(systemIn);
        String equipment = generateEquipment(systemIn);

        FlexibilityExercise userFlexibilityExercise = new FlexibilityExercise(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment);

        return userFlexibilityExercise;

    }

    private static BalanceExercise generateBalanceExercise(Scanner systemIn) {

        String eName = generateExerciseName(systemIn);
        String eDescription = generateDescription(systemIn);
        int intensityInt = generateIntensity(systemIn);
        int durationInt = generateDuration(systemIn);
        int repetitionsInt = generateRepetitions(systemIn);
        int setsInt = generateSets(systemIn);
        String equipment = generateEquipment(systemIn);

        BalanceExercise userBalanceExercise = new BalanceExercise(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment);

        return userBalanceExercise;

    }
}