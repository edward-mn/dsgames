package com.devsuperior.dsgames.repositories;

import com.devsuperior.dsgames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
