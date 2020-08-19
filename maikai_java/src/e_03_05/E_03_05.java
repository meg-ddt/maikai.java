package e_03_05;

/*演習3-5
 正の整数値を読み込んで
 それが5で割り切れれば『その値は5で割り切れます。』と表示し
 そうでなければ『その値は5で割り切れません。』と
 表示するプログラムを作成せよ
 ＊正ではない値をを読み込んだ場合は、『正ではない値が入力されました。』と
 　表示すること
*/

import java.util.Scanner;

public class E_03_05 {

	public static void main(String[] args) {

		Scanner integerValue = new Scanner(System.in);

		// 文言の表示
		System.out.print("正の整数値を入力してください。：");
		// 抽出された値を代入。
		int seisuuA = integerValue.nextInt();

		// 整数値が5で割り切れる場合
		if (seisuuA % 5 == 0 && seisuuA > 0) {
			// 結果を出力
			System.out.println("その値は5で割り切れます。");
			// 整数値が5で割り切れない場合
		} else if (seisuuA % 5 != 0 && seisuuA > 0) {
			// 結果を出力
			System.out.println("その値は5で割り切れません。");
			// マイナスの値が出力された場合
		} else {
			// 絶対値の値を出力
			System.out.println("正ではない値が入力しされました。");
		}
	}
}
