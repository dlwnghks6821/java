import java.util.ArrayList;
import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
       
		Menu m1 =new Menu();
		m1.buildMenu();// menu �̸� ����
		m1.showMenu();// menu�̸� ������ ȭ�����
	}
}

class Menu{
	ArrayList<String>alName = new ArrayList<String>();
	ArrayList<Integer>order;
	ArrayList<Integer>Price=new ArrayList <Integer>();
	
      Menu(){
    	  alName = new ArrayList<String>();
    	  Price =new ArrayList<Integer>();
      }
	
	void buildMenu(){
       Scanner s1 = new Scanner(System.in);
       Scanner s2 = new Scanner(System.in);
		  alName = new ArrayList<String>();
		   
		int sum = 0;
		System.out.println("�޴��� ��������. ���� 0");
		String menu = s1.nextLine();
			while(!menu.equals("")){
				  alName .add(menu);
				 System.out.println("�����������ÿ�. ���� 0");
				 int P =  s2.nextInt();
				 Price.add(P); 
				 System.out.println("�޴��� ��������. ���� 0");
					menu = s1.nextLine();
			}
	}
	void showMenu(){
		

		 System.out.println(alName);
		 System.out.println(Price);
		 
			
			
	
		
		
		}
	}

