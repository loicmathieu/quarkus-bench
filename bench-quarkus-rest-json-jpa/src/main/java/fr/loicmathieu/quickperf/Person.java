package fr.loicmathieu.quickperf;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.LockModeType;
import java.util.List;

@Entity
public class Person extends PanacheEntity {
    public String name;
}
