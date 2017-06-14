package com.taotao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lining on 17/3/9.
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer cpuSize;

    public Girl() {
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpuSize=" + cpuSize +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCpuSize() {
        return cpuSize;
    }

    public void setCpuSize(Integer cpuSize) {
        this.cpuSize = cpuSize;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
