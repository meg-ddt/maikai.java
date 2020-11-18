package e_03_09;

/*演習3-9
 二つの実数値を読み込んで、大きい方の値を表示するプログラムを作成せよ。
*/

import java.util.Scanner;

public class E_03_09 {

	public static void main(String[] args) {

		Scanner integerValue = new Scanner(System.in);

		// 文言の表示
		System.out.print("実数値を入力してください：実数値1＝");
		// 入力された実数値を代入
		double actualValue1 = integerValue.nextDouble();
		// 文言の表示
		System.out.print("実数値を入力してください：実数値2＝");
		// 入力された実数値を代入
		double actualValue2 = integerValue.nextDouble();

		// 実数値1が実数値2より大きい場合、実数値1を結果に代入し、そうでない場合は実数値2を結果に代入する。
		double largeValue = actualValue1 > actualValue2 ? actualValue1 : actualValue2;
		// 比較した結果を表示
		System.out.println("2つの実数値を比べた結果、" + largeValue + "の値が大きいです。");

	}
}
