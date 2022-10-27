
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.*;

public class Animals implements Serializable {
    private List<Animal> animals = null;
    private final static long serialVersionUID = 5265231543584980253L;

    public Animals() {
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setResults(List<Animal> animals) {
        this.animals = animals;
    }

    /**
     * Реализация загрузки данных отдельным потоком из JSON
     **/
    public Animal loadByURL(String url) throws IOException {
        StringBuilder jsonIn = new StringBuilder();
        InputStream is = null;
        is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));

            int cp;
            while ((cp = rd.read()) != -1) {
                jsonIn.append((char) cp);
            }
        } finally {
            is.close();
        }
        ObjectMapper om = new ObjectMapper();
        Animal animal = om.readValue(jsonIn.toString(), Animal.class);
        return animal;
    }

    public void add(Animal animal) {
        animals.add(animal);
    }

    /**
     * Поиск по слову
     **/
    public List<Animal> filterByWord(String str, List<Animal> animals) {
        List<Animal> temp = new ArrayList<>();
        for (Animal word : animals) {
            if (word.getHabitat().toLowerCase().contains(str.toLowerCase()))
                temp.add(word);
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Animals{" +
                ", animals=" + animals +
                '}' + "\n";
    }
}