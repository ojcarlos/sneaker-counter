package oj.carlos.sneakercounter.repositories;

import oj.carlos.sneakercounter.entities.Counter;
import oj.carlos.sneakercounter.entities.PK.CounterPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository<Counter, CounterPK> {
}
