package tw.pers.allen.rpg.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * 前綴表格，供裝備與怪物使用。
 */
@Getter
@Setter
public class Prefix {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer bonusHp;
	private Integer bonusAttack;
	private Integer bonusDefense;
	private Integer bonusCritical;
	private Integer apCostReduction; // AP 消耗減少，最少為 1
	private Float weight; // 出現機率權重
	private Integer description;

}
