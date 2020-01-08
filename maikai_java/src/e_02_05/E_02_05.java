package e_02_05;

/*演習2-5
二つの実数値を読み込み、その和と平均を求めて
表示するプログラムを作成せよ
*/

//JAVAに値を通す宣言文
import java.util.Scanner;

public class E_02_05 {
	public static void main(String[] args) {

		// キーボードとプログラムをつなぐための命令文
		Scanner stdIn = new Scanner(System.in);

		// 読み込まれた値を抽出。
		System.out.println("アイススケートショートプログラムの得点 ： ");

		// 抽出された値をｘに代入。
		double x = stdIn.nextDouble();

		// 読み込まれた値を抽出。
		System.out.println("アイススケートフリープログラムの得点 ： ");

		// 抽出された値をyに代入。
		double y = stdIn.nextDouble();

		// ショートとフリーの合計した値を出力
		System.out.println("得点の合計は" + (x + y) + "です。");

		// ショートとフリーの合計した値を出力
		System.out.println("得点の平均は" + (x + y) / 2 + "です。");

	}
}