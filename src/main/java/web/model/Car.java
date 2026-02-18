package web.model;

public class Car {

    private int id;

    private String name;

    private String colour;

    public Car(int id, String name, String colour) {
        this.id = id;
        this.name = name;
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
