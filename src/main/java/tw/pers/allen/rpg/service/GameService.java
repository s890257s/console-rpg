package tw.pers.allen.rpg.service;

import org.springframework.stereotype.Service;

import tw.pers.allen.rpg.model.entity.CharacterTemplate;
import tw.pers.allen.rpg.utils.ConsoleUtil;

/**
 * 遊戲主服務，控制流程、初始化角色、存檔與讀取。
 */
@Service
public class GameService {

	/**
	 * 當前玩家角色
	 */
	private CharacterTemplate player;

	/**
	 * 遊戲入口：顯示主選單並處理玩家選擇
	 */
	public void start() {
		boolean running = true;
		while (running) {
			ConsoleUtil.println("\n==== 歡迎遊玩 Console RPG ====");
			ConsoleUtil.println("1. 新遊戲");
			ConsoleUtil.println("2. 載入遊戲");
			ConsoleUtil.println("3. 離開");
			int choice = ConsoleUtil.readInt("請選擇：");

			switch (choice) {

			case 1 -> {
				newGame();
				gameLoop();
			}

			case 2 -> {
//				loadGame();
//				if (player != null) {
//					gameLoop();
//				}
			}

			case 3 -> {
				ConsoleUtil.println("感謝遊玩，下次見！");
				running = false;
			}

			default -> ConsoleUtil.println("無效的選擇，請重新輸入。");

			}
		}
	}

	/** 初始化新遊戲角色 */
	private void newGame() {
		ConsoleUtil.println("\n== 新遊戲開始 ==");
		// 這裡可以延伸讓玩家選職業／名字
		this.player = new CharacterTemplate()
				.setLevel(1)
				.setName("勇者")
				.setMaxHp(10);
		ConsoleUtil.println("已建立角色：" + player.getName());
	}

	/** 核心遊戲迴圈：出戰、裝備、存檔、退出 */
	private void gameLoop() {
		boolean inGame = true;
		while (inGame) {
			ConsoleUtil.println("\n== 遊戲主選單 ==");
			ConsoleUtil.println("1. 探險 (戰鬥)");
			ConsoleUtil.println("2. 查看裝備");
			ConsoleUtil.println("3. 存檔");
			ConsoleUtil.println("4. 返回主選單");
			int cmd = ConsoleUtil.readInt("請選擇：");

			switch (cmd) {
			case 1 -> {
				explore();
//					if (player.isDead()) {
//						ConsoleUtil.println("你鼠了，遊戲結束。");
//						inGame = false;
//					}
			}
			case 2 -> {
//				equipmentService.showInventory(player);

			}
			case 3 -> {
//				saveService.save(player);
				ConsoleUtil.println("存檔完成！");

			}
			case 4 -> {
				inGame = false;

			}

			default -> ConsoleUtil.println("無效的選擇，請重新輸入。");
			}
		}
	}

	/** 戰鬥流程：產生怪物、執行回合戰鬥、處理戰利品 */
	private void explore() {
		ConsoleUtil.println("\n== 探險開始 ==");
//		MonsterInstance monster = battleService.spawnRandomMonster();
//		ConsoleUtil.println("遭遇怪物：" + monster.getTemplate().getName());

//		boolean victory = battleService.fight(player, monster);
//		if (victory) {
//			ConsoleUtil.println("擊敗了 " + monster.getTemplate().getName() + "！");
//			lootService.generateLoot(player, monster)
//					.forEach(eqp -> ConsoleUtil.println("獲得裝備：" + eqp.getName()));
//		} else {
//			ConsoleUtil.println("戰敗了...");
//		}
	}

}
