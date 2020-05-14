package mikir;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class History extends javax.swing.JFrame {

    public History() {
        initComponents();
    }
    
    public void AddToTable(Object[] dataRow){
        DefaultTableModel model =  (DefaultTableModel)Tabel.getModel();
        model.addRow(dataRow);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HitoryPanel = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        lbHistory = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HitoryPanel.setBackground(new java.awt.Color(255, 255, 255));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gatra\\Downloads\\icons8-back-arrow-50.png")); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        lbHistory.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lbHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHistory.setText("History Parkir");

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Antrean", "Jenis Kendaraan", "No. Polisi", "Jam Masuk", "Jam Keluar"
            }
        ));
        Tabel.setFocusable(false);
        Tabel.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Tabel.setRowHeight(25);
        Tabel.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Tabel.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabel);
        if (Tabel.getColumnModel().getColumnCount() > 0) {
            Tabel.getColumnModel().getColumn(0).setPreferredWidth(30);
            Tabel.getColumnModel().getColumn(2).setPreferredWidth(30);
            Tabel.getColumnModel().getColumn(3).setPreferredWidth(30);
            Tabel.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        javax.swing.GroupLayout HitoryPanelLayout = new javax.swing.GroupLayout(HitoryPanel);
        HitoryPanel.setLayout(HitoryPanelLayout);
        HitoryPanelLayout.setHorizontalGroup(
            HitoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HitoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HitoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HitoryPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HitoryPanelLayout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
        );
        HitoryPanelLayout.setVerticalGroup(
            HitoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HitoryPanelLayout.createSequentialGroup()
                .addGroup(HitoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HitoryPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbHistory))
                    .addGroup(HitoryPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HitoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HitoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HitoryPanel;
    private javax.swing.JTable Tabel;
    private javax.swing.JLabel back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHistory;
    // End of variables declaration//GEN-END:variables
}
