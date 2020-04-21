package HomeExerciseProgram;

public class FlexibilityExercise extends Exercise {

    private String equipment;

    //Constructor
    public FlexibilityExercise(String eName, String eDescription, int intensity, int duration, int repetitions, int sets, String equipment) {
        super(eName, eDescription, intensity, duration, repetitions, sets);

        setEquipment(equipment);
    }

    //Setter
    public void setEquipment(String equipment){this.equipment = equipment;}

    //Getter
    public int getIntensity(){return intensity;}
    public int getDuration(){return duration;}
    public int getRepetitions(){return repetitions;}
    public int getSets(){return sets;}

    @Override
    public String toString() {
        String exOut = super.toString() + "Equipment:" + " " + equipment + "\n";
        return exOut;
    }

}
