package e_02_09;

/*演習2-9
以下に示すプログラムを作成せよ
(実数値の乱数の生成にはnextDouble()を使うこと)
 0.0以上1.0未満の実数値をランダムに生成して表示
 0.0以上10.0未満の実数値をランダムに生成して表示
 -1.0以上1.0未満の実数値をランダムに生成して表示
*/

import java.util.Random;

public class E_02_09 {

	public static void main(String[] args) {

		// 何を行うかををコンソールに表示
		System.out.println("50m走タイム");

		// 乱数を行う決まり文
		Random rand = new Random();

		// 0.0以上1.0未満の実数値をランダムに生成して表示
		double highestTemperature = rand.nextDouble();
		// 0.0以上10.0未満の実数値をランダムに生成して表示
		double lowestTemperature = rand.nextDouble() * 9;
		// -1.0以上1.0未満の実数値をランダムに生成して表示
		double sinceYears = rand.nextDouble() * -1;

		// 生成された値を出力
		System.out.println("1位との差は" + highestTemperature + "秒です。");
		// 生成された値を出力
		System.out.println("50mのタイムは" + lowestTemperature + "秒です。");
		// 生成された値を出力
		System.out.println("自己ベストタイムとの差は" + sinceYears + "秒です。");

	}
}
