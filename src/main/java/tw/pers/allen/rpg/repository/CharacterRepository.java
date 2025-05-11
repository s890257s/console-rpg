package tw.pers.allen.rpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.pers.allen.rpg.model.entity.Character;

public interface CharacterRepository extends JpaRepository<Character, Integer> {

}
