package oj.carlos.sneakercounter.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

public class Sneaker implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String model;
    private String colorWay;
    private Calendar releaseDate;
    private String history;
    private String designer;
    private String brand;
    private String collab;

    public Sneaker() {
    }

    public Sneaker(Long id, String model, String colorWay, Calendar releaseDate, String history, String designer, String brand, String collab) {
        this.id = id;
        this.model = model;
        this.colorWay = colorWay;
        this.releaseDate = releaseDate;
        this.history = history;
        this.designer = designer;
        this.brand = brand;
        this.collab = collab;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColorWay() {
        return colorWay;
    }

    public void setColorWay(String colorWay) {
        this.colorWay = colorWay;
    }

    public Calendar getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Calendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCollab() {
        return collab;
    }

    public void setCollab(String collab) {
        this.collab = collab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sneaker sneaker)) return false;
        return id == sneaker.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
