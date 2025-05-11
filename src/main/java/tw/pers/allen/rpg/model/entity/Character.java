package tw.pers.allen.rpg.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import tw.pers.allen.rpg.model.enums.CharacterType;

/**
 * 角色樣板表格，包含 Player 與怪物。
 */
@Getter
@Setter
public class Character {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private CharacterType type;
	private Integer level;
	private Integer minHp;
	private Integer maxHp;
	private Integer minAp;
	private Integer maxAp;
	private Integer baseAttack;
	private Integer baseDefense;

}
