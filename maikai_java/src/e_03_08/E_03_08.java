package e_03_08;

/*���K3-8
 �L�[�{�[�h����ǂݍ��񂾓_���ɉ�����
 �D/��/��/�s�𔻒肵�ĕ\������v���O�������쐬����
 ����́A�ȉ��̂悤�ɍs������
 0�`59���s��/60�`69����/70�`79����/80�`100���D
*/

import java.util.Scanner;

public class E_03_08 {

	public static void main(String[] args) {

		Scanner scanPoint = new Scanner(System.in);

		// �����̕\��
		System.out.print("�_������͂��Ă��������B�F");
		// ���o���ꂽ�l�����B
		int totalPoint = scanPoint.nextInt();

		// �_����0�`59�̏ꍇ
		if (totalPoint >= 0 && totalPoint <= 59) {
			// ���ʂ�\��
			System.out.println("�s��");
			// �_����60�`69�̏ꍇ
		} else if (totalPoint >= 60 && totalPoint <= 69) {
			System.out.println("��");
			// �_����70�`79�̏ꍇ
		} else if (totalPoint >= 70 && totalPoint <= 79) {
			System.out.println("��");
		} else {
			// �_����80�`100�̏ꍇ
			System.out.println("�D");
		}
	}
}
