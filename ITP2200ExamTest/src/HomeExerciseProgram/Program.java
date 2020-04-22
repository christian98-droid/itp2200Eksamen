package HomeExerciseProgram;
import java.util.*;

public class Program {
    int duration; //Total duration of all exercises times 2
    int intensityLevel; //The highest intensity of all the exercises in the program
    boolean balanced;

    ArrayList<Exercise> exerciseArrayList = new ArrayList<>();

    public Program(ArrayList<Exercise> exercises) {
        setExerciseArrayList(exercises);

        //Requirement 1b: Each program keeps account of whether or not it is balanced. A balanced
        //program has at least one exercise of each type.
        setBalanced(balancedProgramCheck(exercises));

        //Requirement 1a: sets the intensityLevel of program to the highest of the exercises
        setIntensityLevel(findHighestIntensity(exercises));

        //Requirement 1d: doubles the total duration of Program (for added breaks)
        setDuration(findTotalDuration(exercises));

        //Requirement 1c: This method sorts the array based on intensity
        Collections.sort(exercises, new Comparator<Exercise>() {
            @Override
            public int compare(Exercise e1, Exercise e2) {
                return e1.intensity - e2.intensity;
            }
        });
    }

    // Setter
    public void setExerciseArrayList(ArrayList<Exercise> exerciseArrayList) {this.exerciseArrayList = exerciseArrayList;}
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setBalanced(boolean balanced) {
        this.balanced = balanced;
    }
    public void setIntensityLevel(int intensityLevel) {this.intensityLevel = intensityLevel;}

    // Getter
    public int getDuration() {return duration;}
    public int getIntensityLevel() {return intensityLevel;}
    public ArrayList<Exercise> getExerciseArrayList() {
        return exerciseArrayList;
    }

    public boolean isBalanced() {
        return balanced;
    }

    public int findTotalDuration(ArrayList<Exercise> exercises) {
        int totalDuration = 0;
        for (Exercise e : exercises) {
            totalDuration += e.getDuration() * 2;
        }
        return totalDuration;
    }

    public int findHighestIntensity(ArrayList<Exercise> exercises) {
        int highestIntensity = 0;
        for (Exercise e : exercises) {
            if (highestIntensity < e.getIntensity()){
                highestIntensity = e.getIntensity();
            }
        }
        return highestIntensity;
    }

    public boolean balancedProgramCheck(ArrayList<Exercise> exercises){
        boolean s = false;
        boolean b = false;
        boolean f = false;
        boolean e = false;

        boolean balanced = false;
        for(Exercise ex : exercises){
            if(ex instanceof StrengthExercise){s = true;}
            if(ex instanceof BalanceExercise){b = true;}
            if(ex instanceof FlexibilityExercise){f = true;}
            if(ex instanceof EnduranceExercise){e = true;}
        }
        if(s == true && b == true && f == true && e == true){balanced=true;}
        return balanced;
    }


    @Override
    public String toString() {

                return "Program duration:" + " " + duration + "min" + "\n"
                + "Intensity of program: " + " " + intensityLevel + "\n"
                + "Is balanced" + " " + balanced +"\n" + "\n" + exerciseArrayList;

    }

}


//

/*
package homeExercisesPackage;
import java.util.ArrayList;

public class Program {

    ArrayList<Exercise> lightExercises = new ArrayList<>();
    ArrayList<Exercise> mediumExercises = new ArrayList<>();
    ArrayList<Exercise> hardExercises = new ArrayList<>();

    private String pName;
    private int duration;
    private int intensityLevel;

    public Program(String pName, int duration, int intensityLevel) {
        this.pName = pName;
        this.duration = duration;
        this.intensityLevel = intensityLevel;
    }

    @Override
    public String toString() {

        String programOut = "Program Name:" + " " + pName + "\n"
        + "Program duration:" + " " + duration + "min" + "\n"
        + "Intensity of program: " + " " + intensityLevel + "\n";
        return programOut;
    }
}




*/