package e_02_05;

/*���K2-5
��̎����l��ǂݍ��݁A���̘a�ƕ��ς����߂�
�\������v���O�������쐬����
*/

//JAVA�ɒl��ʂ��錾��
import java.util.Scanner;

public class E_02_05 {
	public static void main(String[] args) {

		// �L�[�{�[�h�ƃv���O�������Ȃ����߂̖��ߕ�
		Scanner stdIn = new Scanner(System.in);

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.println("�A�C�X�X�P�[�g�V���[�g�v���O�����̓��_ �F ");

		// ���o���ꂽ�l�����ɑ���B
		double x = stdIn.nextDouble();

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.println("�A�C�X�X�P�[�g�t���[�v���O�����̓��_ �F ");

		// ���o���ꂽ�l��y�ɑ���B
		double y = stdIn.nextDouble();

		// �V���[�g�ƃt���[�̍��v�����l���o��
		System.out.println("���_�̍��v��" + (x + y) + "�ł��B");

		// �V���[�g�ƃt���[�̍��v�����l���o��
		System.out.println("���_�̕��ς�" + (x + y) / 2 + "�ł��B");

	}
}