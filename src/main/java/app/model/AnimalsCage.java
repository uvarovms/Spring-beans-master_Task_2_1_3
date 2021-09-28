package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage extends Timer {

    private Animal animal;
    private Animal animal2;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animal, @Qualifier("dog") Animal animal2) {
        this.animal = animal;
        this.animal2 = animal2;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString() + ", " + animal2.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
