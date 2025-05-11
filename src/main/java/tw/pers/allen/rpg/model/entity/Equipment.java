package tw.pers.allen.rpg.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import tw.pers.allen.rpg.model.enums.EquipmentSlot;

/**
 * 裝備樣板表格，裝備實體需參考此表格建立。
 */
@Getter
@Setter
public class Equipment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private EquipmentSlot slot;
	private Integer bonusHp;
	private Integer bonusAttack;
	private Integer bonusDefense;
	private Integer bonusCritical;
	private Integer apCostReduction; // AP 消耗減少，最少為 1
	private Integer description;

}
