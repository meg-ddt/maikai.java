package e_02_02;
/*���K2�2
�O��int�^�ϐ��ɒl�������A���v�ƕ��ς����߂�v���O�������쐬����B
*/

public class E_02_02 {
	public static void main(String[] args) {

		// A����̃e�X�g�̓_���̍��v�E���ς����߂�Ƃ���
		// �ϐ��i����̓_���j
		int nationallanguageTest;

		// �ϐ��i���w�̓_���j
		int mathTest;

		// �ϐ��i���Ȃ̓_���j
		int scienceTest;

		int totalResult;

		// �������_��;
		nationallanguageTest = 63;
		mathTest = 78;
		scienceTest = 90;

		// ���v����
		totalResult = (nationallanguageTest + mathTest + scienceTest);

		// �o�́i���v�j
		System.out.println(totalResult);

		// �o�́i���ρj
		System.out.println(totalResult / 3);

	}
}