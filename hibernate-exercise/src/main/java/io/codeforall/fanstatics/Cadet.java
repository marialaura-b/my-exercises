package io.codeforall.fanstatics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cadet {
    @Id
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}