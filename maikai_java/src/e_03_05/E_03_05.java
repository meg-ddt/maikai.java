package e_03_05;

/*���K3-5
 ���̐����l��ǂݍ����
 ���ꂪ5�Ŋ���؂��΁w���̒l��5�Ŋ���؂�܂��B�x�ƕ\����
 �����łȂ���΁w���̒l��5�Ŋ���؂�܂���B�x��
 �\������v���O�������쐬����
 �����ł͂Ȃ��l����ǂݍ��񂾏ꍇ�́A�w���ł͂Ȃ��l�����͂���܂����B�x��
 �@�\�����邱��
*/

import java.util.Scanner;

public class E_03_05 {

	public static void main(String[] args) {

		Scanner integerValue = new Scanner(System.in);

		// �����̕\��
		System.out.print("���̐����l����͂��Ă��������B�F");
		// ���o���ꂽ�l�����B
		int seisuuA = integerValue.nextInt();

		// �����l��5�Ŋ���؂��ꍇ
		if (seisuuA % 5 == 0 && seisuuA > 0) {
			// ���ʂ��o��
			System.out.println("���̒l��5�Ŋ���؂�܂��B");
			// �����l��5�Ŋ���؂�Ȃ��ꍇ
		} else if (seisuuA % 5 != 0 && seisuuA > 0) {
			// ���ʂ��o��
			System.out.println("���̒l��5�Ŋ���؂�܂���B");
			// �}�C�i�X�̒l���o�͂��ꂽ�ꍇ
		} else {
			// ��Βl�̒l���o��
			System.out.println("���ł͂Ȃ��l�����͂�����܂����B");
		}
	}
}
