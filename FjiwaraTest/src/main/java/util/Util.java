package util;


import java.util.Date;

/**
 * 様々な共通メソッドを保持したUtilクラス
 *
 * @author yuu
 */
public class Util {

	/**
	 * 入力された数字が整数か確認する
	 *
	 * @param inputVal 入力された数値
	 * @return boolean型。入力された値が数値：true、数値以外：false
	 */
	public static boolean isIntegerValue(String inputVal) {

		// nullチェック
		if (inputVal == null) {
			return false;
		}

		try {
			Integer.parseInt(inputVal);
		} catch (NumberFormatException ex) {
			// 数値型に変換できなかった場合はfalseを返す
			return false;
		}

		return true;
	}

	/**
	 * 入力された数字を整数に変換する。
	 * 変換に失敗する場合はnullを返す
	 *
	 * @param inputVal
	 * @return
	 */
	public static Integer parseIntegerValue(String inputVal) {

		if (inputVal == null || inputVal.isEmpty()) {
			throw new NumberFormatException("指定された文字列が空の為、数値に変換できません。");
		}

		try {
			int returnValue = Integer.parseInt(inputVal);
			return returnValue;

		} catch (NumberFormatException ex) {
			return null;
		}
	}

	/**
	 * Objectを日付型に変換する。
	 * 変換に失敗する場合はnullを返す
	 *
	 * @param inputVal Object型の変数
	 */
	public static Date parseDateValue(Object inputVal) {

		if (inputVal == null) {
			return null;
		}

		if (inputVal instanceof java.sql.Date) {
			return (Date)inputVal;

		} else {
			return null;

		}
	}

	/**
	 * Objectを文字列に変換する。
	 * nullの場合は空文字を返す
	 */
	public static String parseStringValue(Object inputVal) {

		if (inputVal == null) {
			return "";
		}

		return inputVal.toString();
	}
}
