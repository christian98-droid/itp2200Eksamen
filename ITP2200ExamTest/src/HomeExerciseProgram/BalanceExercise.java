package HomeExerciseProgram;

public class BalanceExercise extends Exercise {

    public String equipment;

    //Constructor
    public BalanceExercise(String eName, String eDescription, int intensity, int duration, int repetitions, int sets, String equipment) {
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
        return "Balance exercise"+ "\n" + super.toString() + "Equipment:" + " " + equipment + "\n"+ "\n";
    }
}