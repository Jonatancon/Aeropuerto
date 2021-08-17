package com.cesde.net.aeropuerto.commons;

import java.io.Serializable;
import java.util.List;

public interface Generic<T,ID extends Serializable> {

    Boolean save (T entity);

    void delete (ID id);

    T get (ID id);

    List<T> getAll ();
}
