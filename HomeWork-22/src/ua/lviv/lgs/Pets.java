package ua.lviv.lgs;

public class Pets {
	public static void main(String[] args) {
		
		Entroducing cow = () -> System.out.println("� ������- ����-����");
		Entroducing cat = () -> System.out.println("� ��- �����-�����");
		Entroducing dog = () -> System.out.println("� ��� - �����-�����");
		
		cow.voice();
		cat.voice();
		dog.voice();
		
		
	}

}

interface Entroducing{
	void voice();
}