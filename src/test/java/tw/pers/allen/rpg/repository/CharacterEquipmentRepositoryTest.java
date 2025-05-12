package tw.pers.allen.rpg.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tw.pers.allen.rpg.model.entity.CharacterEquipment;

@SpringBootTest
class CharacterEquipmentRepositoryTest {

	@Autowired
	CharacterEquipmentRepository characterEquipmentRepository;

	@Test
	void test() {

		List<CharacterEquipment> all = characterEquipmentRepository.findAll();

	}

}
