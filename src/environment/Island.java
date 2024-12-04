package environment;

import environment.animals.Animal;
import environment.plants.Plant;
import persons.Person;

import java.util.ArrayList;
import java.util.List;

public class Island extends Place {

    private final ArrayList<Animal> fauna = new ArrayList<Animal>();
    private final ArrayList<Plant> flora = new ArrayList<Plant>();
    private final ArrayList<Person> islandPopulation = new ArrayList<Person>();

    public Island(String title, float x, float y) {
        super(title, x, y);
    }

    public void addFauna(Animal ... animals) {
        fauna.addAll(List.of(animals));
    }

    public void addFlora(Plant ... plants) {
        flora.addAll(List.of(plants));
    }

    public void addPersons(Person ... persons) {
        islandPopulation.addAll(List.of(persons));
    }

    public ArrayList<Animal> getFauna() {return fauna;}

    public ArrayList<Plant> getFlora() {return flora;}

    public ArrayList<Person> getIslandPopulation() {return islandPopulation;}

    @Override
    public String toString() {
        return "Island{" +
                "title='" + getTitle() + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", fauna=" + fauna +
                ", flora=" + flora +
                ", islandPopulation=" + islandPopulation +
                '}';
    }
}
