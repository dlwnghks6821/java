import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Dbapp {

	public static void main(String[] args) {
		//����������//
		String driver = "oracle.jdbc.driver.OracleDriver";
		//localhost ���� ������ �ƴ� ��Ʈ��ȣ , �ּҰ� �ʿ�//
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		//user id //
		String user = "system";
		//password//
		String password = "human123";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("����Ŭ ���� ����");
			System.out.println("jdbc driver �ε� ����"); 
			//Statement statement = conn.createStatement();
			Scanner sc1= new Scanner(System.in);
			Scanner sc2 =new Scanner(System.in);
			Scanner sc3= new Scanner(System.in);
			Scanner sc4 = new Scanner(System.in);
			Scanner sc5 = new Scanner(System.in);
			Scanner sc6 = new Scanner(System.in);
		     System.out.println("1.�޴��߰� 2.�޴����� 3.�޴����� 4.�޴���ȸ 0.����");
		     int m1 =sc1.nextInt();
		     while(m1!=0) {
		    	 
		     
		    	 switch(m1) {
		    	 //insert ��//
		    	 case 1:
		    		 String sql1="insert into  fruits values(?,?)";
		    		
		    		 PreparedStatement ps1 = conn.prepareStatement(sql1);
		    		 System.out.println("�߰��� �޴��� �Է����ּ���.");
		    		 String menu1 = sc2.nextLine();
		    	
		    		 while(!menu1.equals("")) {
		    			 System.out.println("������ �Է����ּ���");
		    	 		 int price1 = sc3.nextInt();
		    			 ps1.setString(1,menu1);
		    			 ps1.setInt(2, price1);
		    			 ps1.executeUpdate();
		    			 System.out.println("�߰��� �޴��� �Է����ּ���.");
		 		    	 menu1 = sc2.nextLine();
		 		    	 
		    		 }
		    		 ps1.close();
		    		 break;
		    	 
		    	 case 2:	
		    		 //delete (�޴��̸�)//
		    		 String sql2 ="delete from fruits where name =?";
		    		 PreparedStatement ps2 = conn.prepareStatement(sql2);
		    		 System.out.println("������ �޴��̸���  �Է����ּ���.");
		    		 String delete = sc4.nextLine();
		    		 while(!delete.equals("")) {
		    			 System.out.println("������ �޴��� �Է����ּ���.(���� �Է½� ����)");
			    		 delete = sc4.nextLine();
			    		 ps2.setString(1, delete);
			    		 ps2.executeUpdate();
							System.out.println("������ �޴��� �Է����ּ���. (���� �Է½� ����)");
							delete = sc4.nextLine();
		    		 }
		    		 System.out.println("�շ��մϴ�.");
		 			ps2.close();
		 			break; 
		    	 case 3:
		    		 String sql3 = "update fruits set name=?,price=? where name=?";
		    		 PreparedStatement ps3 = conn.prepareStatement(sql3);
		    		 System.out.println("������ �޴��� �Է����ּ���.");
		    		 String name2 = sc5.nextLine();
		    		 while(!name2.equals("")) {
			    		 System.out.println("���� �̸��� �Է����ּ���.");
			    		 String oldName = sc6.nextLine();
			    		 System.out.println("���ο� ������ �Է����ּ���.");
			    		 int newPrice1 = sc6.nextInt();
			    		 ps3.setString(1, name2);
			    		 ps3.setString(2, oldName);
			    		 ps3.setInt(3, newPrice1);
			    		 ps3.executeUpdate();
			    		 
						 System.out.println("������ �޴��� �Է����ּ���.");
						 name2 = sc5.nextLine();
		    		 }
		    		 ps3.close();
		 			 
		    		 break;
		    	 case 4:
		    		 String sql4 = "select * from fruits ";
		    		 Statement stmt=null;
						stmt=conn.createStatement();
						ResultSet rs=stmt.executeQuery(sql4);
						System.out.println("�޴� | ����");
						while(rs.next()) {
							String me_name=rs.getString("name");
							int me_price=rs.getInt("price");
							System.out.println(me_name +" | "+me_price);
						}
						stmt.close();
						break;
					default:
						System.out.println("�߸��Է��Ͽ����ϴ�.");
						break;
					}
					System.out.println("�۾����� 1.�޴��߰� 2.�޴����� 3.�޴����� 4.�޴���ȸ 0.����");
					m1=sc1.nextInt();
				}
				System.out.println("�����մϴ�.");
				conn.close();
		     
		  
		
		    				
	
		}catch (ClassNotFoundException e) {
			System.out.println("jdbc driver �ε� ����");
		} catch (SQLException e) {
			System.out.println("����Ŭ ���� ����");
		}
		}

	}
	
