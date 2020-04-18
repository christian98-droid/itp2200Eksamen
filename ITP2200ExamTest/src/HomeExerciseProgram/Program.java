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
