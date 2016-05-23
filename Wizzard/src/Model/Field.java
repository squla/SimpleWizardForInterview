package Model;

/**
 * Created by Michal on 2016-04-11.
 */
public class Field {
    private String name;
    private String value;

    public Field(String name) {
        this.name = name;
        this.value = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
