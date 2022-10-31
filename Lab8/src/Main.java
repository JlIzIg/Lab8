import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        Animals animals = new Animals();
        animals = animals.getRandomAnimals();
        System.out.println("Animals sorted by name");
        animals.getAnimals().sort(Animal.byName);
        System.out.println(animals.getAnimals());
        System.out.println("Animals sorted by name reverse");
        animals.getAnimals().sort(Animal.byNameReverse);
        System.out.println(animals.getAnimals());
        System.out.println("Animals sorted by id");
        animals.getAnimals().sort(Animal.byId);
        System.out.println(animals.getAnimals());
        System.out.println("Animals sorted by id reverse");
        animals.getAnimals().sort(Animal.byIdReverse);
        System.out.println(animals.getAnimals());
        System.out.println("Animals sorted by weight");
        animals.getAnimals().sort(Animal.byWeight);
        System.out.println(animals.getAnimals());
        System.out.println("Animals, that lives in forest ");
        System.out.println(animals.filterByWord("Forest", animals.getAnimals()));

    }
}
