package e_02_09;

/*���K2-9
�ȉ��Ɏ����v���O�������쐬����
(�����l�̗����̐����ɂ�nextDouble()���g������)
 0.0�ȏ�1.0�����̎����l�������_���ɐ������ĕ\��
 0.0�ȏ�10.0�����̎����l�������_���ɐ������ĕ\��
 -1.0�ȏ�1.0�����̎����l�������_���ɐ������ĕ\��
*/

import java.util.Random;

public class E_02_09 {

	public static void main(String[] args) {

		// �����s���������R���\�[���ɕ\��
		System.out.println("50m���^�C��");

		// �������s�����܂蕶
		Random rand = new Random();

		// 0.0�ȏ�1.0�����̎����l�������_���ɐ������ĕ\��
		double timeDifferenceWithFirstPlace = rand.nextDouble();
		// 0.0�ȏ�10.0�����̎����l�������_���ɐ������ĕ\��
		double meterTime = rand.nextDouble() * 9;
		// -1.0�ȏ�1.0�����̎����l�������_���ɐ������ĕ\��
		double personalBest = rand.nextDouble() * -1;

		// �������ꂽ�l���o��
		System.out.println("1�ʂƂ̍���" + timeDifferenceWithFirstPlace + "�b�ł��B");
		// �������ꂽ�l���o��
		System.out.println("50m�̃^�C����" + meterTime + "�b�ł��B");
		// �������ꂽ�l���o��
		System.out.println("���ȃx�X�g�Ƃ̍���" + personalBest + "�b�ł��B");

	}
}
