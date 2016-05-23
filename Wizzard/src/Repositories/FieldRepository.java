package Repositories;

import Model.Field;

import java.util.List;

/**
 * Created by Michal on 2016-04-11.
 */
public interface FieldRepository {
    List<Field> getFields();

    Field getNext();

    Field getPrev();

    boolean hasPrev();

    boolean hasNext();

    Field getCurrent();

    void shift(int i);
}
