package e_03_03;

/*���K3-3
 List3-5�̍Ō��else���A
 else if( n == 0 )��
 �ύX������ǂ��Ȃ邩����������
 */

import java.util.Scanner;

public class E_03_03 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		// �ǂݍ��܂ꂽ�l�𒊏o�B
		System.out.print("�����l �F ");
		// ���o���ꂽ�l�����B
		int n = stdIn.nextInt();

		// �����l��0���傫���ꍇ
		if (n > 0)
			// ��Βl�̒l���o��
			System.out.println("���̒l�͐��ł��B");
		// �����l��0��菬�����ꍇ
		else if (n < 0)
			// ��Βl�̒l���o��
			System.out.println("���̒l�͕��ł��B");
		// ��Βl��0�̏ꍇ
		else if (n == 0)
			// ��Βl�̒l���o��
			System.out.println("���̒l��0�ł��B");
		/*
		 * List3-5�̍Ō��else���͈ȉ��̒ʂ�
		 *  else System.out.println( "���̒l��0�ł��B");
		 * ���̏��������ƁA0���傫���܂��͏������l�ł͂Ȃ�(0)�Ƃ������ƂɂȂ�B
		 *  else if (n ==0)�̏������ɂȂ�ƁA0�ł��邱�Ƃ������Ƃ��Ă���B
		 * �Ӗ��Ƃ��Ă͕ς�邪�A�c��̐�����0�݂̂̂��ߌ��ʂ͕ς��Ȃ��B
		 */
	}
}
