package e_02_03;
/*���K2�3
 *�E�Ɏ����悤�ɁA�L�[�{�[�h����ǂݍ��񂾐����l��
 *���̂܂ܔ������ĕ\������v���O�������쐬����B
*/

//JAVA�ɒl��ʂ��錾��
import java.util.Scanner ;

public class E_02_03 {
	public static void main(String[] args) {

		//�L�[�{�[�h�ƃv���O�������Ȃ����߂̖��ߕ�
		Scanner stdIn = new Scanner (System.in);

		//�ǂݍ��܂ꂽ�l�𒊏o���A���ɑ�����s���Ă���B
		System.out.print( "�����l �F " );
		int x = stdIn.nextInt();

		// �L�[�{�[�h�ɂĐݒ肳�ꂽ�l�ƕ����̏o��
		System.out.println( x + "�Ɠ��͂��܂����ˁB");


	}
}