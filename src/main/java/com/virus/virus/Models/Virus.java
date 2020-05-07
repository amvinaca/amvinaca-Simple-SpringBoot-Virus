package com.virus.virus.Models;
import javax.persistence.*;


@Entity
@Table(name = "virus")
public class Virus
{
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    public int id;
    @Column(name = "name")
    public String name;
    @Column(name = "description")
    public String description;
    @Column(name = "symptoms")
    public String symptoms;
    @Column(name = "duration")
    public String duration;
    @Column(name = "mortalityrate")
    public String mortalityrate;
    @Column(name = "imageaddress")
    public String imageaddress;

    public Virus()
    {

    }


    public Virus(int id, String name, String description, String symptoms, String duration,String mortalityrate,String imageaddress ) {
        this.id=id;
        this.name = name;
        this.description = description;
        this.symptoms=symptoms;
        this.duration=duration;
        this.mortalityrate=mortalityrate;
        this.imageaddress=imageaddress;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getMortalityrate() {
        return mortalityrate;
    }

    public void setMortalityrate(String mortalityrate) {
        this.mortalityrate = mortalityrate;
    }

    public String getImageaddress() {

        return imageaddress;
    }

    public void setImageaddress(String imageaddress) {
        this.imageaddress = imageaddress;
    }

}

