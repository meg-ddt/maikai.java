package e_03_01;

/*���K3-1
 �����l��ǂݍ����
 ���̐�Βl�����߂ĕ\������
 �v���O�������쐬����
*/

import java.util.Scanner;

public class E_03_01 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("�����l �F ");
		// ���o���ꂽ�l�����B
		int integerValue = stdIn.nextInt();

		// �����l��0�ȏ�̏ꍇ
		if (integerValue >= 0) {
			// ��Βl�̒l���o��
			System.out.println("��Βl��" + integerValue + "�ł��B");
		// �����l��0�����̏ꍇ
		} else {
			// ��Βl�̒l�����߂邽�߃}�C�i�X�𔽓]�����ďo��
			System.out.println("��Βl��" + -integerValue + "�ł��B");
		}
	}
}
