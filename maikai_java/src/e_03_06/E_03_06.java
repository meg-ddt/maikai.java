package e_03_06;

/*���K3-6
���̐����l��ǂݍ����
���ꂪ10�̔{���ł���΁w���̒l��10�̔{���ł��B�x�ƕ\����
�����łȂ���΁w���̒l��10�̔{���ł͂���܂���B�x��
�\������v���O�������쐬����
�����ł͂Ȃ��l����ǂݍ��񂾏ꍇ�́A�w���ł͂Ȃ��l�����͂���܂����B�x��
�@�\�����邱��
*/

import java.util.Scanner;

public class E_03_06 {

	public static void main(String[] args) {

		Scanner integerValue = new Scanner(System.in);

		// �����̕\��
		System.out.print("���̐����l����͂��Ă��������B");
		// ���͂��ꂽ�l����
		int seisuuA = integerValue.nextInt();

		// ���͂��ꂽ������10�Ŋ���؂�A10�ȏ�ł���ꍇ
		if (seisuuA % 10 == 0 && seisuuA >= 10) {
			// ���ʂ�\��
			System.out.println("���̒l��10�̔{���ł��B");
			// ���͂��ꂽ������10�Ŋ���؂ꂸ�A0���傫���ꍇ
		} else if (seisuuA % 10 != 0 && seisuuA > 0) {
			// ���ʂ�\��
			System.out.println("���̒l��10�̔{���ł͂���܂���B");
			// ��L�̏����ȊO�̏ꍇ
		} else {
			// ���ʂ�\��
			System.out.println("���ł͂Ȃ��l�����͂���܂����B");
		}
	}
}
