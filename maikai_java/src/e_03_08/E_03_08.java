package e_03_08;

/*‰‰K3-8
 ƒL[ƒ{[ƒh‚©‚ç“Ç‚Ýž‚ñ‚¾“_”‚É‰ž‚¶‚Ä
 —D/—Ç/‰Â/•s‰Â‚ð”»’è‚µ‚Ä•\Ž¦‚·‚éƒvƒƒOƒ‰ƒ€‚ðì¬‚¹‚æ
 ”»’è‚ÍAˆÈ‰º‚Ì‚æ‚¤‚És‚¤‚±‚Æ
 0`59¨•s‰Â/60`69¨‰Â/70`79¨—Ç/80`100¨—D
*/

import java.util.Scanner;

public class E_03_08 {

	public static void main(String[] args) {

		Scanner scanPoint = new Scanner(System.in);

		// •¶Œ¾‚Ì•\Ž¦
		System.out.print("“_”‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢BF");
		// ’Šo‚³‚ê‚½’l‚ð‘ã“üB
		int totalPoint = scanPoint.nextInt();

		// “_”‚ª0`59‚Ìê‡
		if (totalPoint >= 0 && totalPoint <= 59) {
			// Œ‹‰Ê‚ð•\Ž¦
			System.out.println("•s‰Â");
			// “_”‚ª60`69‚Ìê‡
		} else if (totalPoint >= 60 && totalPoint <= 69) {
			System.out.println("‰Â");
			// “_”‚ª70`79‚Ìê‡
		} else if (totalPoint >= 70 && totalPoint <= 79) {
			System.out.println("—Ç");
		} else {
			// “_”‚ª80`100‚Ìê‡
			System.out.println("—D");
		}
	}
}
