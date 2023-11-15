package view;

public class GerenteExcluirConta extends javax.swing.JFrame {

    public GerenteExcluirConta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_titulo_exclua = new javax.swing.JLabel();
        tf_cpf_cliente = new javax.swing.JTextField();
        lb_cpf_exclua = new javax.swing.JLabel();
        lb_tipo_conta_apagar = new javax.swing.JLabel();
        rb_salario_exclua = new javax.swing.JRadioButton();
        rb_poupanca_exclua = new javax.swing.JRadioButton();
        rb_corrente_exclua = new javax.swing.JRadioButton();
        Cancelarbt = new javax.swing.JButton();
        bt_apagartodas = new javax.swing.JToggleButton();
        bt_apagar = new javax.swing.JButton();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_titulo_exclua.setBackground(new java.awt.Color(255, 255, 255));
        lb_titulo_exclua.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lb_titulo_exclua.setForeground(new java.awt.Color(0, 204, 204));
        lb_titulo_exclua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo_exclua.setText("EXCLUIR CONTA");
        lb_titulo_exclua.setToolTipText("");
        lb_titulo_exclua.setBorder(new javax.swing.border.MatteBorder(null));

        tf_cpf_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cpf_clienteActionPerformed(evt);
            }
        });

        lb_cpf_exclua.setBackground(new java.awt.Color(255, 255, 255));
        lb_cpf_exclua.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_cpf_exclua.setForeground(new java.awt.Color(0, 204, 204));
        lb_cpf_exclua.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cpf_exclua.setText("CPF:");

        lb_tipo_conta_apagar.setBackground(new java.awt.Color(255, 255, 255));
        lb_tipo_conta_apagar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_tipo_conta_apagar.setForeground(new java.awt.Color(0, 204, 204));
        lb_tipo_conta_apagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tipo_conta_apagar.setText("QUAL CONTA VOCÊ DESEJA APAGAR?");

        rb_salario_exclua.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        rb_salario_exclua.setText("Salário");
        rb_salario_exclua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_salario_excluaActionPerformed(evt);
            }
        });

        rb_poupanca_exclua.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        rb_poupanca_exclua.setText("Poupança");
        rb_poupanca_exclua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_poupanca_excluaActionPerformed(evt);
            }
        });

        rb_corrente_exclua.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        rb_corrente_exclua.setText("Corrente");
        rb_corrente_exclua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_corrente_excluaActionPerformed(evt);
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

        bt_apagartodas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_apagartodas.setForeground(new java.awt.Color(204, 102, 0));
        bt_apagartodas.setText("Apagar Todas");
        bt_apagartodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_apagartodasActionPerformed(evt);
            }
        });

        bt_apagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_apagar.setForeground(new java.awt.Color(0, 102, 51));
        bt_apagar.setText("Apagar");
        bt_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_apagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(bt_apagartodas)
                            .addGap(144, 144, 144))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(rb_salario_exclua)
                            .addGap(53, 53, 53)
                            .addComponent(rb_poupanca_exclua)
                            .addGap(53, 53, 53)
                            .addComponent(rb_corrente_exclua)
                            .addGap(45, 45, 45)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cancelarbt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_apagar)
                        .addGap(61, 61, 61))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_titulo_exclua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_tipo_conta_apagar, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lb_cpf_exclua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_titulo_exclua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cpf_exclua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lb_tipo_conta_apagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_salario_exclua)
                    .addComponent(rb_poupanca_exclua)
                    .addComponent(rb_corrente_exclua))
                .addGap(25, 25, 25)
                .addComponent(bt_apagartodas)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelarbt)
                    .addComponent(bt_apagar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Decoracaob.setBackground(new java.awt.Color(0, 204, 204));
        Decoracaob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Decoracaob.setForeground(new java.awt.Color(0, 204, 204));
        Decoracaob.setToolTipText("");
        Decoracaob.add(jMenu2);

        setJMenuBar(Decoracaob);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_cpf_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cpf_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cpf_clienteActionPerformed

    private void rb_salario_excluaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_salario_excluaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_salario_excluaActionPerformed

    private void rb_poupanca_excluaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_poupanca_excluaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_poupanca_excluaActionPerformed

    private void rb_corrente_excluaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_corrente_excluaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_corrente_excluaActionPerformed

    private void CancelarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarbtActionPerformed

    private void bt_apagartodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_apagartodasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_apagartodasActionPerformed

    private void bt_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_apagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_apagarActionPerformed

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
            java.util.logging.Logger.getLogger(GerenteExcluirConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteExcluirConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteExcluirConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteExcluirConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteExcluirConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelarbt;
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JButton bt_apagar;
    private javax.swing.JToggleButton bt_apagartodas;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cpf_exclua;
    private javax.swing.JLabel lb_tipo_conta_apagar;
    private javax.swing.JLabel lb_titulo_exclua;
    private javax.swing.JRadioButton rb_corrente_exclua;
    private javax.swing.JRadioButton rb_poupanca_exclua;
    private javax.swing.JRadioButton rb_salario_exclua;
    private javax.swing.JTextField tf_cpf_cliente;
    // End of variables declaration//GEN-END:variables
}
