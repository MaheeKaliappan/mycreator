package mycreator.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mycreator.model.Department;

public class AdminDAO {
	static Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	private void getConnection() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mycreator?characterEncoding=latin1&useConfigs=maxPerformance", "root",
				"root");
	}

	public void addDepartmentDetails(Department department) throws SQLException, ClassNotFoundException {
		getConnection();

		String sqlQuery = "INSERT INTO DEPARTMENT (NAME,ADDED_ON,ADDED_BY) VALUES(?,?,?)";
		preparedStatement = connection.prepareStatement(sqlQuery);
		preparedStatement.setString(1, department.getDepartmentName());
		preparedStatement.setString(2, department.getDepartmentAddedOn());
		preparedStatement.setInt(3, department.getDepartmentAddedBy());
		

		preparedStatement.executeUpdate();
		
	}

}
