import java.util.Scanner;
public class JavaNew {

	public static void main(String[] args) {
		 String []  name =  new String[7];
		int[] point = new int[7];
		
		//�̸��� �Է��ϼ���.//
		//aaa//
		//������ �Է��ϼ��� //
		///dwdwdw//
		//������ �Է��ϼ���//
		//99//
		
	
		//for 2 =����Ѵ�. (�̸� ; ���� );//
	       Scanner sc1 = new Scanner(System.in);
	       Scanner sc2 = new Scanner(System.in);
	       for(int i = 0; i<7; i++){
	    	    System.out.println("�̸��� �Է����ּ���.");
	         String n = sc1.nextLine();
	         name[i]=n;
	          
	           System.out.println("������ �Է����ּ���.");
	           int num = sc2.nextInt();
	           point[i]=num;
				 
	       }
	         for(int j = 0; j<7 ; j++){
	        	 System.out.println(name[j]+";"+point[j]);
	         }
				 
	}
	}

