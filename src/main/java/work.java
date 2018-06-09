//public class work {
//
//    public TableFromDatabase(Connection connection) {
//
//        Vector columnNames = new Vector();
//        Vector data = new Vector();
//
//        try {
//            //  прочитаем всё из таблицы
//            String sql = "Select * from TST_TAB";
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            ResultSetMetaData md = rs.getMetaData();
//            int columns = md.getColumnCount();
//
//            //  получим имена колонок
//            for (int i = 1; i <= columns; i++) {
//                columnNames.addElement(md.getColumnName(i));
//            }
//
//            //  считаем ряды
//            while (rs.next()) {
//                Vector row = new Vector(columns);
//                for (int i = 1; i <= columns; i++) {
//                    row.addElement(rs.getObject(i));
//                }
//                data.addElement(row);
//            }
//            rs.close();
//            stmt.close();
//            connection.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        //  создадим таблицу с данными из БД
//        JTable table = new JTable(data, columnNames) {
//            public Class getColumnClass(int column) {
//                for (int row = 0; row < getRowCount(); row++) {
//                    Object o = getValueAt(row, column);
//                    if (o != null) {
//                        return o.getClass();
//                    }
//                }
//                return Object.class;
//            }
//        };
//
//        JScrollPane scrollPane = new JScrollPane(table);
//        getContentPane().add(scrollPane);
//        JPanel buttonPanel = new JPanel();
//        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
//    }
//
//}
//
//    public static void main(String[] args) throws Exception {
//        Connection con = prepareData();
//        TableFromDatabase frame = new TableFromDatabase(con);
//        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//     подготовим таблицу и данные для отображения и вернём соединение с базой
//    static Connection prepareData() throws Exception {
//        JDBCExamples jDBCExamples = new JDBCExamples();
//        Class h2Class = loadDriver("org.h2.Driver");
//        Connection connH2 = getConnection("jdbc:h2:mem:", createPropsShort("~tst", "luser", "pass"));
//        String createTable = "create table IF NOT EXISTS TST_TAB (ID INT, NAME VARCHAR(50), ADDRESS VARCHAR(100));";
//        Statement stH2 = connH2.createStatement();
//        stH2.execute(createTable);
//        List<String> insert = new ArrayList<String>() {
//            {
//                for (int i = 0; i <= 30; i++) {
//                    add("insert into TST_TAB (id, name, address) values (" + i + ", 'name" + i + "', 'street" + i + "');");
//                }
//            }
////        };
////        for (String sql : insert) {
////            stH2.execute(sql);
////        }
////        return connH2;
////    }
////}
