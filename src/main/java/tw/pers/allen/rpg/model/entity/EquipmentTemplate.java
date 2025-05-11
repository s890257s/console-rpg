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
import tw.pers.allen.rpg.model.enums.EquipmentSlot;

/**
 * 裝備樣板表格，裝備實體需參考此表格建立。
 */
@Getter
@Setter
@Entity
@Table
public class EquipmentTemplate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@Enumerated(EnumType.STRING)
	private EquipmentSlot slot;
	private Integer baseBonusHp;
	private Integer baseBonusAttack;
	private Integer baseBonusDefense;
	private Integer baseBonusCritical;
	private Integer baseApReduction; // AP 消耗減少，最少為 1
	private Integer description;

}
