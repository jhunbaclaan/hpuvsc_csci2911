package week14.inheritance;

public class Dog extends Pet {
    private String breed;
    private double tail;

    public Dog(String name, int age, String breed, double tail)
    {
        super(name, age);
        this.breed = breed;
        this.tail = tail;
    }

    public Dog()
    {

    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getTail() {
        return this.tail;
    }

    public void setTail(double tail) {
        this.tail = tail;
    }

    public String toString()
    {
        return super.toString() + "\nBreed: " + breed + "\nTail length: " + tail + " in inches.";
    }


}
