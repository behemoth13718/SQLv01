//public class TableProducts {
//    String ID;
//    String TYPE;
//
//    public TableProducts(String ID, String TYPE) {
//        this.setTYPE(TYPE);
//        this.setID(ID);
//    }
//
//    public String getID() {
//        return ID;
//    }
//
//    public String getTYPE() {
//        return TYPE;
//    }
//
//    private void setID(String ID) {
//        this.ID = ID;
//    }
//
//    private void setTYPE(String TYPE) {
//        this.TYPE =TYPE;
//    }
//
//    public Class<?> getColumnClass(int columnIndex) {
//        return String.class;
//    }
//
//    public int getColumnCount() {
//        return 2;
//    }
//
//    public String getColumnName(int columnIndex) {
//        switch (columnIndex) {
//            case 0:
//                return "ID";
//            case 1:
//                return "TYPE";
//        }
//        return "";
//    }
//
//    public int getRowCount() {
//        return beans.size();
//    }
//
//    public Object getValueAt(int rowIndex, int columnIndex) {
//        TableProducts bean = beans.get(rowIndex);
//
//        switch (columnIndex) {
//            case 0:
//                return bean.getName();
//            case 1:
//                return bean.getSize();
//            case 2:
//                return bean.getDescription();
//        }
//
//        return "";
//    }
//
//    public boolean isCellEditable(int rowIndex, int columnIndex) {
//        return false;
//    }
//}
