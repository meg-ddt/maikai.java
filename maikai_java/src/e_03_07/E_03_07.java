package e_03_07;

/*演習3-7
 正の整数値を読み込んで
 それを3で割った値に応じて
 『その値は3で割り切れます。』
 『その値は3で割った余りは1です。』
 『その値は3で割った余りは2です。』
 表示するプログラムを作成せよ
 ＊正ではない値をを読み込んだ場合は、『正ではない値が入力されました。』と
 　表示すること
*/

import java.util.Scanner;

public class E_03_07 {

	public static void main(String[] args) {

		Scanner scanInteger = new Scanner(System.in);

		// 文言の表示
		System.out.print("正の整数値を入力してください。：");
		// 抽出された値を代入。
		int firstInteger = scanInteger.nextInt();

		if (firstInteger > 0) {
			// 整数値が3で割り切れた場合
			if (firstInteger % 3 == 0) {
				// 結果を出力
				System.out.println("その値は3で割り切れます。");
				// 整数値が3で割った余りは1の場合
			} else if (firstInteger % 3 == 1) {
				// 結果を出力
				System.out.println("その値は3で割った余りは1です。");
				// 整数値が3で割った余りは2の場合
			} else {
				// 結果を出力
				System.out.println("その値は3で割った余りは2です。");
			}
			// マイナスの値が出力された場合
		} else {
			// 絶対値の値を出力
			System.out.println("正ではない値が入力されました。");
		}
	}
}
