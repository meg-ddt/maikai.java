package e_02_02;
/*演習2ｰ2
三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ
*/

public class E_02_02 {
	public static void main(String[] args) {

		// 変数
		int x;
		int y;
		int z;

		// 代入する値;
		x = 12;
		y = 20;
		z = 40;

		// 出力（合計）
		System.out.println(x + y + z);

		// 出力（平均）
		System.out.println((x + y + z) / 2);

	}
}