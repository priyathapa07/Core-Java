package HashMap_ForEach;

public class Country {
    private String name;
    private String continent;
    private Integer code;

    public Country(String name, String continent, Integer code) {
        this.name = name;
        this.continent = continent;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
