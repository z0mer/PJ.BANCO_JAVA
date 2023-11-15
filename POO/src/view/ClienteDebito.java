package view;
public class ClienteDebito extends javax.swing.JFrame {

    public ClienteDebito() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Debitolb = new javax.swing.JLabel();
        Logolb = new javax.swing.JLabel();
        CPFlb = new javax.swing.JLabel();
        CPFtxt = new javax.swing.JTextField();
        Senhalb = new javax.swing.JLabel();
        Valorlb = new javax.swing.JLabel();
        Valortxt = new javax.swing.JTextField();
        Tpcontalb = new javax.swing.JLabel();
        Salariorb = new javax.swing.JRadioButton();
        Poupancarb = new javax.swing.JRadioButton();
        Correnterb = new javax.swing.JRadioButton();
        Cancelarbt = new javax.swing.JButton();
        Concluirbt = new javax.swing.JButton();
        Senhapss = new javax.swing.JPasswordField();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Debitolb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Debitolb.setForeground(new java.awt.Color(0, 0, 153));
        Debitolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Debitolb.setText("Débito em Conta");

        Logolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logolb.setText("LOGO");
        Logolb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CPFlb.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        CPFlb.setForeground(new java.awt.Color(0, 0, 204));
        CPFlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CPFlb.setText("CPF:");

        Senhalb.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Senhalb.setForeground(new java.awt.Color(0, 0, 204));
        Senhalb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senhalb.setText("SENHA:");

        Valorlb.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Valorlb.setForeground(new java.awt.Color(0, 0, 204));
        Valorlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Valorlb.setText("VALOR:");

        Tpcontalb.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Tpcontalb.setForeground(new java.awt.Color(0, 0, 204));
        Tpcontalb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tpcontalb.setText("TIPO DE CONTA:");

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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Valorlb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Tpcontalb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Valortxt)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Debitolb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                            .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(CPFlb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Senhalb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CPFtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addComponent(Senhapss))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cancelarbt)
                            .addComponent(Salariorb))
                        .addGap(18, 18, 18)
                        .addComponent(Poupancarb)
                        .addGap(18, 18, 18)
                        .addComponent(Correnterb)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Concluirbt)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Debitolb, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CPFtxt)
                    .addComponent(CPFlb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Senhalb, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Senhapss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Valortxt)
                    .addComponent(Valorlb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Tpcontalb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salariorb)
                    .addComponent(Poupancarb)
                    .addComponent(Correnterb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelarbt)
                    .addComponent(Concluirbt))
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
            java.util.logging.Logger.getLogger(ClienteDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteDebito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPFlb;
    private javax.swing.JTextField CPFtxt;
    private javax.swing.JButton Cancelarbt;
    private javax.swing.JButton Concluirbt;
    private javax.swing.JRadioButton Correnterb;
    private javax.swing.JLabel Debitolb;
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JLabel Logolb;
    private javax.swing.JRadioButton Poupancarb;
    private javax.swing.JRadioButton Salariorb;
    private javax.swing.JLabel Senhalb;
    private javax.swing.JPasswordField Senhapss;
    private javax.swing.JLabel Tpcontalb;
    private javax.swing.JLabel Valorlb;
    private javax.swing.JTextField Valortxt;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
