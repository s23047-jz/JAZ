package pl.pjatk.JakZur.Model;

public class Car {
    private Long id;
    private String mark;
    private String model;
    private double engineCapacity;
    private int numberOfDoors;

    public Car(String mark, String model, double engineCapacity, int numberOfDoors) {
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.numberOfDoors = numberOfDoors;
    }
    public Car() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
