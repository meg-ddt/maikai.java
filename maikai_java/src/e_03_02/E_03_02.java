package e_03_02;

/*���K3-2
 ��̐��̐����l��ǂݍ����
 ��҂��O�҂̖񐔂ł����
 �uB��A�̖񐔂ł��B�v�ƕ\����
 �����łȂ����
 �uB��A�̖񐔂ł͂���܂���B�v�ƕ\������
 �v���O�������쐬����
*/

import java.util.Scanner;

public class E_03_02 {

	public static void main(String[] args) {

		Scanner integerA = new Scanner(System.in);

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("����A �F ");
		// ���o���ꂽ�l�����B
		int seisuuA = integerA.nextInt();

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("����B �F ");
		// ���o���ꂽ�l�����B
		int seisuuB = integerA.nextInt();

		// ����B������A�̖񐔂��ۂ��𔻒f
		if (seisuuA % seisuuB == 0) {
			//�񐔂̏ꍇ�A�񐔂ł���|��\��
			System.out.println("B��A�̖񐔂ł��B");
			//
		} else {
			//�񐔂łȂ��ꍇ�A�񐔂łȂ��|��\��
			System.out.println("B��A�̖񐔂ł͂���܂���B");
		}
	}
}
