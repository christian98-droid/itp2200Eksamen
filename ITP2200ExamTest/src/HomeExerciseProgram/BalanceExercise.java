package HomeExerciseProgram;

public class BalanceExercise extends Exercise {
    public String equipment;
    public String operation;

    public BalanceExercise(int intensity, int duration, int repetitions, int sets, String equipment, String operation) {
        super.setIntensity(intensity);
        super.setDuration(duration);
        super.setRepetitions(repetitions);
        super.setSets(sets);
        this.setEquipment(equipment);
        this.setOperation(operation);
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getIntensity() {
        return this.intensity;
    }

    public String toString() {
        return "Strength Exercise\n-------------------------\nIntensity: " + this.intensity + "\nDuration: " + this.duration + "\nRepetitions: " + this.repetitions + "\nSets: " + this.sets + "\nWeight to lift: " + "\nEquipment: " + this.equipment + "\nOperation: " + this.operation + "\n-------------------------";
    }
}


/*
package homeExercisesPackage;

public class Balance extends Exercise {

    private String equipment;

    //Constructor
    public Balance(String eName, String eDescription, int intensity, int duration, int repetitions, int sets, String equipment) {
        super(eName, eDescription, intensity, duration, repetitions, sets);

        this.equipment = equipment;
    }

    @Override
    public String toString() {
        String exOut = super.toString() + "Equipment:" + " " + equipment + "\n";
        return exOut;
    }

}
*/ 