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

    public Island(String title, float x, float y, float z) {
        super(title, x, y, z);
    }

    public void AddFauna(Animal ... animals) {
        fauna.addAll(List.of(animals));
    }

    public void AddFlora(Plant ... plants) {
        flora.addAll(List.of(plants));
    }

    public ArrayList<Animal> GetFauna() {return fauna;}

    public ArrayList<Plant> GetFlora() {return flora;}

    @Override
    public String toString() {
        return "Island{" +
                ", title='" + GetTitle() + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                "fauna=" + fauna +
                ", flora=" + flora +
                '}';
    }
}
