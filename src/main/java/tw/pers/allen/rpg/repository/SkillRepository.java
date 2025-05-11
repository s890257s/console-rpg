package tw.pers.allen.rpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.pers.allen.rpg.model.entity.EquipmentTemplate;
import tw.pers.allen.rpg.model.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
