package com.bin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by  bin
 * Time： 2017/11/22.
 */
@Entity
public class teacher {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    public teacher() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
