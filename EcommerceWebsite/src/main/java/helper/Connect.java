package helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
public static Connection con=null;
public static Connection getConnection() {
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BasicDB","dbuser","Squ@d123");
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return con;
}
}
