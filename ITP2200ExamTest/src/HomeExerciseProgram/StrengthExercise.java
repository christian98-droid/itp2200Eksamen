package HomeExerciseProgram;

public class StrengthExercise extends Exercise {
    public double weights; // Number of kilograms to use (changed to double due to possible decimal usage)
    public String equipment; // What equipment do you need
    public String operation; // For describing the exercise

    public StrengthExercise(int intensity, int duration, int repetitions, int sets, int weights, String equipment, String operation){
        super.setIntensity(intensity);
        super.setDuration(duration);
        super.setRepetitions(repetitions);
        super.setSets(sets);
        setWeights(weights);
        setEquipment(equipment);
        setOperation(operation);
    }

    public void setWeights(double weight){
        this.weights = weight;
    }
    public void setEquipment(String equipment){
        this.equipment = equipment;
    }
    public void setOperation(String operation){this.operation = operation;}

    public int getIntensity(){
        return this.intensity;
    }

    @Override
    public String toString(){ //Overrider toString for å printe ut objekt som ønsket
        return "Strength Exercise" + "\n-------------------------" + "\nIntensity: " + intensity + "\nDuration: " + duration + "\nRepetitions: " + repetitions +
                "\nSets: " + sets + "\nWeight to lift: " + weights +
                "\nEquipment: " + equipment + "\nOperation: " + operation + "\n-------------------------";
    }
}
