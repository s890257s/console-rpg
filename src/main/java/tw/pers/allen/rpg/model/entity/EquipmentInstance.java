package tw.pers.allen.rpg.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * 裝備實體表格，原則上給 Player 使用。
 */
@Getter
@Setter
@Entity
@Table
public class EquipmentInstance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer equipmentTemplateId;
	private String name;
	private Integer bonusAttack;
	private Integer bonusDefense;
	private Integer bonusHp;
	private Integer bonusCritical;
	private Integer apCostReduction;

}
