package oj.carlos.sneakercounter.repositories;

import oj.carlos.sneakercounter.entities.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SneakerRepository extends JpaRepository<Sneaker, Long> {

}
