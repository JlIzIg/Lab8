import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        Animals animals = new Animals();
        animals = animals.getRandomAnimals();
        System.out.println("Animals sorted by name");
        animals.sortByName();
        System.out.println(animals.getAnimals());
        System.out.println("Animals sorted by name reverse");
        animals.sortByNameReverse();
        System.out.println(animals.getAnimals());
        System.out.println("Animals sorted by id");
        animals.sortById();
        System.out.println(animals.getAnimals());
        System.out.println("Animals sorted by id reverse");
        animals.sortByIdReverse();
        System.out.println(animals.getAnimals());
        System.out.println("Animals sorted by weight");
        animals.sortByWeight();
        System.out.println(animals.getAnimals());
        System.out.println("Animals, that lives in forest ");
        System.out.println(animals.filterByWord("Forest", animals.getAnimals()));

    }
}
