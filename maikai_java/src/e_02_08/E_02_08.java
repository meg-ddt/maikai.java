package e_02_08;

/*���K2-8
 �L�[�{�[�h����ǂݍ��񂾐����l�v���X�}�C�i�X�T�͈̔͂�
 �����l�������_���ɐ������ĕ\������v���O�������쐬����
*/

import java.util.Random;
import java.util.Scanner;

public class E_02_08 {

	public static void main(String[] args) {

		// �L�[�{�[�h�ƃv���O�������Ȃ����߂̖��ߕ�
		Scanner stdIn = new Scanner(System.in);
		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("�����l �F ");
		// ���o���ꂽ�l�𒊏o�l�ɑ���B
		int extractedValue = stdIn.nextInt();

		// �������s�����܂蕶
		Random rand = new Random();
		// ���o�������̐����l�Ɂ}�T�𑫂����l�������_���ɐ���
		int randomValue = rand.nextInt(11) + -5;
		// ���o�����l�ƃ����_���ɐ��������l�𑫂�
		int randomNnumber = (extractedValue + randomValue);
		// ���o�����l�ƃ����_���ɐ��������l�𑫂�
		System.out.println("���̒l�́}�T�̗����𐶐����܂����B�����" + randomNnumber + "�ł��B");

	}
}