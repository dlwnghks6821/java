import java.util.Scanner;
public class JavaNew {

	public static void main(String[] args) {
		
		//for1 :�о���̰� ����//
		//for 2 :���//
		
		Scanner sc = new Scanner(System.in);
		String[]a = new String[9];
		//----> ! �̸��� �� �л��� �� �°� �迭���°� �Է¹޴´�.! 9�� <-------//
		for(int i = 0 ; i<9 ; i++){
			
			System.out.println("�̸��� �Է����ּ���.");
			String name = sc.nextLine();
			//------>! ��ĳ���� ���빰�� �迭���� ���� !<-------//
			a[i]=name;		
		}
		//------------>! �迭�� �����ѳ���(a[])�迭�� j �� 1�����ϸ鼭 �ݺ��ϴ� �ݺ����� ���� ���! <------------//
		 for(int j = 0 ; j<9 ; j++){
			 System.out.println(a[j]);
		 }
	
			
		
         	
	
	
		
	}
	}


