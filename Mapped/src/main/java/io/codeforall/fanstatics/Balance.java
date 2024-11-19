package io.codeforall.fanstatics;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "balance")
public class Balance extends LabEquipament {

    private Double capacity;
    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }
}