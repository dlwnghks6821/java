import java.util.Scanner;

import java.util.ArrayList;


public class JavaNew {

	public static void main(String[] args) {
		    //ī�� �ֹ� ���� //
		//1) �޴��� ȭ�鿡 ǥ��(�޴��� �迭�� �����ص��ȴ�. array list�� ����)
		//2)�޴���ȣ�� �Է��Ͻÿ�.��� ���� 0�̸� ����.
	//3) ex ī��� 4000 īǪġ�� 4õ �Ƹ޸�ī�� 3õ ���������� 2500  4.��׷��� 25��	
		//4) �޴���ȣ�� ������ ������ �Է��Ͻÿ�(1�̻�);
		// --(2) ---(3)���ݺ� �޴� ��ȣ�� 0�϶� ���� �ݺ�
		// 0�̵Ǹ� ����  �޴��̸� :x��
		// �Ѿ� ~~ ���
		//for  
		
		ArrayList alPrice = new ArrayList();//  ���� ����
		ArrayList <Integer>alOrder = new ArrayList();// �ֹ��� ����
		ArrayList alCount =new ArrayList() ; //������ ����
		ArrayList <Integer>alExpanse =new ArrayList();//��������//
		
								Scanner sc1 = new Scanner(System.in);//�ֹ�//
                              Scanner sc2 = new Scanner(System.in);//����//
                              Scanner sc3 = new Scanner(System.in);//�� �ƴϿ� ���//
                              Scanner sc4 = new Scanner(System.in);
                              Scanner sc5 = new Scanner(System.in);
                              
                              
		         String [] menu = {"1.ī���4õ�� ","2.īǪġ��3õ��","3.�Ƹ޸�ī��2õ��","4.��׷���2õ500��"};
		            //---> Ŀ�� ���� ���� <----//  
					         alExpanse.add(4000);//1. ī���//
					         alExpanse.add(3000);//2. īǪġ��//
					         
					         alExpanse.add(2000);//3. �Ƹ޸�ī��//
					         alExpanse.add(2500);//4.��׷��� //
		              
		                   Object  a = alExpanse.get(0);
                             System.out.println("�޴��� �������ּ���.");
                             System.out.println(menu[0]);
                             System.out.println(menu[1]);
                             System.out.println(menu[2]);
                             System.out.println(menu[3]);
                             int select = sc1.nextInt();
                             alOrder.add (select);//�ֹ��� ���� //
                            
                             
                             alOrder.get(select);
                            	  System.out.println("������ �Է����ּ���.");
                             int count =sc2.nextInt();
                             alCount.add(count);// ������ ���� // 
                             System.out.println("����"+count+"��"+"�ֹ�"+select+"��"+"�³���?");
                             System.out.println("1.��,2.�ƴϿ�.");
                             int  answer = sc3.nextInt();
                             if(answer ==1){
                            	 System.out.println("����"+count+"�Դϴ�."+"������"+(count* alExpanse.get(select))+"�Դϴ�.");
                             }
                           
                             
                             
                          

                             
                            
                     
                        
                             
                             
                             
	    }


			
			}
		
		
	
		

