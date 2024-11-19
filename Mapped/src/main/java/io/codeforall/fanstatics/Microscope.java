package io.codeforall.fanstatics;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "microscope")
public class Microscope extends LabEquipament {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}