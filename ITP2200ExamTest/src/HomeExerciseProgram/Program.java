package HomeExerciseProgram;
import java.util.*;

public class Program {
    int duration;
    int intensityLevel;
    boolean balanced;

    ArrayList<Exercise> exerciseArrayList = new ArrayList<>();

    public Program(ArrayList<Exercise> exercises) {
        setExerciseArrayList(exercises);
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

    public ArrayList<Exercise> getExerciseArrayList() {
        return exerciseArrayList;
    }

    public void setExerciseArrayList(ArrayList<Exercise> exerciseArrayList) {
        this.exerciseArrayList = exerciseArrayList;
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
            if (getIntensityLevel() < e.getIntensity()) {
                highestIntensity = e.getIntensity();
            }
        }
        return highestIntensity;
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