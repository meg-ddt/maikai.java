package e_03_06;

/*演習3-6
正の整数値を読み込んで
それが10の倍数であれば『その値は10の倍数です。』と表示し
そうでなければ『その値は10の倍数ではありません。』と
表示するプログラムを作成せよ
＊正ではない値をを読み込んだ場合は、『正ではない値が入力されました。』と
　表示すること
*/

import java.util.Scanner;

public class E_03_06 {

	public static void main(String[] args) {

		Scanner integerValue = new Scanner(System.in);

		// 文言の表示
		System.out.print("正の整数値を入力してください。");
		// 入力された値を代入
		int seisuuA = integerValue.nextInt();

		// 入力された整数が10で割り切れ、10以上である場合
		if (seisuuA % 10 == 0 && seisuuA >= 10) {
			// 結果を表示
			System.out.println("その値は10の倍数です。");
			// 入力された整数が10で割り切れず、0より大きい場合
		} else if (seisuuA % 10 != 0 && seisuuA > 0) {
			// 結果を表示
			System.out.println("その値は10の倍数ではありません。");
			// 上記の条件以外の場合
		} else {
			// 結果を表示
			System.out.println("正ではない値が入力されました。");
		}
	}
}
