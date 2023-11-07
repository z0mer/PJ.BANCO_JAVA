package view;

public class ClienteDeposito extends javax.swing.JFrame {

    public ClienteDeposito() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulolb = new javax.swing.JLabel();
        Logolb = new javax.swing.JLabel();
        Valorlb = new javax.swing.JLabel();
        Valortxt = new javax.swing.JTextField();
        Senhalb = new javax.swing.JLabel();
        Salariorb = new javax.swing.JRadioButton();
        Poupancarb = new javax.swing.JRadioButton();
        Correnterb = new javax.swing.JRadioButton();
        Cancelarbt = new javax.swing.JButton();
        Concluirbt = new javax.swing.JButton();
        Senhapss = new javax.swing.JPasswordField();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulolb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Titulolb.setForeground(new java.awt.Color(0, 0, 153));
        Titulolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulolb.setText("Depósito");

        Logolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logolb.setText("LOGO");
        Logolb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Valorlb.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Valorlb.setForeground(new java.awt.Color(0, 0, 204));
        Valorlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Valorlb.setText("VALOR:");

        Senhalb.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Senhalb.setForeground(new java.awt.Color(0, 0, 204));
        Senhalb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senhalb.setText("SENHA:");

        Salariorb.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        Salariorb.setText("Salário");
        Salariorb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalariorbActionPerformed(evt);
            }
        });

        Poupancarb.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        Poupancarb.setText("Poupança");
        Poupancarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoupancarbActionPerformed(evt);
            }
        });

        Correnterb.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        Correnterb.setText("Corrente");
        Correnterb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrenterbActionPerformed(evt);
            }
        });

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

        Senhapss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhapssActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(Titulolb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(Salariorb)
                                .addGap(18, 18, 18)
                                .addComponent(Poupancarb)
                                .addGap(18, 18, 18)
                                .addComponent(Correnterb)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Senhalb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Valorlb, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Valortxt)
                                    .addComponent(Senhapss)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cancelarbt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Concluirbt)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Titulolb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Valortxt)
                    .addComponent(Valorlb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Senhalb, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Senhapss))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salariorb)
                    .addComponent(Poupancarb)
                    .addComponent(Correnterb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelarbt)
                    .addComponent(Concluirbt))
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

    private void SalariorbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalariorbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalariorbActionPerformed

    private void PoupancarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoupancarbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoupancarbActionPerformed

    private void CorrenterbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrenterbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorrenterbActionPerformed

    private void CancelarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarbtActionPerformed

    private void SenhapssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhapssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhapssActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelarbt;
    private javax.swing.JButton Concluirbt;
    private javax.swing.JRadioButton Correnterb;
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JLabel Logolb;
    private javax.swing.JRadioButton Poupancarb;
    private javax.swing.JRadioButton Salariorb;
    private javax.swing.JLabel Senhalb;
    private javax.swing.JPasswordField Senhapss;
    private javax.swing.JLabel Titulolb;
    private javax.swing.JLabel Valorlb;
    private javax.swing.JTextField Valortxt;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
