package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

    public static void main(String[] args) throws Exception {
        //加载MySql驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        创建数据库连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/my_db", "root", "12315");

        //3.操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM EMP WHERE SAL >= 3000");

        while (rs.next()) {
            int empno = rs.getInt("EMPNO");
            String name = rs.getString("ENAME");
            System.out.println("姓名是:" + name + " " + "编号是:" + empno);
        }

    }

}
