package HomeExerciseProgram;

import java.util.Comparator;

abstract class Exercise {
    public int intensity; // Thinking we can use a 1-10 scale for intensity where 10 is the highest
    public int duration; //total minutes for whole exercise
    public int repetitions; // Number of reps in each set
    public int sets; // Number of sets

    public void setIntensity(int intensity){this.intensity = intensity;}
    public void setDuration(int minutes){this.duration = minutes;}
    public void setRepetitions(int reps){this.repetitions = reps;}
    public void setSets(int sets){this.sets = sets;}

    public int getIntensity(){return intensity;}
    public int getDuration(){return duration;}
    public int getRepetitions(){return repetitions;}
    public int getSets(){return sets;}

   }
