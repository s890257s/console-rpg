package tw.pers.allen.rpg.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * 前綴裝備中介表。
 */
@Getter
@Setter
@Entity
@Table
public class PrefixEquipmentInstance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer prefixId;
	private Integer equipmentInstanceId;

}
