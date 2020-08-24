package e_03_01;

/*演習3-1
 整数値を読み込んで
 その絶対値を求めて表示する
 プログラムを作成せよ
*/

import java.util.Scanner;

public class E_03_01 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		// 読み込まれた値を抽出。
		System.out.print("整数値 ： ");
		// 抽出された値を代入。
		int integerValue = stdIn.nextInt();

		// 整数値が0以上の場合
		if (integerValue >= 0) {
			// 絶対値の値を出力
			System.out.println("絶対値は" + integerValue + "です。");
		// 整数値が0未満の場合
		} else {
			// 絶対値の値を求めるためマイナスを反転させて出力
			System.out.println("絶対値は" + -integerValue + "です。");
		}
	}
}
