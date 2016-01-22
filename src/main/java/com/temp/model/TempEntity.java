package com.temp.model;

import org.springframework.hateoas.Identifiable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TempEntity implements Identifiable<Integer> {
    @Id
    @GeneratedValue
    private Integer id;

    @Override
    public Integer getId() {
        return id;
    }
}