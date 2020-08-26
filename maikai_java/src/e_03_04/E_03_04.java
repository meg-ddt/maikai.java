package e_03_04;

/*演習3-4
 二つの変数a、bに値を読み込んで
 その大小関係を以下のいずれかで表示する
 プログラムを作成せよ
 「aのほうが大きいです。」
 「bのほうが大きいです。」
 「aとbは同じ値です。」
*/

import java.util.Scanner;

public class E_03_04 {

	public static void main(String[] args) {

		Scanner scanVariable = new Scanner(System.in);

		// 読み込まれた値を抽出。
		System.out.print("変数a ：");
		// 抽出された値を代入。
		int firstVariable = scanVariable.nextInt();
		// 読み込まれた値を抽出。
		System.out.print("変数b ： ");
		// 抽出された値を代入。
		int nextVariable = scanVariable.nextInt();

		// 変数aが大きい場合
		if (firstVariable > nextVariable) {
			// どちらが大きいか結果を出力
			System.out.println("aのほうが大きいです。");
			// 変数bが大きい場合
		} else if (firstVariable < nextVariable) {
			// どちらが大きいか結果を出力
			System.out.println("bのほうが大きいです。");
			// 変数aと変数bが同じの場合
		} else if (firstVariable == nextVariable) {
			// どちらが大きいか結果を出力
			System.out.println("aとbは同じ値です。");
		}
	}
}
