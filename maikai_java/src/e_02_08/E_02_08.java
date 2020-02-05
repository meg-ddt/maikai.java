package e_02_08;

/*演習2-8
 キーボードから読み込んだ整数値プラスマイナス５の範囲の
 整数値をランダムに生成して表示するプログラムを作成せよ
*/

import java.util.Random;
import java.util.Scanner;

public class E_02_08 {

	public static void main(String[] args) {

		// キーボードとプログラムをつなぐための命令文
		Scanner stdIn = new Scanner(System.in);
		// 読み込まれた値を抽出。
		System.out.print("整数値 ： ");
		// 抽出された値を抽出値に代入。
		int extractedValue = stdIn.nextInt();

		// 乱数を行う決まり文
		Random rand = new Random();
		// 抽出した正の整数値に±５を足した値をランダムに生成
		int randomValue = rand.nextInt(11) + -5;
		// 抽出した値とランダムに生成した値を足す
		int randomNnumber = (extractedValue + randomValue);
		// 抽出した値とランダムに生成した値を足す
		System.out.println("その値の±５の乱数を生成しました。それは" + randomNnumber + "です。");

	}
}