package org.example.ch3.beanselectautowiring;

/**
 * Class has not a @Component annotation because there are multiple beans in the config.
 */
public class Parrot {

    private String name;

    public Parrot() {
        System.out.println("Parrot created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
