package HomeExerciseProgram;
import java.util.*;

public class Program{
    int duration; //total duration * 2 (rest)
    int intensityLevel; // (the highest intensity among the included exercises)
    boolean balanced;

    public Program(ArrayList<Exercise> exercises){
        // This method sorts the array based on intensity
        Collections.sort(exercises, new Comparator<Exercise>() {
            @Override
            public int compare(Exercise e1, Exercise e2) {
                return e1.intensity - e2.intensity;
            }
        });
        for(Exercise e : exercises){this.duration += e.duration * 2;}
        for(Exercise e : exercises){
            if(getIntensityLevel() < e.getIntensity()){
                setIntensityLevel(e.getIntensity());
            }
        }
    }

    public boolean isBalanced() {
        return balanced;
    }

    public void setBalanced(boolean balanced) {
        this.balanced = balanced;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getIntensityLevel() {
        return intensityLevel;
    }

    public void setIntensityLevel(int intensityLevel) {
        this.intensityLevel = intensityLevel;
    }
}


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