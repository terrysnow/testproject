package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testOracleConnect();  
	}

	/**
	 * 测试链接Oracle数据库
	 */
	public static void testOracleConnect() {
		String url = "jdbc:oracle:thin:@172.16.13.76:1521:ORCL";
        String driver = "oracle.jdbc.driver.OracleDriver";  
        try{  
            Class.forName(driver);  
        }catch(Exception e){  
            System.out.println("链接异常");  
        }  
          
	    try {  
	        Connection con = DriverManager.getConnection(url,"lbs_oracle","dc1234");  
	        if(!con.isClosed())  
	            System.out.println("Oracle success");  
	    } catch (Exception e) {  
	        // TODO Auto-generated catch block  
	        e.printStackTrace();  
	    }
	}
	/**
	 * 测试链接Mysql数据库
	 */
	public static void testMysqlConnect() {
//		String url = "jdbc:mysql://127.0.0.1:3306/jeecgmybatis?useUnicode=true&charaterEncoding=utf-8";
		String url = "jdbc:mysql://localhost:3306/jeecgmybatis?useUnicode=true&charaterEncoding=utf-8";
        String driver = "com.mysql.jdbc.Driver";  
        try{  
            Class.forName(driver);  
        }catch(Exception e){  
            System.out.println("链接异常");  
        }  
          
	    try {  
	        Connection con = DriverManager.getConnection(url,"root","terry");  
	        if(!con.isClosed())  
	            System.out.println("success");  
	    } catch (Exception e) {  
	        // TODO Auto-generated catch block  
	        e.printStackTrace();  
	    }
	}
}
