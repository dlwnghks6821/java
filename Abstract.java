package fff;

public class fff {

	public static void main(String[] args) {
		Pc2 p2 =new Pc2();
		p2.display();
		p2.typing();

	}

}
abstract class Pc{
	//�߻�޼ҵ�//
	//�߻�޼ҵ�� ����� �����ؼ� �׳����� �������ؼ� ����ؾ��Ѵ�//
	//�߻�޼ҵ�� ����� �����ؼ� �������̵��ȳ����� ����ϰ��Ѵ�.//
	abstract void display();
	abstract void typing();
	//�Ϲݸ޼ҵ�//
	void turnOn() {
		System.out.println("power on");
	}
	void turnOff() {
		System.out.println("power off");
	}
}
class Pc2 extends Pc{
	//�߻�Ŭ������ ��ӹޱ����ؼ���//
	//1)�߻�Ŭ������ �ִ� �߻�޼ҵ带 �ڽ����� �����ؾ��Ѵ�.//
	//2)�ڽ��� Ŭ������ �߻�Ŭ������ �ٲپ��ش�.//
	
	void display(){
		System.out.println("display");
	}
	void typing() {
		System.out.println("typing");
	}
}
