package HomeExerciseProgram;
import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;


public class ExerciseManager {

    public static void main(String[] args) {

        // Create Person, Program TEST

        // 40 Exercises of different intensity and type.
        StrengthExercise se1 = new StrengthExercise("Knees down push-ups", "Push-ups while knees on the ground", 1, 3, 10, 3, "None", 0);
        StrengthExercise se2 = new StrengthExercise("Walking lunges", "Take one step, then get on one knee", 2, 4, 10, 3, "None/dumbbell", 0);
        StrengthExercise se3 = new StrengthExercise("Dumbbell shoulder press", "Use your dumbbell and push up over shoulders", 3, 4, 10, 3, "dumbbell", 7);
        StrengthExercise se4 = new StrengthExercise("Dumbbell step-ups", "One dumbbell in each arm, and one step up", 4, 5, 10, 4, "Dumbell", 15);
        StrengthExercise se5 = new StrengthExercise("Lateral raise", "Use dumbbells to target your lats", 5, 6, 10, 4, "Dumbbell", 5);
        StrengthExercise se6 = new StrengthExercise("Dumbbell triceps kickback", "Target your triceps", 6, 7, 3, 10, "Dumbbell", 5);
        StrengthExercise se7 = new StrengthExercise("Burpees", "Preform burpees non-stop", 7, 8, 3, 8, "None", 15);
        StrengthExercise se8 = new StrengthExercise("Regular plank", "Hold a regular plank position", 8, 9, 1, 1, "None", 0);
        StrengthExercise se9 = new StrengthExercise("Regular push-ups", "Push your body up using chest muscle.", 9, 10, 15, 4, "None", 0);
        StrengthExercise se10 = new StrengthExercise("Sideways plank", "Planking position only sideways", 10, 11, 1, 1, "None", 0);

        EnduranceExercise ee1 = new EnduranceExercise("Walk", "Walk in a normal pace", 1, 3, 1, 1, "None");
        EnduranceExercise ee2 = new EnduranceExercise("Fast walk", "Walk in a high tempo", 2, 4, 1, 1, "None");
        EnduranceExercise ee3 = new EnduranceExercise("Jump rope", "Using a rope, jump.", 3, 4, 100, 3, "Rope");
        EnduranceExercise ee4 = new EnduranceExercise("HIIT run", "Run up and down a hill", 4, 5, 1, 1, "None");
        EnduranceExercise ee5 = new EnduranceExercise("Jumping jacks", "Do jumping jacks", 5, 6, 20, 4, "Rope");
        EnduranceExercise ee6 = new EnduranceExercise("Cycling", "Cycle in a high+ tempo", 6, 7, 1, 1, "Bicycle");
        EnduranceExercise ee7 = new EnduranceExercise("Stairs run", "Run up an down stairs", 7, 8, 1, 1, "None");
        EnduranceExercise ee8 = new EnduranceExercise("Fast walk", "Jump, and don't let the rope stop", 8, 9, 2, 2, "Rope");
        EnduranceExercise ee9 = new EnduranceExercise("Rowing", "Row in high tempo", 9, 10, 5, 2, "Rowing machine");
        EnduranceExercise ee10 = new EnduranceExercise("Hill run", "Run up and down a hill", 10, 11, 2, 2, "None");

        FlexibilityExercise fe1 = new FlexibilityExercise("Hamstring stretch", "stretch your hamstring", 1, 3, 1, 1, "None");
        FlexibilityExercise fe2 = new FlexibilityExercise("Chest stretch", "stretch your chest using your arms against the wall", 2, 4, 1, 1, "None");
        FlexibilityExercise fe3 = new FlexibilityExercise("Leg stretch", "stretch your leg using wall", 3, 4, 1, 1, "None");
        FlexibilityExercise fe4 = new FlexibilityExercise("Back stretch", "stretch your hamstring", 4, 5, 1, 1, "None");
        FlexibilityExercise fe5 = new FlexibilityExercise("Bridge", "Make your body do a bridge", 5, 6, 1, 1, "None");
        FlexibilityExercise fe6 = new FlexibilityExercise("Lower back", "stretch your lower back", 6, 7, 1, 1, "None");
        FlexibilityExercise fe7 = new FlexibilityExercise("Shoulder stretch", "stretch your chest using your arms against the wall", 7, 8, 1, 1, "None");
        FlexibilityExercise fe8 = new FlexibilityExercise("Upper lats stretch", "stretch your lats", 8, 9, 1, 1, "None");
        FlexibilityExercise fe9 = new FlexibilityExercise("Decline stretch", "Regular decline stretch", 9, 10, 1, 1, "None");
        FlexibilityExercise fe10 = new FlexibilityExercise("Bridge", "Make your body do a bridge", 10, 11, 1, 1, "None");

        BalanceExercise be1 = new BalanceExercise("Balance pillow", "Keep your balance on the pillow", 1, 3, 6, 4, "Balancing ");
        BalanceExercise be2 = new BalanceExercise("Balance squat", "Squat down on one leg, keep your balance", 2, 4, 6, 5, "None");
        BalanceExercise be3 = new BalanceExercise("Line walk", "Walk on a line and keep your balance", 3, 4, 3, 2, "Line/Rope ");
        BalanceExercise be4 = new BalanceExercise("One handed push-up", "Push-ups with one hand", 4, 5, 6, 4, "None ");
        BalanceExercise be5 = new BalanceExercise("One legged hold jump", "Hold one leg in the air", 5, 6, 6, 5, "None");
        BalanceExercise be6 = new BalanceExercise("Heel-to-toe walk", "Walk from heel to heel.", 6, 7, 3, 2, "None ");
        BalanceExercise be7 = new BalanceExercise("Step-up", "Find an object to step up onto", 7, 8, 6, 4, "Stairs/Bench ");
        BalanceExercise be8 = new BalanceExercise("Sideways walking", "Walk sideways", 8, 9, 6, 5, "None");
        BalanceExercise be9 = new BalanceExercise("Simple grapevine", "Avoid dropping your hips as you step. ", 9, 10, 3, 2, "None ");
        BalanceExercise be10 = new BalanceExercise("One foot balance pillow", "Keep your balance on the pillow, one foot", 10, 11, 6, 4, "Balancing Pillow ");


        ArrayList<Exercise> exercises1 = new ArrayList<>();
        ArrayList<Exercise> exercises2 = new ArrayList<>();
        ArrayList<Exercise> exercises3 = new ArrayList<>();
        ArrayList<Exercise> exercises4 = new ArrayList<>();
        ArrayList<Exercise> exercises5 = new ArrayList<>();
        ArrayList<Exercise> exercises6 = new ArrayList<>();
        ArrayList<Exercise> exercises7 = new ArrayList<>();
        ArrayList<Exercise> exercises8 = new ArrayList<>();
        ArrayList<Exercise> exercises9 = new ArrayList<>();
        ArrayList<Exercise> exercises10 = new ArrayList<>();


        ArrayList<Program> programs = new ArrayList<>();


        exercises1.add(se1);
        exercises1.add(ee1);
        exercises1.add(fe1);
        exercises1.add(be1);

        exercises2.add(se2);
        exercises2.add(ee2);
        exercises2.add(fe2);
        exercises2.add(be2);

        exercises3.add(se3);
        exercises3.add(ee3);
        exercises3.add(fe3);
        exercises3.add(be3);

        exercises4.add(se4);
        exercises4.add(ee4);
        exercises4.add(fe4);
        exercises4.add(be4);

        exercises5.add(se5);
        exercises5.add(ee5);
        exercises5.add(fe5);
        exercises5.add(be5);

        exercises6.add(se6);
        exercises6.add(ee6);
        exercises6.add(fe6);
        exercises6.add(be6);

        exercises7.add(se7);
        exercises7.add(ee7);
        exercises7.add(fe7);
        exercises7.add(be7);

        exercises8.add(se8);
        exercises8.add(ee8);
        exercises8.add(fe8);
        exercises8.add(be8);

        exercises9.add(se9);
        exercises9.add(ee9);
        exercises9.add(fe9);
        exercises9.add(be9);

        exercises10.add(se10);
        exercises10.add(ee10);
        exercises10.add(fe10);
        exercises10.add(be10);

        Program program1 = new Program(exercises1);
        Program program2 = new Program(exercises2);
        Program program3 = new Program(exercises3);
        Program program4 = new Program(exercises4);
        Program program5 = new Program(exercises5);
        Program program6 = new Program(exercises6);
        Program program7 = new Program(exercises7);
        Program program8 = new Program(exercises8);
        Program program9 = new Program(exercises9);
        Program program10 = new Program(exercises10);


        // Scanner
        ArrayList<Exercise> userExercises = new ArrayList<>();

        Scanner userIn = new Scanner(System.in);
        String response = "";
        Boolean notDone = true;
        Boolean notDoone = true;

        System.out.println("\n Welcome to Exercise Manager \n");

        // Nested switch statements
        while (notDone) {

            System.out.println("START - (S)" + "\n");
            System.out.println("Quit program - (Q)");

            response = userIn.nextLine();

            switch (response.toUpperCase()) {

                case "S":
                Person newPerson = generateUser(userIn);

                System.out.println("Create own or use existing - (O) // (E)" + "\n");
                System.out.println("Quit program - (Q)");

                response = userIn.nextLine();

                switch (response.toUpperCase()) {

                    // CASE O. User has chosen to create own program.
                    case "O":
                        while (notDoone) {
                            System.out.println("Create strength exercise - (S)");
                            System.out.println("Create endurance exercise - (E)");
                            System.out.println("Create flexibility exercise - (F)");
                            System.out.println("Create balance exercise - (B)");
                            System.out.println("Print out program - (P)" + "\n");
                            System.out.println("Quit program - (Q)");

                            response = userIn.nextLine();

                            switch (response.toUpperCase()) {

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

                                    Program userProgram = new Program(userExercises);
                                    newPerson.setCurrentProgram(userProgram);

                                    System.out.println(newPerson.toString());

                                    break;

                                case "Q":

                                    notDone = false;
                                    notDoone = false;

                                    System.out.println("Exercise Manager is quitting");
                                    break;

                                default:
                                    System.out.println("User input is unknown");
                                    break;
                            }

                        }

                        break;
                    // CASE E. User has chosen existing program.
                    case "E":
                        // TODO : TEST // hvis intLevel er over 10, blir det feil her. Må løses når brukeren taster det inn i starten.
                        switch (newPerson.getAcceptableIntensity()) {
                            case 1:
                                newPerson.setCurrentProgram(program1);
                                System.out.println(newPerson.toString());
                                break;
                            case 2:
                                newPerson.setCurrentProgram(program2);
                                System.out.println(newPerson.toString());
                                break;

                            case 3:
                                newPerson.setCurrentProgram(program3);
                                System.out.println(newPerson.toString());
                                break;
                            case 4:
                                newPerson.setCurrentProgram(program4);
                                System.out.println(newPerson.toString());
                                break;
                            case 5:
                                newPerson.setCurrentProgram(program5);
                                System.out.println(newPerson.toString());
                                break;
                            case 6:
                                newPerson.setCurrentProgram(program6);
                                System.out.println(newPerson.toString());
                                break;
                            case 7:
                                newPerson.setCurrentProgram(program7);
                                System.out.println(newPerson.toString());
                                break;
                            case 8:
                                newPerson.setCurrentProgram(program8);
                                System.out.println(newPerson.toString());
                                break;
                            case 9:
                                newPerson.setCurrentProgram(program9);
                                System.out.println(newPerson.toString());
                                break;
                            case 10:
                                newPerson.setCurrentProgram(program10);
                                System.out.println(newPerson.toString());
                                break;

                            default:
                                System.out.println("Intensitivity not valid");
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

    // TODO : SIMEN TEST // Prevent error when typing in wrong data type. Hvis brukeren taster inn String istedenfor int krasjer det. Men int istedenfor String går.
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

    // Person
    private static String generatePersonFName(Scanner systemIn) {

        System.out.println("Enter first name:");
        String fName = systemIn.nextLine();
        return fName;
    }

    private static String generatePersonLName(Scanner systemIn) {

        System.out.println("Enter last name:");
        String lName = systemIn.nextLine();
        return lName;
    }

    private static String generatePreferredExercise(Scanner systemIn) {

        System.out.println("Enter preferred exercise:");
        String preferredExercise = systemIn.nextLine();
        return preferredExercise;
    }

    // POSSIBLE CRASH IF USER INPUT > 10
    private static int generateAcceptableIntensity(Scanner systemIn) {
            System.out.println("Enter acceptable intensity (1-10):");
            String acceptableIntensity = systemIn.nextLine();
            int acceptableIntensityInt = Integer.parseInt(acceptableIntensity);
            //La til en while loop her for å stoppe bruker fra å legge inn feil tall
            while (acceptableIntensityInt > 10 || (acceptableIntensityInt < 1)) {
                System.out.println("Invalid number, try again");
                acceptableIntensity = systemIn.nextLine();
                acceptableIntensityInt = Integer.parseInt(acceptableIntensity);
            }

            return acceptableIntensityInt;
        }

    private static Person generateUser(Scanner systemIn) {

        String fName = generatePersonFName(systemIn);
        String lName = generatePersonLName(systemIn);
        String preferredExercise = generatePreferredExercise(systemIn);
        int acceptableIntensity = generateAcceptableIntensity(systemIn);

        Person userPerson = new Person(fName, lName, preferredExercise, acceptableIntensity);

        return userPerson;

    }

}
