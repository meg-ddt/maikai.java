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
		double actualValue1 = integerValue.nextDouble();
		// �����̕\��
		System.out.print("�����l����͂��Ă��������F�����l2��");
		// ���͂��ꂽ�����l����
		double actualValue2 = integerValue.nextDouble();

		// �����l1�������l2���傫���ꍇ�A�����l1�����ʂɑ�����A�����łȂ��ꍇ�͎����l2�����ʂɑ������B
		double largeValue = actualValue1 > actualValue2 ? actualValue1 : actualValue2;
		// ��r�������ʂ�\��
		System.out.println("2�̎����l���ׂ����ʁA" + largeValue + "�̒l���傫���ł��B");

	}
}
