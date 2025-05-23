package tw.pers.allen.rpg.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * 存檔記錄表格。
 */
@Getter
@Setter
@Entity
@Table
public class PlayerSave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String playerName;
	private String saveData;
	private LocalDate created;
	private LocalDate updated;

}
