package oj.carlos.sneakercounter.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import oj.carlos.sneakercounter.entities.PK.CounterPK;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_counter")
public class Counter implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private CounterPK id = new CounterPK();

    private Integer counter;
    public Counter(){

    }

    public Counter(Sneaker sneaker, User user, Integer counter) {
        id.setUser(user);
        id.setSneaker(sneaker);
        this.counter = counter;
    }

    @JsonIgnore
    public User getUser(){
        return id.getUser();
    }

    public void setUser(User user){
        id.setUser(user);
    }


    public Sneaker getSneaker(){

        return id.getSneaker();
    }

    public void setSneaker(Sneaker sneaker){
        id.setSneaker(sneaker);
    }



    public Integer getCounter() {
        return counter;
    }

    public void addCounter(int n) {
        this.counter = this.counter + n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Counter counter)) return false;
        return Objects.equals(id, counter.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
