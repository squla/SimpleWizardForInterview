package Repositories;

import Model.Field;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal on 2016-04-11.
 */
public class FieldRepositoryIMPL implements FieldRepository {
    private List<Field> fields;
    private int index;

    public FieldRepositoryIMPL() {
        fields = new ArrayList<>();
        index = 0;
        fields.add(new Field("Imię"));
        fields.add(new Field("Naziwsko"));
        fields.add(new Field("Adres"));
        fields.add(new Field("Nr Telefonu"));
//        fields.add(new Field("Imię1"));
//        fields.add(new Field("Naziwsko1"));
//        fields.add(new Field("Nr Telefonu1"));
//        fields.add(new Field("Adres1"));
//        fields.add(new Field("Imię2"));
//        fields.add(new Field("Naziwsko12"));
//        fields.add(new Field("Nr Telefonu12"));
//        fields.add(new Field("Adres12"));
    }

    public Field getNext() {
        return fields.get(++index);
    }

    public Field getPrev() {
        return fields.get(--index);
    }

    public Field getCurrent() {
        return fields.get(index);
    }

    public void shift(int i) {
        index += i;
    }

    public boolean hasPrev() {
        return index - 1 >= 0;
    }

    public boolean hasNext() {
        return index + 1 < fields.size();
    }

    public List<Field> getFields() {
        return fields;
    }


}
