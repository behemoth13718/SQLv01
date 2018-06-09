import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class SqlGUI extends JFrame  implements ActionListener {

    private static final int POS_X = 350;
    private static final int POS_Y = 200;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;



    private final JPanel panelTop = new JPanel(new GridLayout(1, 2));
    private final JButton btnRequest = new JButton("Выборка из таблицы 'Продукты'");
    private final JButton btnConnect = new JButton("Подключиться к БД");
    public static final JTextArea log = new JTextArea();



public void tableProduct (){
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://192.168.2.198:62785;database=Shop";                //your data
        String user = "admin";                  //your data
        String password = "admin";               //your data
        String query = "select * from Product";  //your data
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        DatabaseTableModel model = new DatabaseTableModel();
        model.setDataSource(rs);
        JTable table = new JTable(model);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        JFrame frame = new JFrame("Database Request");
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 400);
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}

    protected SqlGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        btnRequest.addActionListener(this);
        btnConnect.addActionListener(this);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("SQL");
        setAlwaysOnTop(true);
        log.setLineWrap(true);
        log.setEditable(false);
        JScrollPane scrollLog = new JScrollPane(log);
        panelTop.add(btnRequest);
        panelTop.add(btnConnect);
        add(panelTop, BorderLayout.NORTH);
        add(scrollLog, BorderLayout.CENTER);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == btnRequest)
           tableProduct();// log.append("");
        else if(src == btnConnect)
            log.append("2");//SQLClient.connect();
        else
            System.out.println("Не удалось выполнить запрос");
    }
}

