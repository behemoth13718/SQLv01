//import javax.swing.*;
//import javax.swing.event.TableModelListener;
//import javax.swing.table.TableModel;
//import java.awt.*;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class TestFrame extends JFrame {
//
//    static int i = 0;
//
//    public TestFrame() {
//
//        super("Тестовое окно");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
////        ArrayList<MyBean> beans = new ArrayList<MyBean>();
////
////        for (int i = 0; i < 20; i++) {
////            beans.add(new MyBean("Имя " + i, "Размер " + i, "Описание " + i));
////        }
//
//        TableModel model = new MyTableModel(SQLClient.sqlRequest());
//        JTable table = new JTable(model);
//
//        getContentPane().add(new JScrollPane(table));
//
//        setPreferredSize(new Dimension(660, 520));
//        pack();
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                JFrame.setDefaultLookAndFeelDecorated(true);
//                new TestFrame();
//            }
//        });
//    }
//
//    public class MyTableModel implements TableModel {
//
//        private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
//
//        private List<MyBean> beans;
//
//        public MyTableModel(List<MyBean> beans) {
//            this.beans = beans;
//        }
//
//        public void addTableModelListener(TableModelListener listener) {
//            listeners.add(listener);
//        }
//
//        public Class<?> getColumnClass(int columnIndex) {
//            return String.class;
//        }
//
//        public int getColumnCount() {
//            return 2;
//        }
//
//        public String getColumnName(int columnIndex) {
//            switch (columnIndex) {
//                case 0:
//                    return "Имя";
//                case 1:
//                    return "Размер";
//            }
//            return "";
//        }
//
//        public int getRowCount() {
//            return beans.size();
//        }
//
//        public Object getValueAt(int rowIndex, int columnIndex) {
//            MyBean bean = beans.get(rowIndex);
//            switch (columnIndex) {
//                case 0:
//                    return bean.getID();
//                case 1:
//                    return bean.getTYPE();
//            }
//            return "";
//        }
//
//        public boolean isCellEditable(int rowIndex, int columnIndex) {
//            return false;
//        }
//
//        public void removeTableModelListener(TableModelListener listener) {
//            listeners.remove(listener);
//        }
//
//        public void setValueAt(Object value, int rowIndex, int columnIndex) {
//
//        }
//
//    }
//
//    public static class MyBean {
//
//        private String ID;
//        private String TYPE;
////
//        public MyBean(String ID, String TYPE) {
//            this.setID(ID);
//            this.setTYPE(TYPE);
//            }
//
//        public void setID(String ID) {
//            this.ID = ID;
//        }
//
//        public String getID() {
//            return ID;
//        }
//
//        public void setTYPE(String size) {
//            this.TYPE = TYPE;
//        }
//
//        public String getTYPE() {
//            return TYPE;
//        }
//
//    }
//}