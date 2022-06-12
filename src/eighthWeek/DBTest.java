package eighthWeek;

import java.sql.*;
import java.util.*;

//jdbc
public class DBTest {

	public static void main(String[] args) {

		// server: localhost
		// database: postgres
		// post: 5432
		// username: postgres
		// password: 123456

		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "123456";

		List<Student> students = new ArrayList<>();

		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;

		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("成功链接至数据库");

			statement = connection.createStatement();
			String sql = "SELECT english.id, name, english, score FROM student RIGHT OUTER JOIN english on student.id = english.id;";
			result = statement.executeQuery(sql);
			System.out.println("SQL执行成功");

			while (result.next()) {
				students.add(new Student(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4)));
			}

			students.stream().filter(e -> e.englishScore < 60).forEach(System.out::println);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
					System.out.println("数据库链接关闭	");
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

class Student {

	public int id;
	public String name;
	public int englishScore;
	public int mathScore;

	public Student(int id, String name, int englishScore, int mathScore) {
		this.id = id;
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	@Override
	public String toString() {
		return "Student [englishScore=" + englishScore + ", id=" + id + ", mathScore=" + mathScore + ", name=" + name
				+ "]";
	}
}
