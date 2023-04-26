import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Form extends javax.swing.JFrame {
   
    String url = "YOUR DATABASE URL";
    String username = "YOUR USERNAME";
    String password = "YOUR PASSWORD";
    
    Connection connect;
    Statement state;
    
public Form() {
    initComponents();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

@SuppressWarnings("unchecked")
public Statement getConnection(){
    try{
            Class.forName("YOUR JDBC DRIVER ADDRESS");
            connect = DriverManager.getConnection(url, username, password);
            state = connect.createStatement();
            return state;
    }catch(Exception ex){
        System.out.println(ex.getMessage());
        return null;
    }  
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insert_panel = new javax.swing.JPanel();
        insert_title = new javax.swing.JLabel();
        firstname_label = new javax.swing.JLabel();
        familyname_label = new javax.swing.JLabel();
        nationalID_label = new javax.swing.JLabel();
        birth_label = new javax.swing.JLabel();
        cancel_insert_btn = new javax.swing.JButton();
        insert_btn = new javax.swing.JButton();
        lastname_txtfield = new javax.swing.JTextField();
        nationalID_txtfield = new javax.swing.JTextField();
        birth_txtfield = new javax.swing.JTextField();
        firstname_txtfield = new javax.swing.JTextField();
        update_panel = new javax.swing.JPanel();
        update_title = new javax.swing.JLabel();
        id_label_upd = new javax.swing.JLabel();
        firstname_label_upd = new javax.swing.JLabel();
        lastname_label_upd = new javax.swing.JLabel();
        nationalID_label_upd = new javax.swing.JLabel();
        birth_label_upd = new javax.swing.JLabel();
        upd_id_txtfield = new javax.swing.JTextField();
        upd_firstname_txtfield = new javax.swing.JTextField();
        upd_lastname_txtfield = new javax.swing.JTextField();
        upd_nationalID_txtfield = new javax.swing.JTextField();
        upd_birth_txtfield = new javax.swing.JTextField();
        cancel_upd_btn = new javax.swing.JButton();
        upd_btn = new javax.swing.JButton();
        delete_panel = new javax.swing.JPanel();
        delete_title = new javax.swing.JLabel();
        id_label_delete = new javax.swing.JLabel();
        delete_id_txtfield = new javax.swing.JTextField();
        cancel_delete_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        table_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        info_table = new javax.swing.JTable();
        showinfo_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insert_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        insert_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insert_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insert_title.setText("Insert");

        firstname_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstname_label.setText("Firstname:");

        familyname_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        familyname_label.setText("Lastname:");

        nationalID_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nationalID_label.setText("NationalID:");

        birth_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        birth_label.setText("BirthYear:");

        cancel_insert_btn.setText("Cancel");
        cancel_insert_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_insert_btnActionPerformed(evt);
            }
        });

        insert_btn.setText("Insert");
        insert_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btnActionPerformed(evt);
            }
        });

        lastname_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname_txtfieldActionPerformed(evt);
            }
        });

        nationalID_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalID_txtfieldActionPerformed(evt);
            }
        });

        firstname_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname_txtfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insert_panelLayout = new javax.swing.GroupLayout(insert_panel);
        insert_panel.setLayout(insert_panelLayout);
        insert_panelLayout.setHorizontalGroup(
            insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_panelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(insert_title, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert_panelLayout.createSequentialGroup()
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(insert_panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(insert_panelLayout.createSequentialGroup()
                                .addComponent(firstname_label)
                                .addGap(26, 26, 26)
                                .addComponent(lastname_txtfield, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                            .addGroup(insert_panelLayout.createSequentialGroup()
                                .addComponent(familyname_label)
                                .addGap(27, 27, 27)
                                .addComponent(nationalID_txtfield))
                            .addGroup(insert_panelLayout.createSequentialGroup()
                                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nationalID_label)
                                    .addComponent(birth_label))
                                .addGap(20, 20, 20)
                                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birth_txtfield)
                                    .addComponent(firstname_txtfield)))))
                    .addGroup(insert_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insert_btn)
                        .addGap(18, 18, 18)
                        .addComponent(cancel_insert_btn)))
                .addGap(60, 60, 60))
        );
        insert_panelLayout.setVerticalGroup(
            insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(insert_title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname_label)
                    .addComponent(lastname_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationalID_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalID_label)
                    .addComponent(birth_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birth_label)
                    .addComponent(firstname_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_insert_btn)
                    .addComponent(insert_btn))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        update_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        update_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_title.setText("Update");

        id_label_upd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        id_label_upd.setText("ID:");

        firstname_label_upd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstname_label_upd.setText("Firstname:");

        lastname_label_upd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lastname_label_upd.setText("Lastname:");

        nationalID_label_upd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nationalID_label_upd.setText("NationalID:");

        birth_label_upd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        birth_label_upd.setText("BirthYear:");

        upd_id_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_id_txtfieldActionPerformed(evt);
            }
        });

        upd_firstname_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_firstname_txtfieldActionPerformed(evt);
            }
        });

        upd_lastname_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_lastname_txtfieldActionPerformed(evt);
            }
        });

        upd_nationalID_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_nationalID_txtfieldActionPerformed(evt);
            }
        });

        cancel_upd_btn.setText("Cancel");
        cancel_upd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_upd_btnActionPerformed(evt);
            }
        });

        upd_btn.setText("Update");
        upd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout update_panelLayout = new javax.swing.GroupLayout(update_panel);
        update_panel.setLayout(update_panelLayout);
        update_panelLayout.setHorizontalGroup(
            update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_panelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_panelLayout.createSequentialGroup()
                        .addComponent(update_title, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_panelLayout.createSequentialGroup()
                        .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(update_panelLayout.createSequentialGroup()
                                .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(update_panelLayout.createSequentialGroup()
                                            .addComponent(id_label_upd)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_panelLayout.createSequentialGroup()
                                                .addComponent(lastname_label_upd)
                                                .addGap(17, 17, 17))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_panelLayout.createSequentialGroup()
                                                .addComponent(firstname_label_upd)
                                                .addGap(18, 18, 18))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_panelLayout.createSequentialGroup()
                                        .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(birth_label_upd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nationalID_label_upd, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)))
                                .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(upd_firstname_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(upd_id_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(upd_lastname_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(upd_nationalID_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(upd_birth_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(update_panelLayout.createSequentialGroup()
                                .addComponent(upd_btn)
                                .addGap(46, 46, 46)
                                .addComponent(cancel_upd_btn)))
                        .addGap(53, 53, 53))))
        );
        update_panelLayout.setVerticalGroup(
            update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(update_title)
                .addGap(18, 18, 18)
                .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_label_upd)
                    .addComponent(upd_id_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname_label_upd)
                    .addComponent(upd_firstname_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upd_lastname_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname_label_upd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalID_label_upd)
                    .addComponent(upd_nationalID_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birth_label_upd)
                    .addComponent(upd_birth_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(update_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_upd_btn)
                    .addComponent(upd_btn))
                .addGap(20, 20, 20))
        );

        delete_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        delete_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_title.setText("Delete");

        id_label_delete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        id_label_delete.setText("ID:");

        cancel_delete_btn.setText("Cancel");
        cancel_delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_delete_btnActionPerformed(evt);
            }
        });

        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delete_panelLayout = new javax.swing.GroupLayout(delete_panel);
        delete_panel.setLayout(delete_panelLayout);
        delete_panelLayout.setHorizontalGroup(
            delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(id_label_delete)
                .addGap(18, 18, 18)
                .addComponent(delete_id_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(delete_panelLayout.createSequentialGroup()
                .addGroup(delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delete_panelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(delete_title, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_panelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(delete_btn)
                        .addGap(18, 18, 18)
                        .addComponent(cancel_delete_btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        delete_panelLayout.setVerticalGroup(
            delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(delete_title)
                .addGap(18, 18, 18)
                .addGroup(delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_id_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_label_delete))
                .addGap(32, 32, 32)
                .addGroup(delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_delete_btn)
                    .addComponent(delete_btn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        table_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        info_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Firstname", "Lastname", "NationalID", "BirthYear"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(info_table);

        showinfo_btn.setText("Show Information");
        showinfo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showinfo_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_panelLayout = new javax.swing.GroupLayout(table_panel);
        table_panel.setLayout(table_panelLayout);
        table_panelLayout.setHorizontalGroup(
            table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(table_panelLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(showinfo_btn)
                .addContainerGap())
        );
        table_panelLayout.setVerticalGroup(
            table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showinfo_btn)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(table_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delete_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(insert_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insert_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(table_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void clearTable(){
    DefaultTableModel DTM = (DefaultTableModel) info_table.getModel();
    int rowCount = DTM.getRowCount();
        for(int i = rowCount - 1 ; i >= 0 ; i--){
            DTM.removeRow(i);
        }
    }

public void showDataOnTable(){
    try{

        Connection connect = DriverManager.getConnection(url,username, password);
        Statement state = connect.createStatement();

        String query = "select * from list";
        ResultSet result = state.executeQuery(query);

        clearTable();
            while(result.next()){
                String id = result.getString(1);
                String firstname = result.getString(2);
                String lastname = result.getString(3);
                String nationalID = result.getString(4);
                String birthYear = result.getString(5);
                Object[] content = {id, firstname, lastname, nationalID, birthYear};
                DefaultTableModel model = (DefaultTableModel) info_table.getModel();//?????????
                model.addRow(content);
            }
            
        state.close();
        connect.close();

    }catch(Exception ex){
        ex.getMessage();
    }
}
    private void lastname_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname_txtfieldActionPerformed

    }//GEN-LAST:event_lastname_txtfieldActionPerformed

    private void nationalID_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalID_txtfieldActionPerformed
        
    }//GEN-LAST:event_nationalID_txtfieldActionPerformed

    private void firstname_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname_txtfieldActionPerformed
       
    }//GEN-LAST:event_firstname_txtfieldActionPerformed

    private void cancel_insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_insert_btnActionPerformed
        firstname_txtfield.setText("");
        lastname_txtfield.setText("");
        nationalID_txtfield.setText("");
        birth_txtfield.setText("");
    }//GEN-LAST:event_cancel_insert_btnActionPerformed

    private void upd_id_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_id_txtfieldActionPerformed
        
    }//GEN-LAST:event_upd_id_txtfieldActionPerformed

    private void insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btnActionPerformed
        try {
            String query = "insert into list(ID, Firstname, Lastname, NationalID, BirthYear) values (null,'%s','%s','%s',%s)";
            query = String.format(query,
                                                                        firstname_txtfield.getText(),
                                                                        lastname_txtfield.getText(),   
                                                                        nationalID_txtfield.getText(),
                                                                        birth_txtfield.getText());
           getConnection().execute(query);
           connect.close();
         
           firstname_txtfield.setText("");
           lastname_txtfield.setText("");
           nationalID_txtfield.setText("");
           birth_txtfield.setText("");
           
           showDataOnTable();
          
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_insert_btnActionPerformed

    private void upd_lastname_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_lastname_txtfieldActionPerformed
        
    }//GEN-LAST:event_upd_lastname_txtfieldActionPerformed

    private void upd_firstname_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_firstname_txtfieldActionPerformed
        
    }//GEN-LAST:event_upd_firstname_txtfieldActionPerformed

    private void upd_nationalID_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_nationalID_txtfieldActionPerformed
        
    }//GEN-LAST:event_upd_nationalID_txtfieldActionPerformed

    private void upd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_btnActionPerformed
        try {
                String query = "update list set Firstname='%s', Lastname='%s',NationalID='%s',BirthYear=%s where ID=%s";
                query = String.format(query, upd_firstname_txtfield.getText(),
                                                                            upd_lastname_txtfield.getText(),   
                                                                            upd_nationalID_txtfield.getText(),
                                                                            upd_birth_txtfield.getText(),
                                                                            upd_id_txtfield.getText());
               getConnection().execute(query);
                state.close();
                connect.close();
                upd_id_txtfield.setText("");
                upd_firstname_txtfield.setText("");
                upd_lastname_txtfield.setText("");
                upd_nationalID_txtfield.setText("");
                upd_birth_txtfield.setText("");

                showDataOnTable();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
    }//GEN-LAST:event_upd_btnActionPerformed

    private void showinfo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showinfo_btnActionPerformed
        showDataOnTable();
    }//GEN-LAST:event_showinfo_btnActionPerformed

    private void cancel_upd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_upd_btnActionPerformed
        upd_id_txtfield.setText("");
        upd_firstname_txtfield.setText("");
        upd_lastname_txtfield.setText("");
        upd_nationalID_txtfield.setText("");
        upd_birth_txtfield.setText("");
    }//GEN-LAST:event_cancel_upd_btnActionPerformed

    private void cancel_delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_delete_btnActionPerformed
        delete_id_txtfield.setText("");
    }//GEN-LAST:event_cancel_delete_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        try {
                String query = "delete from list where ID=%s";
                query = String.format(query, delete_id_txtfield.getText());
                getConnection().execute(query);
                delete_id_txtfield.setText("");
                
                state.close();
               connect.close();
                
                showDataOnTable();
            
        } catch (SQLException ex) {
               System.out.println( ex.getMessage());
        }
        
    }//GEN-LAST:event_delete_btnActionPerformed
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birth_label;
    private javax.swing.JLabel birth_label_upd;
    private javax.swing.JTextField birth_txtfield;
    private javax.swing.JButton cancel_delete_btn;
    private javax.swing.JButton cancel_insert_btn;
    private javax.swing.JButton cancel_upd_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField delete_id_txtfield;
    private javax.swing.JPanel delete_panel;
    private javax.swing.JLabel delete_title;
    private javax.swing.JLabel familyname_label;
    private javax.swing.JLabel firstname_label;
    private javax.swing.JLabel firstname_label_upd;
    private javax.swing.JTextField firstname_txtfield;
    private javax.swing.JLabel id_label_delete;
    private javax.swing.JLabel id_label_upd;
    private javax.swing.JTable info_table;
    private javax.swing.JButton insert_btn;
    private javax.swing.JPanel insert_panel;
    private javax.swing.JLabel insert_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastname_label_upd;
    private javax.swing.JTextField lastname_txtfield;
    private javax.swing.JLabel nationalID_label;
    private javax.swing.JLabel nationalID_label_upd;
    private javax.swing.JTextField nationalID_txtfield;
    private javax.swing.JButton showinfo_btn;
    private javax.swing.JPanel table_panel;
    private javax.swing.JTextField upd_birth_txtfield;
    private javax.swing.JButton upd_btn;
    private javax.swing.JTextField upd_firstname_txtfield;
    private javax.swing.JTextField upd_id_txtfield;
    private javax.swing.JTextField upd_lastname_txtfield;
    private javax.swing.JTextField upd_nationalID_txtfield;
    private javax.swing.JPanel update_panel;
    private javax.swing.JLabel update_title;
    // End of variables declaration//GEN-END:variables
}
