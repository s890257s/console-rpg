package tw.pers.allen.rpg.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import tw.pers.allen.rpg.model.enums.CharacterType;

/**
 * 角色樣板表格，包含 Player 與怪物。
 */
@Getter
@Setter
@Entity
@Table
public class Character {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@Enumerated(EnumType.STRING)
	private CharacterType type;
	private Integer level;
	private Integer minHp;
	private Integer maxHp;
	private Integer minAp;
	private Integer maxAp;
	private Integer baseAttack;
	private Integer baseDefense;

}
