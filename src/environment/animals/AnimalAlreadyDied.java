package environment.animals;

public class AnimalAlreadyDied extends Exception {
    private final Animal animal;

    public AnimalAlreadyDied(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String getMessage() {
        return "Животное " + animal.getName() + " уже мертво.";
    }
}
