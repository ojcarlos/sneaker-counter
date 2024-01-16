package oj.carlos.sneakercounter.entities.PK;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import oj.carlos.sneakercounter.entities.Sneaker;
import oj.carlos.sneakercounter.entities.User;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class CounterPK implements Serializable  {

    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "sneaker_id")
    private Sneaker sneaker;

    public User getUser() {

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Sneaker getSneaker() {

        return sneaker;
    }

    public void setSneaker(Sneaker sneaker) {
        this.sneaker = sneaker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CounterPK counterPK)) return false;
        return Objects.equals(user, counterPK.user) && Objects.equals(sneaker, counterPK.sneaker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, sneaker);
    }
}
