package tw.pers.allen.rpg.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * 怪物掉落裝備表格。
 */
@Getter
@Setter
@Entity
@Table
public class MonsterLoot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer monsterId;
	private Integer equipmentTemplateId;
	private Float dropRate;

}
