package e_03_04;

/*���K3-4
 ��̕ϐ�a�Ab�ɒl��ǂݍ����
 ���̑召�֌W���ȉ��̂����ꂩ�ŕ\������
 �v���O�������쐬����
 �ua�̂ق����傫���ł��B�v
 �ub�̂ق����傫���ł��B�v
 �ua��b�͓����l�ł��B�v
*/

import java.util.Scanner;

public class E_03_04 {

	public static void main(String[] args) {

		/*
		 * a�Љ�̓_�����A b���Ȃ̓_���ƒu�������A�v���O�������쐬����
		 */

		Scanner testScore = new Scanner(System.in);

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("�Љ�̓_�� �F");
		// ���o���ꂽ�l�����B
		int socialScore = testScore.nextInt();
		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("���Ȃ̓_�� �F ");
		// ���o���ꂽ�l�����B
		int scienceScore = testScore.nextInt();

		// �Љ�̓_�����傫���ꍇ
		if (socialScore > scienceScore) {
			// �ǂ��炪�傫�������ʂ��o��
			System.out.println("�Љ�̓_���̂ق��������ł��B");
			// ���Ȃ̓_�����傫���ꍇ
		} else if (socialScore < scienceScore) {
			// �ǂ��炪�傫�������ʂ��o��
			System.out.println("���Ȃ̓_���̂ق��������ł��B");
			// �Љ�̓_���Ɨ��Ȃ̓_���������̏ꍇ
		} else if (socialScore == scienceScore) {
			// �ǂ��炪�傫�������ʂ��o��
			System.out.println("�Љ�̓_���E���Ȃ̓_���ǂ���������_���ł��B");
		}
	}
}
