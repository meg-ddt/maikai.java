package e_02_06;

/*���K2-6
�O�p�`�̒�ӂƍ�����ǂݍ����
���̖ʐς�\������v���O�������쐬����
*/

//JAVA�ɒl��ʂ��錾��
import java.util.Scanner;

public class E_02_06 {
	public static void main(String[] args) {

		//�������߂Ă���̂����R���\�[���ɕ\��
		System.out.println("�O�p�`�̖ʐς����߂܂��B");

		// �L�[�{�[�h�ƃv���O�������Ȃ����߂̖��ߕ�
		Scanner stdIn = new Scanner(System.in);

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.println("��� �F ");
		// ���o���ꂽ�l�����ɑ���B
		double x = stdIn.nextDouble();

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.println("���� �F ");
		// ���o���ꂽ�l��y�ɑ���B
		double y = stdIn.nextDouble();

		// �V���[�g�ƃt���[�̍��v�����l���o��
		System.out.println("�O�p�`�̖ʐς�" + (x * y / 2) + "�ł��B");

	}
}