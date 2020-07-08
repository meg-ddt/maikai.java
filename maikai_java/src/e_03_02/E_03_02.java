package e_03_02;

/*演習3-2
 二つの正の整数値を読み込んで
 後者が前者の約数であれば
 「BはAの約数です。」と表示し
 そうでなければ
 「BはAの約数ではありません。」と表示する
 プログラムを作成せよ
*/

import java.util.Scanner;

public class E_03_02 {

	public static void main(String[] args) {

		Scanner integerA = new Scanner(System.in);

		// 読み込まれた値を抽出。
		System.out.print("整数A ： ");
		// 抽出された値を代入。
		int seisuuA = integerA.nextInt();

		// 読み込まれた値を抽出。
		System.out.print("整数B ： ");
		// 抽出された値を代入。
		int seisuuB = integerA.nextInt();

		// 整数Bが整数Aの約数か否かを判断
		if (seisuuA % seisuuB == 0) {
			//約数の場合、約数である旨を表示
			System.out.println("BはAの約数です。");
			//
		} else {
			//約数でない場合、約数でない旨を表示
			System.out.println("BはAの約数ではありません。");
		}
	}
}
