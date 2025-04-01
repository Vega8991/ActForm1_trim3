package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/pelis";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexion exitosa con MySql :)");
	}catch(SQLException e) {
		System.err.println("No se ha podido hacer la conexion :,( " + e.getMessage());
		}
	}
}