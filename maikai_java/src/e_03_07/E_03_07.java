package e_03_07;

/*���K3-7
 ���̐����l��ǂݍ����
 �����3�Ŋ������l�ɉ�����
 �w���̒l��3�Ŋ���؂�܂��B�x
 �w���̒l��3�Ŋ������]���1�ł��B�x
 �w���̒l��3�Ŋ������]���2�ł��B�x
 �\������v���O�������쐬����
 �����ł͂Ȃ��l����ǂݍ��񂾏ꍇ�́A�w���ł͂Ȃ��l�����͂���܂����B�x��
 �@�\�����邱��
*/

import java.util.Scanner;

public class E_03_07 {

	public static void main(String[] args) {

		Scanner scanInteger = new Scanner(System.in);

		// �����̕\��
		System.out.print("���̐����l����͂��Ă��������B�F");
		// ���o���ꂽ�l�����B
		int firstInteger = scanInteger.nextInt();

		if (firstInteger > 0) {
			// �����l��3�Ŋ���؂ꂽ�ꍇ
			if (firstInteger % 3 == 0) {
				// ���ʂ��o��
				System.out.println("���̒l��3�Ŋ���؂�܂��B");
				// �����l��3�Ŋ������]���1�̏ꍇ
			} else if (firstInteger % 3 == 1) {
				// ���ʂ��o��
				System.out.println("���̒l��3�Ŋ������]���1�ł��B");
				// �����l��3�Ŋ������]���2�̏ꍇ
			} else {
				// ���ʂ��o��
				System.out.println("���̒l��3�Ŋ������]���2�ł��B");
			}
			// �}�C�i�X�̒l���o�͂��ꂽ�ꍇ
		} else {
			// ��Βl�̒l���o��
			System.out.println("���ł͂Ȃ��l�����͂���܂����B");
		}
	}
}
