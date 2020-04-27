package HomeExerciseProgram;
import java.util.Scanner;
import java.util.ArrayList;


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

        ArrayList<Program> programs = new ArrayList<>();

        programs.add(program1);
        programs.add(program2);
        programs.add(program3);
        programs.add(program4);
        programs.add(program5);
        programs.add(program6);
        programs.add(program7);
        programs.add(program8);
        programs.add(program9);
        programs.add(program10);

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
                Person newPerson = generateUser();

                System.out.println("Build own or use recommended existing program - (B) // (R)" + "\n");
                System.out.println("Quit program - (Q)");

                response = userIn.nextLine();

                switch (response.toUpperCase()) {

                    // CASE B. User has chosen to build own program.
                    case "B":
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

                                    StrengthExercise userStrengthExercise = generateStrengthExercise();
                                    userExercises.add(userStrengthExercise);
                                    break;

                                case "E":

                                    EnduranceExercise userEnduranceExercise = generateEnduranceExercise();
                                    userExercises.add(userEnduranceExercise);
                                    break;

                                case "F":

                                    FlexibilityExercise userFlexibilityExercise = generateFlexibilityExercise();
                                    userExercises.add(userFlexibilityExercise);
                                    break;


                                case "B":

                                    BalanceExercise userBalanceExercise = generateBalanceExercise();
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
                    // CASE R. User has chosen recommended existing program.
                    case "R":
                        recommendAppropriateProgram(newPerson, programs);

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

    public static StrengthExercise generateStrengthExercise() {
        String eName;
        String eDescription;
        String equipment;
        int intensityInt;
        int durationInt;
        int repetitionsInt;
        int setsInt;
        int weightsInt;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of exercise:");
        eName = scanner.nextLine();

        System.out.println("Describe exercise:");
        eDescription = scanner.nextLine();

        System.out.println("Enter equipment");
        equipment = scanner.nextLine();

        // Intensity
        do { //This do-while loop executes once, and continue executing like like a loop so long as the
            // statement in the while-loop is = true
            System.out.println("Enter intensity (1-10):");
            String intensityInput = scanner.nextLine();
            intensityInt = parseIntensity(intensityInput); //User input gets passed through
            if(intensityInt == -1){System.out.println("Wrong input! Pick a number between 1-10");} //Lets the user know its the wrong value
        }while(intensityInt == -1); //So long as the user continue passing invalid data, the loop will go on


        // Duration
        do {
            System.out.println("Enter duration of the exercise (minutes):");
            String durationInput = scanner.nextLine();
            durationInt = stringToIntConverter(durationInput);
        }while(durationInt == -1);

        // Repetitions
        do{
            System.out.println("Enter amount of repetitions per set:");
            String userInput = scanner.nextLine();
            repetitionsInt = stringToIntConverter(userInput);
        }while(repetitionsInt == -1);

        // Sets
        do{
            System.out.println("Enter amount of sets:");
            String userInput = scanner.nextLine();
            setsInt = stringToIntConverter(userInput);
        }while(setsInt == -1);

        // Weights
        do {
            System.out.println("Enter number of kg to add to exercise:");
            String userInput = scanner.nextLine();
            weightsInt = stringToIntConverter(userInput);
        }while(weightsInt == -1);

        StrengthExercise userStrengthExercise = new StrengthExercise(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment, weightsInt);

        return userStrengthExercise;

    }

    public static EnduranceExercise generateEnduranceExercise() {
        String eName;
        String eDescription;
        String equipment;
        int intensityInt;
        int durationInt;
        int repetitionsInt;
        int setsInt;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of exercise:");
        eName = scanner.nextLine();

        System.out.println("Describe exercise:");
        eDescription = scanner.nextLine();

        System.out.println("Enter equipment");
        equipment = scanner.nextLine();

        // Intensity
        do {
            System.out.println("Enter intensity (1-10):");
            String intensityInput = scanner.nextLine();
            intensityInt = parseIntensity(intensityInput);
            if(intensityInt == -1){System.out.println("Wrong input! Pick a number between 1-10");}
        }while(intensityInt == -1);


        // Duration
        do {
            System.out.println("Enter duration of the exercise (minutes):");
            String durationInput = scanner.nextLine();
            durationInt = stringToIntConverter(durationInput);
        }while(durationInt == -1);

        // Repetitions
        do{
            System.out.println("Enter amount of repetitions per set:");
            String userInput = scanner.nextLine();
            repetitionsInt = stringToIntConverter(userInput);
        }while(repetitionsInt == -1);

        // Sets
        do{
            System.out.println("Enter amount of sets:");
            String userInput = scanner.nextLine();
            setsInt = stringToIntConverter(userInput);
        }while(setsInt == -1);

        EnduranceExercise userEnduranceExercise = new EnduranceExercise(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment);

        return userEnduranceExercise;

    }

    public static FlexibilityExercise generateFlexibilityExercise() {
        String eName;
        String eDescription;
        String equipment;
        int intensityInt;
        int durationInt;
        int repetitionsInt;
        int setsInt;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of exercise:");
        eName = scanner.nextLine();

        System.out.println("Describe exercise:");
        eDescription = scanner.nextLine();

        System.out.println("Enter equipment");
        equipment = scanner.nextLine();

        // Intensity
        do {
            System.out.println("Enter intensity (1-10):");
            String intensityInput = scanner.nextLine();
            intensityInt = parseIntensity(intensityInput);
            if(intensityInt == -1){System.out.println("Wrong input! Pick a number between 1-10");}
        }while(intensityInt == -1);


        // Duration
        do {
            System.out.println("Enter duration of the exercise (minutes):");
            String durationInput = scanner.nextLine();
            durationInt = stringToIntConverter(durationInput);
        }while(durationInt == -1);

        // Repetitions
        do{
            System.out.println("Enter amount of repetitions per set:");
            String userInput = scanner.nextLine();
            repetitionsInt = stringToIntConverter(userInput);
        }while(repetitionsInt == -1);

        // Sets
        do{
            System.out.println("Enter amount of sets:");
            String userInput = scanner.nextLine();
            setsInt = stringToIntConverter(userInput);
        }while(setsInt == -1);

        FlexibilityExercise userFlexibilityExercise = new FlexibilityExercise(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment);

        return userFlexibilityExercise;

    }

    public static BalanceExercise generateBalanceExercise() {
        String eName;
        String eDescription;
        String equipment;
        int intensityInt;
        int durationInt;
        int repetitionsInt;
        int setsInt;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of exercise:");
        eName = scanner.nextLine();

        System.out.println("Describe exercise:");
        eDescription = scanner.nextLine();

        System.out.println("Enter equipment");
        equipment = scanner.nextLine();

        // Intensity
        do {
            System.out.println("Enter intensity (1-10):");
            String intensityInput = scanner.nextLine();
            intensityInt = parseIntensity(intensityInput);
            if(intensityInt == -1){System.out.println("Wrong input! Pick a number between 1-10");}
        }while(intensityInt == -1);


        // Duration
        do {
            System.out.println("Enter duration of the exercise (minutes):");
            String durationInput = scanner.nextLine();
            durationInt = stringToIntConverter(durationInput);
        }while(durationInt == -1);

        // Repetitions
        do{
            System.out.println("Enter amount of repetitions per set:");
            String userInput = scanner.nextLine();
            repetitionsInt = stringToIntConverter(userInput);
        }while(repetitionsInt == -1);

        // Sets
        do{
            System.out.println("Enter amount of sets:");
            String userInput = scanner.nextLine();
            setsInt = stringToIntConverter(userInput);
        }while(setsInt == -1);

        BalanceExercise userBalanceExercise = new BalanceExercise(eName, eDescription, intensityInt, durationInt, repetitionsInt, setsInt, equipment);

        return userBalanceExercise;

    }

    public static Person generateUser() {
        String fName;
        String lName;
        String preferredExercise;
        int acceptableIntensity;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        fName = scanner.nextLine();

        System.out.println("Enter last name:");
        lName = scanner.nextLine();

        System.out.println("Enter preferred exercise:");
        preferredExercise = scanner.nextLine();

        do {
            System.out.println("Enter acceptable intensity (1-10):");
            String intensityInput = scanner.nextLine();
            acceptableIntensity = parseIntensity(intensityInput);
            if(acceptableIntensity == -1){System.out.println("Wrong input! Pick a number between 1-10");}
        }while(acceptableIntensity == -1);

        Person userPerson = new Person(fName, lName, preferredExercise, acceptableIntensity);

        return userPerson;

    }

    public static int stringToIntConverter(String userInput){
        /**
         * I main:
         * Scanner scanner = new Scanner(System.in);
         * String userInput = s.nextLine();
         * stringToIntConverter(userInput); pass inn string parameter to convert to integer.
         * It will convert within this method to handle NumberFormatException
         * Returns integer value, or -1 if invalid data gets passed.
         */
        try{
            int x = Integer.parseInt(userInput);
            return x;
        }catch(NumberFormatException e){
            System.out.println("Wrong input!");
            return -1;
        }
    }

    public static int parseIntensity(String userInput) {
        int intensity;
        intensity = stringToIntConverter(userInput);
        if(intensity < 1 || intensity > 10){intensity = -1;}
        return intensity;
    }

    public static void recommendAppropriateProgram(Person p, ArrayList<Program> programs){

        switch (p.getAcceptableIntensity()) {

            case 1:
                for(Program program : programs){
                    if(program.getIntensityLevel() == 1){
                        p.setCurrentProgram(program);
                        System.out.println(p.toString());
                    }
                }
                break;

            case 2:
                for(Program program : programs){
                    if(program.getIntensityLevel() == 2){
                        p.setCurrentProgram(program);
                        System.out.println(p.toString());
                    }
                }
                break;

            case 3:
                for(Program program : programs){
                    if(program.getIntensityLevel() == 3){
                        p.setCurrentProgram(program);
                        System.out.println(p.toString());
                    }
                }
                break;
            case 4:
                for(Program program : programs){
                    if(program.getIntensityLevel() == 4){
                        p.setCurrentProgram(program);
                        System.out.println(p.toString());
                    }
                }
                break;
            case 5:
                for(Program program : programs){
                    if(program.getIntensityLevel() == 5){
                        p.setCurrentProgram(program);
                        System.out.println(p.toString());
                    }
                }
                break;
            case 6:
                for(Program program : programs){
                    if(program.getIntensityLevel() == 6){
                        p.setCurrentProgram(program);
                        System.out.println(p.toString());
                    }
                }
                break;
            case 7:
                for(Program program : programs){
                    if(program.getIntensityLevel() == 7){
                        p.setCurrentProgram(program);
                        System.out.println(p.toString());
                    }
                }
                break;
            case 8:
                for(Program program : programs){
                    if(program.getIntensityLevel() == 8){
                        p.setCurrentProgram(program);
                        System.out.println(p.toString());
                    }
                }
                break;
            case 9:
                for(Program program : programs){
                    if(program.getIntensityLevel() == 9){
                        p.setCurrentProgram(program);
                        System.out.println(p.toString());
                    }
                }
                break;
            case 10:
                for(Program program : programs){
                    if(program.getIntensityLevel() == 10){
                        p.setCurrentProgram(program);
                        System.out.println(p.toString());
                    }
                }
                break;

            default:
                System.out.println("Intensitivity not valid");
        }

    }

}

