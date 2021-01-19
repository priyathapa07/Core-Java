package Generics;

public class Vehicles {
    private int plate;
    private String name;
    private String company;

    public Vehicles(int plate, String name, String company) {
        this.plate = plate;
        this.name = name;
        this.company = company;
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
