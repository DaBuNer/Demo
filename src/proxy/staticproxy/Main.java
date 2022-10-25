package proxy.staticproxy;

import proxy.dynamicproxy.Car;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "12315");
        Statement statement = conn.createStatement();
//        ResultSet resultSet = statement.executeQuery("SELECT ENAME, SAL FROM EMP");
        PreparedStatement preparedStatement = conn.prepareStatement("UPDATE A SET NAME = ? WHERE NAME = ?");
//        preparedStatement.setString(2, "A");
//        preparedStatement.setString(1, "C");
//        System.out.println(preparedStatement.executeUpdate());
//        System.out.println(preparedStatement.executeUpdate());
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString("ENAME"));
//        }
        System.out.println(Math.max(1, 2));
    }
}
