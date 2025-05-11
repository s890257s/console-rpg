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
import tw.pers.allen.rpg.model.enums.AttributeType;

/**
 * 狀態定義表格。
 */
@Getter
@Setter
@Entity
@Table
public class StatusEffect {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@Enumerated(EnumType.STRING)
	private AttributeType targetAttr;
	private Float effectValue; // EX: 1.5 表示 x150%
	private Integer duration; // 持續回合數
	private Boolean isBuff;

}
