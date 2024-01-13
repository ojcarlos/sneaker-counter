package oj.carlos.sneakercounter.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import oj.carlos.sneakercounter.entities.PK.CounterPK;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
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
        id.setOwner(user);
        id.setSneaker(sneaker);

        this.counter = counter;
    }

    public User getOwner(){
        return id.getOwner();
    }

    public void setOwner(User user){
        id.setOwner(user);
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

    public void addCounter() {
        this.counter++;
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
