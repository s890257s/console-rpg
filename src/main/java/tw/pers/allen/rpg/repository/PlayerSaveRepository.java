package tw.pers.allen.rpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.pers.allen.rpg.model.entity.PlayerSave;

public interface PlayerSaveRepository extends JpaRepository<PlayerSave, Integer> {

}
