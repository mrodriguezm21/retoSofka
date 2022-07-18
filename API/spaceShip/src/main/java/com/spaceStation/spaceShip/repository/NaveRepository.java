package com.spaceStation.spaceShip.repository;

import com.spaceStation.spaceShip.model.Nave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NaveRepository extends JpaRepository<Nave,Long> {
    List<Nave> findAllByOrderByIdNaveAsc();
}
