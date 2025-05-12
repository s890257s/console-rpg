package tw.pers.allen.rpg.utils;

import java.util.Scanner;

/**
 * 負責與終端機互動的工具類。
 */
public class ConsoleUtil {

	private static final Scanner SCANNER = new Scanner(System.in);

	/** 直接印出一行文字（自動換行） */
	public static void println(String message) {
		System.out.println(message);
	}

	/** 印出不換行 */
	public static void print(String message) {
		System.out.print(message);
	}

	/** 讀取一行文字，並回傳輸入的字串 */
	public static String readLine(String prompt) {
		print(prompt);
		return SCANNER.nextLine().trim();
	}

	/**
	 * 讀取一個整數，直到使用者輸入合法整數為止
	 * 
	 * @param prompt 提示文字（如 "請輸入數字："）
	 * @return 使用者輸入的整數
	 */
	public static int readInt(String prompt) {
		while (true) {
			print(prompt);
			String line = SCANNER.nextLine().trim();
			try {
				return Integer.parseInt(line);
			} catch (NumberFormatException e) {
				println("輸入錯誤，請輸入有效的整數。");
			}
		}
	}

	/**
	 * 讀取一個範圍內的整數選項
	 * 
	 * @param prompt 提示文字
	 * @param min    最小值（含）
	 * @param max    最大值（含）
	 * @return 使用者選擇的整數
	 */
	public static int readInt(String prompt, int min, int max) {
		while (true) {
			int value = readInt(prompt);
			if (value >= min && value <= max) {
				return value;
			}
			println("選項錯誤，請輸入 " + min + " 到 " + max + " 之間的數字。");
		}
	}

	/**
	 * 讀取使用者是否要繼續（Y/N）
	 * 
	 * @param prompt 提示文字
	 * @return true = Y，false = N
	 */
	public static boolean readYesNo(String prompt) {
		while (true) {
			print(prompt + " (Y/N)：");
			String line = SCANNER.nextLine().trim().toUpperCase();

			if ("Y".equalsIgnoreCase(line)) {
				return true;
			}

			if ("N".equalsIgnoreCase(line)) {
				return false;
			}

			println("請輸入 Y 或 N。");
		}
	}

	/**
	 * 關閉 Scanner(遊戲結束時呼叫)
	 */
	public static void close() {
		SCANNER.close();
	}
}
