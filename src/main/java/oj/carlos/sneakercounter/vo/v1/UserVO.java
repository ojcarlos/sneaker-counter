package oj.carlos.sneakercounter.vo.v1;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class UserVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String email;
    private String password;

    public UserVO() {
    }

    public UserVO(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
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
