package view;

public class ClienteSaldo extends javax.swing.JFrame {

    public ClienteSaldo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulolb = new javax.swing.JLabel();
        Logolb = new javax.swing.JLabel();
        Salariolb = new javax.swing.JLabel();
        Salariotxt = new javax.swing.JTextField();
        Correntelb = new javax.swing.JLabel();
        Correntetxt = new javax.swing.JTextField();
        Poupancalb = new javax.swing.JLabel();
        Poupancatxt = new javax.swing.JTextField();
        Cancelarbt = new javax.swing.JButton();
        Concluirbt = new javax.swing.JButton();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulolb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Titulolb.setForeground(new java.awt.Color(0, 0, 153));
        Titulolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulolb.setText("Saldo das Contas");

        Logolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logolb.setText("LOGO");
        Logolb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Salariolb.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Salariolb.setForeground(new java.awt.Color(0, 0, 204));
        Salariolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salariolb.setText("SALÁRIO:");

        Correntelb.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Correntelb.setForeground(new java.awt.Color(0, 0, 204));
        Correntelb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Correntelb.setText("CORRENTE:");

        Poupancalb.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Poupancalb.setForeground(new java.awt.Color(0, 0, 204));
        Poupancalb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Poupancalb.setText("POUPANÇA:");

        Cancelarbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cancelarbt.setForeground(new java.awt.Color(153, 0, 0));
        Cancelarbt.setText("Cancelar");
        Cancelarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarbtActionPerformed(evt);
            }
        });

        Concluirbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Concluirbt.setForeground(new java.awt.Color(0, 102, 51));
        Concluirbt.setText("Concluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Titulolb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Poupancalb, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(Salariolb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Correntelb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Salariotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(Correntetxt)
                                    .addComponent(Poupancatxt))))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Cancelarbt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Concluirbt)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Titulolb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Salariotxt)
                    .addComponent(Salariolb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Correntetxt)
                    .addComponent(Correntelb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Poupancatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Poupancalb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Concluirbt)
                    .addComponent(Cancelarbt))
                .addContainerGap())
        );

        Decoracaob.setBackground(new java.awt.Color(0, 0, 153));
        Decoracaob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Decoracaob.setForeground(new java.awt.Color(0, 0, 153));
        Decoracaob.setToolTipText("");
        Decoracaob.add(jMenu2);

        setJMenuBar(Decoracaob);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarbtActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteSaldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelarbt;
    private javax.swing.JButton Concluirbt;
    private javax.swing.JLabel Correntelb;
    private javax.swing.JTextField Correntetxt;
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JLabel Logolb;
    private javax.swing.JLabel Poupancalb;
    private javax.swing.JTextField Poupancatxt;
    private javax.swing.JLabel Salariolb;
    private javax.swing.JTextField Salariotxt;
    private javax.swing.JLabel Titulolb;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
