package com.omega.omegabackend.repository;

import com.omega.omegabackend.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Long> {
    // Spring Data JPA va générer la requête SQL automatiquement grâce au nom de la méthode
    List<Score> findTop5ByOrderByValeurDesc();
}
