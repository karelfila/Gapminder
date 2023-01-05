public class Country {
    private int id;
    private String name;
    private String continent;
    private int year;
    private double lifeExp;
    private int pop;

    public Country(int id, String name, String continent, int year, double lifeExp, int pop) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.year = year;
        this.lifeExp = lifeExp;
        this.pop = pop;
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

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLifeExp() {
        return lifeExp;
    }

    public void setLifeExp(double lifeExp) {
        this.lifeExp = lifeExp;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }
}
