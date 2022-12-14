import java.io.Serializable;
import java.util.Comparator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "latin_name",
        "animal_type",
        "active_time",
        "length_min",
        "length_max",
        "weight_min",
        "weight_max",
        "lifespan",
        "habitat",
        "diet",
        "geo_range",
        "image_link",
        "id"
})
public class Animal implements Serializable {
    @JsonProperty("name")
    private String name;
    @JsonProperty("latin_name")
    private String latinName;
    @JsonProperty("animal_type")
    private String animalType;
    @JsonProperty("active_time")
    private String activeTime;
    @JsonProperty("length_min")
    private Double lengthMin;
    @JsonProperty("length_max")
    private Double lengthMax;
    @JsonProperty("weight_min")
    private Double weightMin;
    @JsonProperty("weight_max")
    private Double weightMax;
    @JsonProperty("lifespan")
    private Double lifespan;
    @JsonProperty("habitat")
    private String habitat;
    @JsonProperty("diet")
    private String diet;
    @JsonProperty("geo_range")
    private String geoRange;
    @JsonProperty("image_link")
    private String imageLink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    public Double getLengthMin() {
        return lengthMin;
    }

    public void setLengthMin(Double lengthMin) {
        this.lengthMin = lengthMin;
    }

    public Double getLengthMax() {
        return lengthMax;
    }

    public void setLengthMax(Double lengthMax) {
        this.lengthMax = lengthMax;
    }

    public Double getWeightMin() {
        return weightMin;
    }

    public void setWeightMin(Double weightMin) {
        this.weightMin = weightMin;
    }

    public Double getWeightMax() {
        return weightMax;
    }

    public void setWeightMax(Double weightMax) {
        this.weightMax = weightMax;
    }

    public Double getLifespan() {
        return lifespan;
    }

    public void setLifespan(Double lifespan) {
        this.lifespan = lifespan;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getGeoRange() {
        return geoRange;
    }

    public void setGeoRange(String geoRange) {
        this.geoRange = geoRange;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("id")
    private Integer id;

    @Override
    public String toString() {

        return "{ " + '\'' +
                "name:" + name + '\'' +
                ',' + "latin_name:" + latinName + '\'' +
                ',' + "animal_type:" + animalType + '\'' +
                ',' + "active_time:" + activeTime + '\'' +
                ',' + "length_min:" + lengthMin + '\'' +
                ',' + "length_max:" + lengthMax + '\'' +
                ',' + "weight_min:" + weightMin + '\'' +
                ',' + "weight_max:" + weightMax + '\'' +
                ',' + "lifespan:" + lifespan + '\'' +
                ',' + "habitat:" + habitat + '\'' +
                ',' + "diet:" + diet + '\'' +
                ',' + "geo_range:" + geoRange + '\'' +
                ',' + "image_link:" + imageLink + '\'' +
                ',' + "id:" + id + '\'' + '}';
    }

    /**
     * ?????????????????????? ?? ???????? ????????????-??????????????????
     **/
    public static Comparator<Animal> byName = Comparator.comparing(o -> o.name);
    public static Comparator<Animal> byNameReverse = (o1, o2) -> o2.name.compareTo(o1.name);
    public static Comparator<Animal> byId = (o1, o2) -> o1.id > o2.id ? 1 : o1.id < o2.id ? -1 : 0;
    public static Comparator<Animal> byIdReverse = (o1, o2) -> o1.id < o2.id ? 1 : o1.id > o2.id ? -1 : 0;
    public static Comparator<Animal> byWeight = Comparator.comparing(o -> o.weightMin);


}
