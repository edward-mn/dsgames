package com.devsuperior.dsgames.repositories;

import com.devsuperior.dsgames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
