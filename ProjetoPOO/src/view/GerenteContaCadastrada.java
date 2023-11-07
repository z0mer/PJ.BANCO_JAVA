package view;

public class GerenteContaCadastrada extends javax.swing.JFrame {

    public GerenteContaCadastrada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_titulo_contas_cadastradas = new javax.swing.JLabel();
        lb_cpf_contas_cadastradas = new javax.swing.JLabel();
        tf_cpf_contas_cadastradas = new javax.swing.JTextField();
        lb_valor_contas_cadastradas = new javax.swing.JLabel();
        tf_valor_contas_cadastradas = new javax.swing.JTextField();
        lb_tipo_conta_contas_cadastradas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Voltarbt = new javax.swing.JToggleButton();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_titulo_contas_cadastradas.setBackground(new java.awt.Color(255, 255, 255));
        lb_titulo_contas_cadastradas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lb_titulo_contas_cadastradas.setForeground(new java.awt.Color(0, 204, 204));
        lb_titulo_contas_cadastradas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo_contas_cadastradas.setText("Conta(s) Cadastrada(s)");
        lb_titulo_contas_cadastradas.setToolTipText("");
        lb_titulo_contas_cadastradas.setBorder(new javax.swing.border.MatteBorder(null));

        lb_cpf_contas_cadastradas.setBackground(new java.awt.Color(255, 255, 255));
        lb_cpf_contas_cadastradas.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_cpf_contas_cadastradas.setForeground(new java.awt.Color(0, 204, 204));
        lb_cpf_contas_cadastradas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cpf_contas_cadastradas.setText("CPF:");

        tf_cpf_contas_cadastradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cpf_contas_cadastradasActionPerformed(evt);
            }
        });

        lb_valor_contas_cadastradas.setBackground(new java.awt.Color(255, 255, 255));
        lb_valor_contas_cadastradas.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_valor_contas_cadastradas.setForeground(new java.awt.Color(0, 204, 204));
        lb_valor_contas_cadastradas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valor_contas_cadastradas.setText("VALOR:");

        tf_valor_contas_cadastradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_valor_contas_cadastradasActionPerformed(evt);
            }
        });

        lb_tipo_conta_contas_cadastradas.setBackground(new java.awt.Color(255, 255, 255));
        lb_tipo_conta_contas_cadastradas.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lb_tipo_conta_contas_cadastradas.setForeground(new java.awt.Color(0, 204, 204));
        lb_tipo_conta_contas_cadastradas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_tipo_conta_contas_cadastradas.setText("CONTAS CRIADAS:");

        Voltarbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Voltarbt.setForeground(new java.awt.Color(153, 0, 0));
        Voltarbt.setText("Voltar");
        Voltarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo_contas_cadastradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_tipo_conta_contas_cadastradas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_cpf_contas_cadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_valor_contas_cadastradas))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_valor_contas_cadastradas)
                            .addComponent(tf_cpf_contas_cadastradas, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lb_titulo_contas_cadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cpf_contas_cadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cpf_contas_cadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_valor_contas_cadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_valor_contas_cadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_tipo_conta_contas_cadastradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Voltarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void tf_cpf_contas_cadastradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cpf_contas_cadastradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cpf_contas_cadastradasActionPerformed

    private void tf_valor_contas_cadastradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_valor_contas_cadastradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_valor_contas_cadastradasActionPerformed

    private void VoltarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltarbtActionPerformed

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
            java.util.logging.Logger.getLogger(GerenteContaCadastrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteContaCadastrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteContaCadastrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteContaCadastrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteContaCadastrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JToggleButton Voltarbt;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_cpf_contas_cadastradas;
    private javax.swing.JLabel lb_tipo_conta_contas_cadastradas;
    private javax.swing.JLabel lb_titulo_contas_cadastradas;
    private javax.swing.JLabel lb_valor_contas_cadastradas;
    private javax.swing.JTextField tf_cpf_contas_cadastradas;
    private javax.swing.JTextField tf_valor_contas_cadastradas;
    // End of variables declaration//GEN-END:variables
}
