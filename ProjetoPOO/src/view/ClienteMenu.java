package view;
import controller.ControllerMenuCliente;

public class ClienteMenu extends javax.swing.JFrame {

    private final ControllerMenuCliente controller;
    
    public ClienteMenu() {
        initComponents();
        controller = new ControllerMenuCliente(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Debitobt = new javax.swing.JToggleButton();
        Depositobt = new javax.swing.JToggleButton();
        Saldobt = new javax.swing.JToggleButton();
        Extratobt1 = new javax.swing.JToggleButton();
        Sairbt = new javax.swing.JToggleButton();
        Logolb = new javax.swing.JLabel();
        Bemvindolb = new javax.swing.JLabel();
        Perguntalb = new javax.swing.JLabel();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Debitobt.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Debitobt.setForeground(new java.awt.Color(0, 0, 204));
        Debitobt.setText("Débito");
        Debitobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitobtActionPerformed(evt);
            }
        });

        Depositobt.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Depositobt.setForeground(new java.awt.Color(0, 0, 204));
        Depositobt.setText("Depósito");
        Depositobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositobtActionPerformed(evt);
            }
        });

        Saldobt.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Saldobt.setForeground(new java.awt.Color(0, 0, 204));
        Saldobt.setText("Saldo");
        Saldobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldobtActionPerformed(evt);
            }
        });

        Extratobt1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Extratobt1.setForeground(new java.awt.Color(0, 0, 204));
        Extratobt1.setText("Extrato");
        Extratobt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Extratobt1ActionPerformed(evt);
            }
        });

        Sairbt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sairbt.setForeground(new java.awt.Color(153, 0, 0));
        Sairbt.setText("Sair");
        Sairbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairbtActionPerformed(evt);
            }
        });

        Logolb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Logolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logolb.setText("LOGO");
        Logolb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Bemvindolb.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Bemvindolb.setForeground(new java.awt.Color(0, 0, 153));
        Bemvindolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bemvindolb.setText("Bem Vindo!");

        Perguntalb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Perguntalb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Perguntalb.setText("O que faremos hoje?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Sairbt)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
            .addComponent(Bemvindolb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Debitobt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Saldobt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Depositobt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Extratobt1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Perguntalb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Bemvindolb)
                .addGap(61, 61, 61)
                .addComponent(Perguntalb)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Depositobt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Debitobt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Saldobt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Extratobt1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sairbt)
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

    private void DebitobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebitobtActionPerformed
        controller.mostraDebitoCliente();
    }//GEN-LAST:event_DebitobtActionPerformed

    private void DepositobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositobtActionPerformed
        controller.mostraDepositoCliente();
    }//GEN-LAST:event_DepositobtActionPerformed

    private void SaldobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldobtActionPerformed
        controller.mostraSaldoCliente();
    }//GEN-LAST:event_SaldobtActionPerformed

    private void Extratobt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Extratobt1ActionPerformed
        controller.mostraExtratoCliente();
    }//GEN-LAST:event_Extratobt1ActionPerformed

    private void SairbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_SairbtActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bemvindolb;
    private javax.swing.JToggleButton Debitobt;
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JToggleButton Depositobt;
    private javax.swing.JToggleButton Extratobt1;
    private javax.swing.JLabel Logolb;
    private javax.swing.JLabel Perguntalb;
    private javax.swing.JToggleButton Sairbt;
    private javax.swing.JToggleButton Saldobt;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
