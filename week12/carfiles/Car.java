package week12.carfiles;

public class Car {
    private String make, model;
    private int year;


    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car()
    {
        this.make = "";
        this.model = "";
        this.year = 0;
    }

    public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}


    public String toString()
    {
        return "Car: make = " + make + ", model = " + model + ", year = " + year;
    }
}
