package e_02_10;

/*���K2-10
 ���O�̐��Ɩ����ʂɃL�[�{�[�h����ǂݍ����
 ���A���s���v���O�������쐬����B
*/

import java.util.Scanner;

public class E_02_10 {

	public static void main(String[] args) {

		// �L�[�{�[�h�ƃv���O�������Ȃ����߂̖��ߕ�
		Scanner nameLast= new Scanner(System.in);
		Scanner nameFirst = new Scanner(System.in);

		// ()����\���B
		System.out.print("�� �F ");
		// ���o���ꂽ�l�����B
		String familyName = nameLast.next();

		// ()����\���B
		System.out.print("�� �F ");
		// ���o���ꂽ�l�����B
		String firstName = nameFirst.next();

		System.out.println("����ɂ���" + familyName + firstName + "����B");
	}
}
