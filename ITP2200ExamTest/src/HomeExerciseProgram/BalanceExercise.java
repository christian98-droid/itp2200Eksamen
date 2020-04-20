package HomeExerciseProgram;

public class BalanceExercise extends Exercise {

    private String equipment;

    //Constructor
    public BalanceExercise(String eName, String eDescription, int intensity, int duration, int repetitions, int sets, String equipment) {
        super(eName, eDescription, intensity, duration, repetitions, sets);

        this.equipment = equipment;
    }

    @Override
    public String toString() {
        String exOut = super.toString() + "Equipment:" + " " + equipment + "\n";
        return exOut;
    }

}