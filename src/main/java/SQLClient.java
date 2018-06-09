//import java.sql.*;
//import java.util.ArrayList;
//
//
//public class SQLClient extends TestFrame{
//
//    private static Statement statement;
//    private static Connection connection;
//
//    private static final String DB_URL = "jdbc:sqlserver://192.168.2.198:62785;database=Shop";
//    /**For MySql
//     /   private static final String DB_URL = "jdbc:mysql://localhost:3306/DB_CASE?verifyServerCertificate=false&useSSL=false&requireSSL=false&useLegacyDatetimeCode=false&amp&serverTimezone=UTC";*/
//    private static final String USER_NAME = "admin";
//    private static final String USER_PASS = "admin";
//    private static String result;
//    static ResultSet resultSet;
//    static String selectTableSQL = "SELECT * from Product";
//
//
///** For MSSQL*/
//     static void connect(){
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            Connection connection = DriverManager.getConnection(DB_URL, USER_NAME, USER_PASS);
//            statement = connection.createStatement();
//            System.out.println("Соединение установлено!");
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println("Соединение с БД не установлено!");
//        }
//
//        /**For MySQL*/
//        /**        try {
//         //            Class.forName("com.mysql.cj.jdbc.Driver");
//         //            Connection connection = DriverManager.getConnection(DB_URL, USER_NAME, USER_PASS);
//         //            statement = connection.createStatement();
//         //            System.out.println("Соединение установлено!");
//         //        } catch (ClassNotFoundException | SQLException e) {
//         //            System.out.println("Соединение с БД не установлено!");
//         */        }
//
//     static void disconnect() {
//         try {
//             connection.close();
//         } catch (SQLException e) {
//             throw new RuntimeException(e);
//         }
//     }
//
//     static ArrayList sqlRequest() {
//         connect();
//
//
////                 try {
//         ArrayList<MyBean> beans = new ArrayList<MyBean>();
////                     ArrayList<Object> beans = new ArrayList<>();
////                     String stroka;
////                     resultSet = statement.executeQuery(selectTableSQL);
////                     while (resultSet.next()) {
////                         stroka = resultSet.getString("ID");
////                        beans.add(stroka);
////return beans;
//         for (int i = 0; i < 20; i++) {
//             beans.add(new MyBean("" + i, "TYPE" + i));
//         }
//         System.out.println(beans);
////                     }
////                 } catch (SQLException e) {
////                 throw new RuntimeException(e);
////             }
////return null;
////         }
//         return beans;
//     }
//}