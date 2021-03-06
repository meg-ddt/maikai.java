package e_03_08;

/*演習3-8
 キーボードから読み込んだ点数に応じて
 優/良/可/不可を判定して表示するプログラムを作成せよ
 判定は、以下のように行うこと
 0〜59→不可/60〜69→可/70〜79→良/80〜100→優
*/

import java.util.Scanner;

public class E_03_08 {

	public static void main(String[] args) {

		Scanner scanPoint = new Scanner(System.in);

		// 文言の表示
		System.out.print("点数を入力してください。：");
		// 抽出された値を代入。
		int totalPoint = scanPoint.nextInt();

		// 点数が0〜59の場合
		if (totalPoint >= 0 && totalPoint <= 59) {
			// 結果を表示
			System.out.println("不可");
			// 点数が60〜69の場合
		} else if (totalPoint >= 60 && totalPoint <= 69) {
			System.out.println("可");
			// 点数が70〜79の場合
		} else if (totalPoint >= 70 && totalPoint <= 79) {
			System.out.println("良");
		} else {
			// 点数が80〜100の場合
			System.out.println("優");
		}
	}
}
