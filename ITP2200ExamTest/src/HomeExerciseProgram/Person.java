package HomeExerciseProgram;
import java.util.ArrayList;

public class Person {

    ArrayList<Program> programs = new ArrayList<>();

    private String fName, lName;
    private String preferredExercise;
    private int acceptableIntensity;
    private Program currentProgram;

    public Person(String fName, String lName, String preferredExercise, int acceptableIntensity, Program currentProgram){
        setfName(fName);
        setlName(lName);
        setPreferredExercise(preferredExercise);
        setAcceptableIntensity(acceptableIntensity);
        setCurrentProgram(currentProgram);

    }

    // Setter
    public void setfName(String fName){this.fName = fName;}
    public void setlName(String lName){this.lName = lName;}
    public void setPreferredExercise(String preferredExercise){this.preferredExercise = preferredExercise;}
    public void setAcceptableIntensity(int acceptableIntensity){this.acceptableIntensity = acceptableIntensity;}
    public void setCurrentProgram(Program currentProgram){ this.currentProgram = currentProgram;}

    // Getter
    public String getPreferredExercise(){return preferredExercise;}
    public int getAcceptableIntensity(){return acceptableIntensity;}
    public Program getCurrentProgram(){return currentProgram;}

    @Override
    public String toString(){
        String personalPreference = "Name:" + " " +fName + " " + lName + "\n" + "\n"
                + "Preferred exercise:" + " "+ preferredExercise + "\n"
                + "Preferred intensity:" + " " + acceptableIntensity + "\n"
                + "Current program:" + " " + currentProgram + "\n";

        return personalPreference;
    }
}
