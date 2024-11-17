package com.listGame.dslist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.listGame.dslist.models.Game;
import com.listGame.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
            SELECT tb_game.id, tb_game.titulo, tb_game.img_url AS imgUrl,
       tb_game.descricao_curta AS curtaDescricao, tb_pertence.position
FROM tb_game
INNER JOIN tb_pertence ON tb_game.id = tb_pertence.game_id
WHERE tb_pertence.list_id = :listId
ORDER BY tb_pertence.position

            """)
            List<GameMinProjection> searchByList(Long listId);
            
            
    
}
