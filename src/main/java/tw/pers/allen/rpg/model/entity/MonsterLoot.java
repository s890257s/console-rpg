package tw.pers.allen.rpg.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * 怪物掉落裝備表格。
 */
@Getter
@Setter
public class MonsterLoot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer monsterId;
	private Integer equipmentTemplateId;
	private Float dropRate;

}
