package e_02_06;

/*演習2-6
三角形の底辺と高さを読み込んで
その面積を表示するプログラムを作成せよ
*/

//JAVAに値を通す宣言文
import java.util.Scanner;

public class E_02_06 {
	public static void main(String[] args) {

		//何を求めているのかをコンソールに表示
		System.out.println("三角形の面積を求めます。");

		// キーボードとプログラムをつなぐための命令文
		Scanner stdIn = new Scanner(System.in);

		// 読み込まれた値を抽出。
		System.out.println("底辺 ： ");
		// 抽出された値をｘに代入。
		double x = stdIn.nextDouble();

		// 読み込まれた値を抽出。
		System.out.println("高さ ： ");
		// 抽出された値をyに代入。
		double y = stdIn.nextDouble();

		// ショートとフリーの合計した値を出力
		System.out.println("三角形の面積は" + (x * y / 2) + "です。");

	}
}