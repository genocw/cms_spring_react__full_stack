package com.example.PDATool.models;


import com.example.PDATool.interfaces.IModule;

import javax.persistence.*;


@Entity
@Table(name= "questions")
public class Question implements IModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    private String reference;

    @Column
    private String unit;

    @Column
    private String evidenceRequired;

    @Column
    private int weekNumber;

    public Question(String reference, String unit, String evidenceRequired, int weekNumber) {
        this.reference = reference;
        this.unit = unit;
        this.evidenceRequired = evidenceRequired;
        this.weekNumber = weekNumber;
    }

    public Question() {
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getEvidenceRequired() {
        return evidenceRequired;
    }

    public void setEvidenceRequired(String evidenceRequired) {
        this.evidenceRequired = evidenceRequired;
    }
}