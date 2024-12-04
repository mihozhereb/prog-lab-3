package persons;

import environment.Island;
import environment.plants.Collectable;
import environment.plants.Dryable;
import environment.plants.Fermentable;
import environment.plants.Plant;

public interface Farmer {
    public default void collect(Collectable plant) {
        plant.collect();
    }

    public default void dry(Dryable plant) {
        plant.dry();
    }

    public default void ferment(Fermentable plant) {
        plant.ferment();
    }

    public default void sow(Island island, Plant... plants) {
        island.addFlora(plants);
    }
}
