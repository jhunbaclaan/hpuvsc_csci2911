package week11;

public class Pet {
    private String name, breed;
    private int age;

    public Pet(String name, String breed, int age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Pet()
    {

    }

    // setters
    public void setName(String n)
    {
        this.name = n;
    }
    
    public void setBreed(String b)
    {
        this.breed = b;
    }

    public void setAge(int a)
    {
        this.age = a;
    }

    // getters
    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public int getAge()
    {
        return age;
    }

    // methods
    public int toHumanYears()
    {
        int humanAge = getAge() * 7;
        return humanAge;
    }

    public String toString()
    {
        return getName() + " is a " + getBreed() + ", approximately " + getAge() + " years old. That's " + toHumanYears() + " years old in human years!";
    }
}
