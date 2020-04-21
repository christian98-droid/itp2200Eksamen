package HomeExerciseProgram;

public class StrengthExercise extends Exercise {

    public int weights;
    public String equipment;

    public StrengthExercise(String eName, String eDescription, int intensity, int duration, int repetitions, int sets, String equipment, int weights){
        super(eName, eDescription, intensity, duration, repetitions, sets);

        setWeights(weights);
        setEquipment(equipment);

    }

    //Setter
    public void setWeights(int weights){this.weights = weights;}
    public void setEquipment(String equipment){this.equipment = equipment;}

    //Getter
    public int getIntensity(){return intensity;}
    public int getDuration(){return duration;}
    public int getRepetitions(){return repetitions;}
    public int getSets(){return sets;}

    @Override
    public String toString() {
        return "Strength exercise"+ "\n" + super.toString() + "Equipment:" + " " + equipment + "\n" + "\n";
    }

}