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

		Scanner scanVariable = new Scanner(System.in);

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("�ϐ�a �F");
		// ���o���ꂽ�l�����B
		int firstVariable = scanVariable.nextInt();
		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("�ϐ�b �F ");
		// ���o���ꂽ�l�����B
		int nextVariable = scanVariable.nextInt();

		// �ϐ�a���傫���ꍇ
		if (firstVariable > nextVariable) {
			// �ǂ��炪�傫�������ʂ��o��
			System.out.println("a�̂ق����傫���ł��B");
			// �ϐ�b���傫���ꍇ
		} else if (firstVariable < nextVariable) {
			// �ǂ��炪�傫�������ʂ��o��
			System.out.println("b�̂ق����傫���ł��B");
			// �ϐ�a�ƕϐ�b�������̏ꍇ
		} else if (firstVariable == nextVariable) {
			// �ǂ��炪�傫�������ʂ��o��
			System.out.println("a��b�͓����l�ł��B");
		}
	}
}
