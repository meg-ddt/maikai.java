package e_02_04;
/*演習2-4
右に示すように、キーボードから読み込んだ整数値に10を加えた値と
10を減じた値を出力するプログラムを作成せよ
*/

//JAVAに値を通す宣言文
import java.util.Scanner;

public class E_02_04 {
	public static void main(String[] args) {

		// キーボードとプログラムをつなぐための命令文
		Scanner stdIn = new Scanner(System.in);

		// 読み込まれた値を抽出。
		System.out.print("整数値 ： ");

		// 抽出された値をｘに代入。
		int extractedValue = stdIn.nextInt();

		// キーボードにて設定された値に10加算された値を出力
		System.out.println("10を加えた値は" + (extractedValue + 10) + "です。");

		// キーボードにて設定された値に10減算された値を出力
		System.out.println("10を減じた値は" + (extractedValue - 10) + "です。");

	}
}