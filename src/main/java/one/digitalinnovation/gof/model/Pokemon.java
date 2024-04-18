package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pokemon {

    @Id
    private String name;

    private double height;

    private double weight;

    private int base_experience;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
