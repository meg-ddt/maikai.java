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
		 * a���N�k�M�̂ǂ񂮂�̔w��A b���J�V���̂ǂ񂭂�̔w��ƒu�������A �w��ׂ��s���v���O�������쐬����
		 */

		Scanner acornHeightKunugi = new Scanner(System.in);
		Scanner acornHeightKashiwa = new Scanner(System.in);

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("�Ƿނ̂ǂ񂮂�̔w��(mm) �F");
		// ���o���ꂽ�l�����B
		int acornOfKunugi = acornHeightKunugi.nextInt();
		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("��܂̂ǂ񂮂�̔w��(mm) �F ");
		// ���o���ꂽ�l�����B
		int acornOfKashiwa = acornHeightKashiwa.nextInt();

		// �N�k�M�̕����傫���ꍇ
		if (acornOfKunugi > acornOfKashiwa)
			// �ǂ��炪�傫�������ʂ��o��
			System.out.println("�Ƿނ̂ǂ񂮂�̂ق����傫���ł��B");
		// �J�V���̕����傫���ꍇ
		else if (acornOfKunugi < acornOfKashiwa)
			// �ǂ��炪�傫�������ʂ��o��
			System.out.println("��܂̂ǂ񂮂�̂ق����傫���ł��B");
		// �N�k�M�ƃJ�V�������������̏ꍇ
		else if (acornOfKunugi == acornOfKashiwa)
			// �ǂ��炪�傫�������ʂ��o��
			System.out.println("�Ƿނƶ�܂͓����傫���ł��B");

	}
}
