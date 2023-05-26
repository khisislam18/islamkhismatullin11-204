public class Animal {
    @CheckValue(accessibleValues = {"Parrot", "Dog"})
    private String type;
    /*@CheckValue(accessibleValues = {"Sharik", "Petya"})*/
    private String name;
    /*@CheckValue(accessibleValues = {"Red", "Blue"})*/
    private String colour;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Animal(String type, String name, String colour) {
        this.type = type;
        this.name = name;
        this.colour = colour;
    }
}
