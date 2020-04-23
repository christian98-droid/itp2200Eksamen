package HomeExerciseProgram;
import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;


public class ExerciseManager {

    public static void main(String[] args) {

        // Create Person, Program TEST

        StrengthExercise se1 = new StrengthExercise("Biceps curl", "Curl your bicep using a dumbell", 6, 2, 3, 8, "Dumbell", 15);
        StrengthExercise se2 = new StrengthExercise("Push-ups", "Use your chest to push up your body", 7, 22, 3, 10, "None", 0);
        StrengthExercise se3 = new StrengthExercise("Push-ups", "Use your chest to push up your body", 7, 22, 3, 10, "None", 0);

        EnduranceExercise ee1 = new EnduranceExercise("Hill run", "Run up and down a hill", 6, 15, 3, 8, "None");
        EnduranceExercise ee2 = new EnduranceExercise("Jump rope", "Jump, and dont let the rope stop", 6, 9, 3, 8, "Rope");
        EnduranceExercise ee3 = new EnduranceExercise("Rowing", "Row in high tempo", 8, 19, 5, 2, "Rowing machine");

        FlexibilityExercise fe1 = new FlexibilityExercise("Hamstring streach", "Streach your hamstring", 6, 5, 3, 1, "None");
        FlexibilityExercise fe2 = new FlexibilityExercise("Chest streach", "Streach your chest using your arms against the wall", 5, 6, 3, 6, "None");
        FlexibilityExercise fe3 = new FlexibilityExercise("Leg streach", "Streach your leg using wall", 3, 5, 6, 3, "None");

        BalanceExercise be1 = new BalanceExercise("Balance pillow", "Keep your balance on the pillow", 6, 3, 6,4, "Balancing ");
        BalanceExercise be2 = new BalanceExercise("Balance squat", "Squat down on one leg, keep your balance", 9, 1, 6, 5,  "None");
        BalanceExercise be3 = new BalanceExercise("Line walk", "Walk on a line and keep your balance", 9, 8, 3,2, "Line/Rope ");


        ArrayList<Exercise> exercises1 = new ArrayList<>();
        ArrayList<Exercise> exercises2 = new ArrayList<>();
        ArrayList<Exercise> exercises3 = new ArrayList<>();

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

        Program program1 = new Program(exercises1);
        Program program2 = new Program(exercises2);
        Program program3 = new Program(exercises3);
        Program program4 = new Program(exercises1);
        Program program5 = new Program(exercises2);
        Program program6 = new Program(exercises3);
        Program program7 = new Program(exercises1);
        Program program8 = new Program(exercises2);
        Program program9 = new Program(exercises3);
        Program program10 = new Program(exercises3);



        Person per = new Person("Per", "Nordmann", "Strength", 2, program2);

        // System.out.print(per.toString());


                         //       Scanner in, (not finished just a start)

// TODO: Gjøre slik at bruker kan lage hele programmer, ikke bare enkelt treninger.


        ArrayList<Exercise> userExercises = new ArrayList<>();
        ArrayList<Exercise> newUser = new ArrayList<>();

        Scanner userIn = new Scanner(System.in);
        String response = "";
        Boolean notDone = true;
        Boolean notDoone = true;
        Boolean notDooone = true;



        System.out.println("\n Welcome to Exercise Manager \n");

        // Nested switch statements
        while (notDone) {

            // TODO : TEST // generateUser ber brukeren taste inn intLevel, som ikke kan være høyere enn 10, ellers feil lenger ned..
            Person newPerson = generateUser(userIn);

            System.out.println("Create own or use existing - (O) // (E)" + "\n");
            System.out.println("Quit program - (Q)");

            response = userIn.nextLine();

            // TODO : TEST // liten/stor bokstav. toUpperCase so the user user response is not case-sensitive.
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
                            switch (newPerson.getAcceptableIntensity()){
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
                                    System.out.println("Intensity not valid");
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

    public static String generatePersonLName(Scanner systemIn) {
        System.out.println("Enter last name:");
        String lName = systemIn.nextLine();
        return lName;
    }

    private static String generatePreferredExercise(Scanner systemIn) {

        System.out.println("Enter preferred exercise:");
        String preferredExercise = systemIn.nextLine();
        return preferredExercise;
    }

    public static int generateAcceptableIntensity(Scanner systemIn) {
        //TODO fremdeles mulig for bruker å kræsje programmet ved å taste string
        int userInput;
        System.out.println("Enter acceptable intensity (1-10):");
        userInput = systemIn.nextInt();

        //La til en while loop her for å stoppe bruker fra å legge inn feil tall
        while (userInput > 10 || (userInput < 1)) {
            System.out.println("Invalid number, try again");
            userInput = systemIn.nextInt();
        }
        return userInput;
    }

    public static Person generateUser(Scanner systemIn) {

        String fName = generatePersonFName(systemIn);
        String lName = generatePersonLName(systemIn);
        String preferredExercise = generatePreferredExercise(systemIn);
        int acceptableIntensity = generateAcceptableIntensity(systemIn);

        Person userPerson = new Person(fName, lName, preferredExercise, acceptableIntensity);

        return userPerson;

    }

}
