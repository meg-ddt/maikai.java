package e_02_07;

/*���K2-7
�ȉ��Ɏ����v���O�������쐬����
 1���̐��̐����l(1�ȏ�9�ȉ��̒l)�������_���ɐ������ĕ\��
 1���̕��̐����l(-1�ȏ�-9�ȉ��̒l)�������_���ɐ������ĕ\��
 2���̐��̐����l(10�ȏ�99�ȉ��̒l)�������_���ɐ������ĕ\��
*/

import java.util.Random;

public class E_02_07 {

	public static void main(String[] args) {

		// �����s���������R���\�[���ɕ\��
		System.out.println("�����̋C��");

		// �������s�����܂蕶
		Random rand = new Random();

		// 1���̐��̐����l(1�ȏ�9�ȉ��̒l)�������_���ɐ������ĕ\��
		// 1����9�ȉ��̒l�������_���Ő���
		int highestTemperature = rand.nextInt(9) + 1;
		// �������ꂽ�l���o��
		System.out.println("�ō��C����" + highestTemperature + "�x�ł��B");

		// 1���̕��̐����l(-1�ȏ�-9�ȉ��̒l)�������_���ɐ������ĕ\��
		// -1����-9�ȉ��̒l�������_���Ő���
		int lowestTemperature = rand.nextInt(9) - 9;
		// �������ꂽ�l���o��
		System.out.println("�Œ�C����" + lowestTemperature + "�x�ł��B");

		// 2���̐��̐����l(10�ȏ�99�ȉ��̒l)�������_���ɐ������ĕ\��
		// 10����99���̒l�������_���Ő���
		int sinceYears = rand.nextInt(90) + 10;
		// �������ꂽ�l���o��
		System.out.println("9���̋C���ł�" + sinceYears + "�N�U��̋C���ł��B");

	}
}
