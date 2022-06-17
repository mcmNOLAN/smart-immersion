package com.ceramicegg.smartimmersion;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Getter
@Setter
@Builder
@ToString
public class CatFact {
    private @Id @GeneratedValue Long id;
    private String fact;
    private int length;
}
