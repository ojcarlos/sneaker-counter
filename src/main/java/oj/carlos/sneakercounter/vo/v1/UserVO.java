package oj.carlos.sneakercounter.vo.v1;

import oj.carlos.sneakercounter.entities.Counter;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UserVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String email;
    private String password;
    public Set<Counter> sneakers = new HashSet<>();


    public UserVO() {
    }

    public UserVO(Long id, String name, String email, String password, Set<Counter> sneakers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.sneakers = sneakers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Counter> getSneakers() {
        return sneakers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserVO userVO)) return false;
        return Objects.equals(email, userVO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
