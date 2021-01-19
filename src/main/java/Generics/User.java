package Generics;

/**
 * POJO class
 */

public class User {

    private String name;
    private Integer dno;
    private String location;

    public User(String name, Integer dno, String location) {
        this.name = name;
        this.dno = dno;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
