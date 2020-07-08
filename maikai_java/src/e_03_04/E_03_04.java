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
		 * aをクヌギのどんぐりの背丈、 bをカシワのどんくりの背丈と置き換え、 背比べを行うプログラムを作成する
		 */

		Scanner acornHeightKunugi = new Scanner(System.in);
		Scanner acornHeightKashiwa = new Scanner(System.in);

		// 読み込まれた値を抽出。
		System.out.print("ｸﾇｷﾞのどんぐりの背丈(mm) ：");
		// 抽出された値を代入。
		int acornOfKunugi = acornHeightKunugi.nextInt();
		// 読み込まれた値を抽出。
		System.out.print("ｶｼﾜのどんぐりの背丈(mm) ： ");
		// 抽出された値を代入。
		int acornOfKashiwa = acornHeightKashiwa.nextInt();

		// クヌギの方が大きい場合
		if (acornOfKunugi > acornOfKashiwa)
			// どちらが大きいか結果を出力
			System.out.println("ｸﾇｷﾞのどんぐりのほうが大きいです。");
		// カシワの方が大きい場合
		else if (acornOfKunugi < acornOfKashiwa)
			// どちらが大きいか結果を出力
			System.out.println("ｶｼﾜのどんぐりのほうが大きいです。");
		// クヌギとカシワが同じ高さの場合
		else if (acornOfKunugi == acornOfKashiwa)
			// どちらが大きいか結果を出力
			System.out.println("ｸﾇｷﾞとｶｼﾜは同じ大きさです。");

	}
}
