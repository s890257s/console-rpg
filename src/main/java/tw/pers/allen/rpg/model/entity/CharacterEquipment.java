package tw.pers.allen.rpg.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import tw.pers.allen.rpg.model.enums.EquipmentSlot;

@Getter
@Setter
public class CharacterEquipment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer characterId;
	private EquipmentSlot equipmentSlot;
	private Integer equipmentId;
	
}
