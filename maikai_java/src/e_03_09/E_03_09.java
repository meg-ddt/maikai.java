package e_03_09;

/*���K3-9
 ��̎����l��ǂݍ���ŁA�傫�����̒l��\������v���O�������쐬����B
*/

import java.util.Scanner;

public class E_03_09 {

	public static void main(String[] args) {

		Scanner integerValue = new Scanner(System.in);

		// �����̕\��
		System.out.print("�����l����͂��Ă��������F�����l1��");
		// ���͂��ꂽ�����l����
		int actualValue1 = integerValue.nextInt();
		// �����̕\��
		System.out.print("�����l����͂��Ă��������F�����l2��");
		// ���͂��ꂽ�����l����
		int actualValue2 = integerValue.nextInt();

		// �����l1��2���r
		int actualValue = actualValue1 > actualValue2 ? actualValue1 : actualValue2;
		// ��r�������ʂ�\��
		System.out.println("2�̎����l���ׂ����ʁA" + actualValue + "�̒l���傫���ł��B");

	}
}
