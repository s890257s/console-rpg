package tw.pers.allen.rpg.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import tw.pers.allen.rpg.model.enums.AttributeType;

@Getter
@Setter
public class StatusEffect {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private AttributeType targetAttr;
	private Float effectValue; // EX: 1.5 表示 x150%
	private Integer duration; // 持續回合數
	private Boolean isBuff;

}
