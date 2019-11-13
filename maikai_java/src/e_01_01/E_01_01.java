package e_01_01;
/*演習1ｰ1
プログラム中の文を終端を示すセミコロン；が欠如しているとどうなるのか。
プログラムをコンパイルして検証せよ
*/

public class E_01_01 {
	public static void main(String[] args) {

		//Hello Javaという文言を出力する為の命令文
		System.out.println("Hello Java");
	}
}

/*
 * セミコロン；が欠如していると バイトコードを作成するためのコンパイルが出来ない為実行ができない。
 */
