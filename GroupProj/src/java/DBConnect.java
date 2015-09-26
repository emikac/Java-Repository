import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    volatile static Connection con;
	
	public static Connection getInstance() {
		if (con == null) {
			synchronized(DBConnect.class) {
				if (con == null) {
                                    try {
                                        String host = "jdbc:mysql://localhost:3306/MercedesCustomers";
                                        String uName = "root";
                                        String uPass = "root";
					con = DriverManager.getConnection(host, uName, uPass);
                                    } catch (SQLException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                        }
                }
	
		return con;
        }
}

