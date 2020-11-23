package e_03_10;

/*演習3-10
 二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
*/

import java.util.Scanner;

public class E_03_10 {

	public static void main(String[] args) {

		Scanner integerValue = new Scanner(System.in);

		// 文言の表示
		System.out.print("整数値を入力してください：整数値1＝");
		// 入力された実数値を代入
		int actualValue1 = integerValue.nextInt();
		// 文言の表示
		System.out.print("整数値を入力してください：整数値2＝");
		// 入力された整数値を代入
		int actualValue2 = integerValue.nextInt();

		// 入力した値が大きい方を基に計算を行う。
		int actualValue = actualValue1 >= actualValue2 ? (actualValue1 - actualValue2) : (actualValue2 - actualValue1);

		// 比較した結果を表示
		System.out.println("2つの整数値の差は、" + actualValue + "です。");

	}
}
