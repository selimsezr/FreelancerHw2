package Task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	public Connection connect() {
		String url = "jdbc:sqlite:C://Users/selim/eclipse-workspace/HomeworkFreelance/src/main/java/task1/Employees.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("Database connect succesfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
