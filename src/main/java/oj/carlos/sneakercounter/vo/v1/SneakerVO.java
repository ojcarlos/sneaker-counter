package oj.carlos.sneakercounter.vo.v1;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


public class SneakerVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String model;

    private String imgUrl;

    private String colorWay;

    private Instant releaseDate;


    private String history;

    private String designer;

    private String brand;

    private String collab;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public SneakerVO() {
    }

    public SneakerVO(Long id, String model, String colorWay, Instant releaseDate, String history, String designer, String brand, String collab, String imgUrl) {
        this.id = id;
        this.model = model;
        this.colorWay = colorWay;
        this.releaseDate = releaseDate;
        this.history = history;
        this.designer = designer;
        this.brand = brand;
        this.collab = collab;
        this.imgUrl = imgUrl;
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

    public Instant getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Instant releaseDate) {
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
        if (!(o instanceof SneakerVO sneakerVO)) return false;
        return Objects.equals(model, sneakerVO.model) && Objects.equals(colorWay, sneakerVO.colorWay) && Objects.equals(brand, sneakerVO.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, colorWay, brand);
    }
}