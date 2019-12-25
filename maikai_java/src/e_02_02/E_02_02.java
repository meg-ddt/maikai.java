package e_02_02;
/*演習2ｰ2
三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
*/

public class E_02_02 {
	public static void main(String[] args) {

		// Aさんのテストの点数の合計・平均を求めるとする
		// 変数（国語の点数）
		int nationallanguageTest;

		// 変数（数学の点数）
		int mathTest;

		// 変数（理科の点数）
		int scienceTest;

		int totalResult;

		// 代入する点数;
		nationallanguageTest = 63;
		mathTest = 78;
		scienceTest = 90;

		// 合計結果
		totalResult = (nationallanguageTest + mathTest + scienceTest);

		// 出力（合計）
		System.out.println(totalResult);

		// 出力（平均）
		System.out.println(totalResult / 3);

	}
}