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

		/*
		 * a社会の点数を、 b理科の点数と置き換え、プログラムを作成する
		 */

		Scanner testScore = new Scanner(System.in);

		// 読み込まれた値を抽出。
		System.out.print("社会の点数 ：");
		// 抽出された値を代入。
		int socialScore = testScore.nextInt();
		// 読み込まれた値を抽出。
		System.out.print("理科の点数 ： ");
		// 抽出された値を代入。
		int scienceScore = testScore.nextInt();

		// 社会の点数が大きい場合
		if (socialScore > scienceScore) {
			// どちらが大きいか結果を出力
			System.out.println("社会の点数のほうが高いです。");
			// 理科の点数が大きい場合
		} else if (socialScore < scienceScore) {
			// どちらが大きいか結果を出力
			System.out.println("理科の点数のほうが高いです。");
			// 社会の点数と理科の点数が同じの場合
		} else if (socialScore == scienceScore) {
			// どちらが大きいか結果を出力
			System.out.println("社会の点数・理科の点数どちらも同じ点数です。");
		}
	}
}
