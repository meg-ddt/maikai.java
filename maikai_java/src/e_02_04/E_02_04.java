package e_02_04;
/*���K2-4
�E�Ɏ����悤�ɁA�L�[�{�[�h����ǂݍ��񂾐����l��10���������l��
10���������l���o�͂���v���O�������쐬����
*/

//JAVA�ɒl��ʂ��錾��
import java.util.Scanner;

public class E_02_04 {
	public static void main(String[] args) {

		// �L�[�{�[�h�ƃv���O�������Ȃ����߂̖��ߕ�
		Scanner stdIn = new Scanner(System.in);

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("�����l �F ");

		// ���o���ꂽ�l�����ɑ���B
		int extractedValue = stdIn.nextInt();

		// �L�[�{�[�h�ɂĐݒ肳�ꂽ�l��10���Z���ꂽ�l���o��
		System.out.println("10���������l��" + (extractedValue + 10) + "�ł��B");

		// �L�[�{�[�h�ɂĐݒ肳�ꂽ�l��10���Z���ꂽ�l���o��
		System.out.println("10���������l��" + (extractedValue - 10) + "�ł��B");

	}
}