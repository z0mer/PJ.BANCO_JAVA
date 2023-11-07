package view;
import controller.ControllerTelaInicial;

public class TelaInicial extends javax.swing.JFrame {

    private final ControllerTelaInicial controller;
    
    public TelaInicial() {
        initComponents();
        controller = new ControllerTelaInicial(this);
              
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bancolb = new javax.swing.JLabel();
        Clientebt = new javax.swing.JButton();
        Gerentebt = new javax.swing.JButton();
        Logolb = new javax.swing.JLabel();
        Decoracaob = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bancolb.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Bancolb.setForeground(new java.awt.Color(0, 0, 153));
        Bancolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bancolb.setText("Banco");

        Clientebt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Clientebt.setForeground(new java.awt.Color(0, 0, 204));
        Clientebt.setText("Área do Cliente");
        Clientebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientebtActionPerformed(evt);
            }
        });

        Gerentebt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gerentebt.setForeground(new java.awt.Color(0, 204, 204));
        Gerentebt.setText("Área do Gerente");
        Gerentebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerentebtActionPerformed(evt);
            }
        });

        Logolb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Logolb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logolb.setText("LOGO");
        Logolb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bancolb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Gerentebt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clientebt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Bancolb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(Clientebt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Gerentebt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientebtActionPerformed
        controller.mostraTelaLoginCliente();
    }//GEN-LAST:event_ClientebtActionPerformed

    private void GerentebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerentebtActionPerformed
        controller.mostraTelaGerente();
    }//GEN-LAST:event_GerentebtActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bancolb;
    private javax.swing.JButton Clientebt;
    private javax.swing.JMenuBar Decoracaob;
    private javax.swing.JButton Gerentebt;
    private javax.swing.JLabel Logolb;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
