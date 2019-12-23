package e_02_03;
/*演習2ｰ3
 *右に示すように、キーボードから読み込んだ整数値を
 *そのまま反復して表示するプログラムを作成せよ。
*/

//JAVAに値を通す宣言文
import java.util.Scanner ;

public class E_02_03 {
	public static void main(String[] args) {

		//キーボードとプログラムをつなぐための命令文
		Scanner stdIn = new Scanner (System.in);

		//読み込まれた値を抽出し、ｘに代入を行っている。
		System.out.print( "整数値 ： " );
		int x = stdIn.nextInt();

		// キーボードにて設定された値と文言の出力
		System.out.println( x + "と入力しましたね。");


	}
}