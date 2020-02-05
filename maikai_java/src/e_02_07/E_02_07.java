package e_02_07;

/*演習2-7
以下に示すプログラムを作成せよ
 1桁の正の整数値(1以上9以下の値)をランダムに生成して表示
 1桁の負の整数値(-1以上-9以下の値)をランダムに生成して表示
 2桁の正の整数値(10以上99以下の値)をランダムに生成して表示
*/

import java.util.Random;

public class E_02_07 {

	public static void main(String[] args) {

		// 何を行うかををコンソールに表示
		System.out.println("今日の気温");

		// 乱数を行う決まり文
		Random rand = new Random();

		// 1桁の正の整数値(1以上9以下の値)をランダムに生成して表示
		// 1から9以下の値をランダムで生成
		int highestTemperature = rand.nextInt(9) + 1;
		// 生成された値を出力
		System.out.println("最高気温は" + highestTemperature + "度です。");

		// 1桁の負の整数値(-1以上-9以下の値)をランダムに生成して表示
		// -1から-9以下の値をランダムで生成
		int lowestTemperature = rand.nextInt(9) - 9;
		// 生成された値を出力
		System.out.println("最低気温は" + lowestTemperature + "度です。");

		// 2桁の正の整数値(10以上99以下の値)をランダムに生成して表示
		// 10から99桁の値をランダムで生成
		int sinceYears = rand.nextInt(90) + 10;
		// 生成された値を出力
		System.out.println("9月の気温では" + sinceYears + "年振りの気温です。");

	}
}
