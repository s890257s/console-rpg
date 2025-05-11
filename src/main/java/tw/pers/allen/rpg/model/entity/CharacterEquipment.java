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
 * 角色裝備，原則上給 Player 使用。
 */
@Getter
@Setter
@Entity
@Table
public class CharacterEquipment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer characterId;
	@Enumerated(EnumType.STRING)
	private EquipmentSlot equipmentSlot;
	private Integer equipmentInstanceId;

}
