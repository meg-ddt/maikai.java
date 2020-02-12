package e_02_10;

/*演習2-10
 名前の性と名を個別にキーボードから読み込んで
 挨拶を行うプログラムを作成せよ。
*/

import java.util.Scanner;

public class E_02_10 {

	public static void main(String[] args) {

		// キーボードとプログラムをつなぐための命令文
		Scanner nameLast= new Scanner(System.in);
		Scanner nameFirst = new Scanner(System.in);

		// ()内を表示。
		System.out.print("姓 ： ");
		// 抽出された値を代入。
		String familyName = nameLast.next();

		// ()内を表示。
		System.out.print("名 ： ");
		// 抽出された値を代入。
		String firstName = nameFirst.next();

		System.out.println("こんにちは" + familyName + firstName + "さん。");
	}
}
