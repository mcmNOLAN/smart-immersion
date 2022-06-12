package com.ceramicegg.smartimmersion;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class CatFact {
    private @Id @GeneratedValue Long id;
    private String fact;
    private int length;

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "CatFact{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }
}
