package pakebiao;

public class jsonString {

	public jsonString() {
		// TODO Auto-generated constructor stub
	}

	public static String str = "ѡ�� �γ� ѧ�� ��� �ον�ʦ �Ͽ� ��� �Ͽΰ༶ ���� ���� �Ͽ�ʱ��/�Ͽεص� ��ѡ ��ѡ ��ѡ [45140115]��Ŀ�ۺ�Ӧ��ʵѵ 1.0 �������ѧ�� רҵ��/���޿� ����RJ 001 58 55 3 [1-18��]������[5-6��]/S102����ʵѵ�� [11180302]���������� 2.0 ����ѧ�� ������/���޿� ������ 004 300 295 5 [1-18˫��]���ڶ�[9-10��]/2306 [11180202]ë��˼�����й���ɫ�������������ϵ���ۣ����� 3.0 ����ѧ�� ������/���޿� �ſ�Ӣ 011 133 130 3 [1-18��]���ڶ�[3-4��]/4206 [22140104]����ϵͳ 4.0 �������ѧ�� רҵ��/���޿� ������ 002 58 55 3 [1-18˫��]������[7-8��]/S102����ʵѵ�� ������ 001 58 55 3 [1-18��]����һ[1-2��]/4212 [1-18����]������[7-8��]/4212 [31140217]�����������뼼�� 3.0 �������ѧ�� רҵ��/���޿� ���JK 002 58 55 3 [1-18��]������[1-2��]/S501�� ����ʵ����02 ���JK 001 58 55 3 [1-18��]���ڶ�[7-8��]/4311 [31140219]��Ϣ��ȫ���� 4.0 �������ѧ�� רҵ��/���޿� ������ 002 58 55 3 [1-18˫��]������[5-6��]/S101����ʵѵ�� ������ 001 58 55 3 [1-18��]����һ[3-4��]/4310 [1-18����]������[5-6��]/4310 [32140215]javaEEӦ�ÿ��� 3.0 �������ѧ�� רҵ��/���޿� �Ź�ƽ 002 58 55 3 [1-18��]���ڶ�[1-2��]/S102����ʵѵ�� �Ź�ƽ 001 58 55 3 [1-18��]����һ[5-6��]/4311";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = str.length();
		String[] names = str.split(" ");
		for (int i = 14; i < names.length; i++) {
			int j = i -13;
            System.out.println("i = " + j +"\t"+ names[i]);
        }

	}

}