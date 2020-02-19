package e_03_03;

/*演習3-3
 List3-5の最後のelseを、
 else if( n == 0 )に
 変更したらどうなるかを検討せよ
 */

import java.util.Scanner;

public class E_03_03 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		// 読み込まれた値を抽出。
		System.out.print("整数値 ： ");
		// 抽出された値を代入。
		int n = stdIn.nextInt();

		// 整数値が0より大きい場合
		if (n > 0)
			// 絶対値の値を出力
			System.out.println("その値は正です。");
		// 整数値が0より小さい場合
		else if (n < 0)
			// 絶対値の値を出力
			System.out.println("その値は負です。");
		// 絶対値が0の場合
		else if (n == 0)
			// 絶対値の値を出力
			System.out.println("その値は0です。");
		/*
		 * List3-5の最後のelse文は以下の通り
		 *  else System.out.println( "その値は0です。");
		 * この条件式だと、0より大きいまたは小さい値ではない(0)ということになる。
		 *  else if (n ==0)の条件式になると、0であることを条件としている。
		 * 意味としては変わるが、残りの整数は0のみのため結果は変わらない。
		 */
	}
}
