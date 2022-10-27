import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        Animals animals = new Animals();
        List<Animal> animalList = new ArrayList<>();
        int i;
        System.out.println("List of zoo animals");
        for (i = 0; i < 5; i++) {
            Animal animal = animals.loadByURL("https://zoo-animal-api.herokuapp.com/animals/rand/");
            System.out.println(animal);
            animalList.add(animal);
        }
        System.out.println("Animals sorted by name");
        animalList.sort(Animal.byName);
        System.out.println(animalList);
        System.out.println("Animals sorted by name reverse");
        animalList.sort(Animal.byNameReverse);
        System.out.println(animalList);
        System.out.println("Animals sorted by id");
        animalList.sort(Animal.byId);
        System.out.println(animalList);
        System.out.println("Animals sorted by id reverse");
        animalList.sort(Animal.byIdReverse);
        System.out.println(animalList);
        System.out.println("Animals sorted by weight");
        animalList.sort(Animal.byWeight);
        System.out.println(animalList);
        System.out.println("Animals, that lives in forest ");
        System.out.println(animals.filterByWord("Forest", animalList));

    }
}
