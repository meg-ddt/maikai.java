package e_02_01;
/*演習2ｰ1
List2-6の2の箇所を、小数部をもつ実数値をｘとｙに代入するように変更して
その結果を考察せよ
*/

public class E_02_01 {
	public static void main(String[] args) {

		// 変数
		int x;
		int y;

		// 代入する値;
		// 小数部をもつ実数値をｘとｙに代入するとどうなるのか
		x = 6.0;
		y = 1.0;
		//int型は少数部を持つ実数値は代入することができない
		
		
		// 出力文章
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");

		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");

	}
}