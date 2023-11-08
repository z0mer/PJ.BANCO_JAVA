package view;
import controller.ControllerMenuGerente;

public class GerenteMenu extends javax.swing.JFrame {

    private final ControllerMenuGerente controller;
    
    public GerenteMenu() {
        initComponents();
        controller = new ControllerMenuGerente(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_NomeBanco = new javax.swing.JLabel();
        Perguntalb = new javax.swing.JLabel();
        Logolb = new javax.swing.JLabel();
        Voltarbt = new javax.swing.JToggleButton();
        CadastrarC_bt = new javax.swing.JToggleButton();
        Excluir_bt = new javax.swing.JToggleButton();
        CriarConta_bt = new javax.swing.JToggleButton();
        ExibirSaldoConta_bt = new javax.swing.JToggleButton();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_NomeBanco.setBackground(new java.awt.Color(255, 255, 255));
        lb_NomeBanco.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lb_NomeBanco.setForeground(new java.awt.Color(0, 204, 204));
        lb_NomeBanco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_NomeBanco.setText("Banco");
        lb_NomeBanco.setBorder(new javax.swing.border.MatteBorder(null));

        Perguntalb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Perguntalb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Perguntalb.setText("O que faremos hoje?");

        Logolb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Logolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logolb.setText("LOGO");
        Logolb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Voltarbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Voltarbt.setForeground(new java.awt.Color(153, 0, 0));
        Voltarbt.setText("Voltar");
        Voltarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarbtActionPerformed(evt);
            }
        });

        CadastrarC_bt.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        CadastrarC_bt.setForeground(new java.awt.Color(0, 204, 204));
        CadastrarC_bt.setText("Cadastrar C.");
        CadastrarC_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarC_btActionPerformed(evt);
            }
        });

        Excluir_bt.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Excluir_bt.setForeground(new java.awt.Color(0, 204, 204));
        Excluir_bt.setText("Excluir");
        Excluir_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir_btActionPerformed(evt);
            }
        });

        CriarConta_bt.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        CriarConta_bt.setForeground(new java.awt.Color(0, 204, 204));
        CriarConta_bt.setText("Criar Conta");
        CriarConta_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarConta_btActionPerformed(evt);
            }
        });

        ExibirSaldoConta_bt.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        ExibirSaldoConta_bt.setForeground(new java.awt.Color(0, 204, 204));
        ExibirSaldoConta_bt.setText("Exibir S. e C.");
        ExibirSaldoConta_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExibirSaldoConta_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_NomeBanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Perguntalb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CadastrarC_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CriarConta_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExibirSaldoConta_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Excluir_bt, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Voltarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_NomeBanco)
                .addGap(29, 29, 29)
                .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Perguntalb)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarC_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CriarConta_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExibirSaldoConta_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Voltarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltarbtActionPerformed

    private void CadastrarC_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarC_btActionPerformed
        controller.mostraCadastro();
    }//GEN-LAST:event_CadastrarC_btActionPerformed

    private void Excluir_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir_btActionPerformed
        controller.mostraExcluir();
    }//GEN-LAST:event_Excluir_btActionPerformed

    private void CriarConta_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarConta_btActionPerformed
        controller.mostraCriar();
    }//GEN-LAST:event_CriarConta_btActionPerformed

    private void ExibirSaldoConta_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExibirSaldoConta_btActionPerformed
        controller.mostraExibir();
    }//GEN-LAST:event_ExibirSaldoConta_btActionPerformed

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
            java.util.logging.Logger.getLogger(GerenteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CadastrarC_bt;
    private javax.swing.JToggleButton CriarConta_bt;
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JToggleButton Excluir_bt;
    private javax.swing.JToggleButton ExibirSaldoConta_bt;
    private javax.swing.JLabel Logolb;
    private javax.swing.JLabel Perguntalb;
    private javax.swing.JToggleButton Voltarbt;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_NomeBanco;
    // End of variables declaration//GEN-END:variables
}
