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

		Scanner scanInteger = new Scanner(System.in);

		// �����̕\��
		System.out.print("���̐����l����͂��Ă��������B");
		// ���͂��ꂽ�l����
		int firstInteger = scanInteger.nextInt();

		// ���͂��ꂽ�l��0�ȏ�̏ꍇ
		if (firstInteger > 0) {
			// ���͂��ꂽ������10�Ŋ���؂��ꍇ
			if (firstInteger % 10 == 0) {
				// ���ʂ�\��
				System.out.println("���̒l��10�̔{���ł��B");
				// ���͂��ꂽ������10�Ŋ���؂�Ȃ��ꍇ
			} else {
				// ���ʂ�\��
				System.out.println("���̒l��10�̔{���ł͂���܂���B");
				// ��L�̏����ȊO�̏ꍇ
			}
			// ���͂��ꂽ�l���}�C�i�X�̏ꍇ
		} else {
			// ���ʂ�\��
			System.out.println("���ł͂Ȃ��l�����͂���܂����B");
		}
	}
}
