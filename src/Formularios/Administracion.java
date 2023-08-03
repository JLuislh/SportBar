/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author jluis
 */
public class Administracion extends javax.swing.JFrame {

    /**
     * Creates new form Administracion
     */
    public Administracion() {
        initComponents();
        setLocationRelativeTo(null);
        String texto1 = "<html><center><body>MODIFICAR<br>PROMOCIONES</body></center></html>";
        T1.setText(texto1);
        String texto2 = "<html><center><body>INVENTARIO<br>DE<br>PRODUCTOS</body></center></html>";
        T2.setText(texto2);
        String texto3 = "<html><center><body>REPORTE<br>DE<br>VENTAS</body></center></html>";
        T3.setText(texto3);
        String texto4 = "<html><center><body>TOTAL<br>EN<br>CAJA POR DIA</body></center></html>";
        T4.setText(texto4);
    }
    
     private void CambiarBodes(){
         P1.setBorder(BorderFactory.createEmptyBorder());
         P2.setBorder(BorderFactory.createEmptyBorder());
         P3.setBorder(BorderFactory.createEmptyBorder());
         P4.setBorder(BorderFactory.createEmptyBorder());
         //P5.setBorder(BorderFactory.createEmptyBorder());
         P6.setBorder(BorderFactory.createEmptyBorder());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        P1 = new Clases.PanelRound();
        T1 = new javax.swing.JLabel();
        P2 = new Clases.PanelRound();
        T2 = new javax.swing.JLabel();
        P3 = new Clases.PanelRound();
        T3 = new javax.swing.JLabel();
        P4 = new Clases.PanelRound();
        T4 = new javax.swing.JLabel();
        P6 = new Clases.PanelRound();
        T6 = new javax.swing.JLabel();
        Admin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 700));
        jPanel1.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        P1.setBackground(new java.awt.Color(204, 255, 102));
        P1.setRoundTopLeft(20);
        P1.setRoundTopRight(20);

        T1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        T1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1.setText("Promociones");
        T1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                T1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        P2.setBackground(new java.awt.Color(255, 204, 153));
        P2.setRoundTopLeft(20);
        P2.setRoundTopRight(20);

        T2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        T2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2.setText("INVENTARIO");
        T2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        P3.setBackground(new java.awt.Color(204, 204, 204));
        P3.setRoundTopLeft(20);
        P3.setRoundTopRight(20);

        T3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        T3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3.setText("VENTAS");
        T3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        P4.setBackground(new java.awt.Color(102, 204, 255));
        P4.setRoundTopLeft(20);
        P4.setRoundTopRight(20);

        T4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        T4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4.setText("TOTAL CAJA");
        T4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        P6.setBackground(new java.awt.Color(255, 51, 51));
        P6.setRoundTopLeft(20);
        P6.setRoundTopRight(20);

        T6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        T6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T6.setText("VOLVER A INICIO");
        T6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T6, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T6, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Admin.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin);
        Admin.setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MouseClicked
        AdEditarPromociones op1 = new AdEditarPromociones();
        op1.setSize(1025, 635);
        op1.setLocation(0, 0);
        Admin.removeAll();
        Admin.add(op1,BorderLayout.CENTER);
        Admin.revalidate();
        Admin.repaint();
        CambiarBodes();
        P1.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, Color.red));

    }//GEN-LAST:event_T1MouseClicked

    private void T2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T2MouseClicked
        AdProductosInventario op2 = new AdProductosInventario();
        op2.setSize(1025, 635);
        op2.setLocation(0, 0);
        Admin.removeAll();
        Admin.add(op2,BorderLayout.CENTER);
        Admin.revalidate();
        Admin.repaint();
        CambiarBodes();
        P2.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, Color.red));
    }//GEN-LAST:event_T2MouseClicked

    private void T3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T3MouseClicked
        AdVentasPorDia op3 = new AdVentasPorDia();
        op3.setSize(1025, 635);
        op3.setLocation(0, 0);
        Admin.removeAll();
        Admin.add(op3,BorderLayout.CENTER);
        Admin.revalidate();
        Admin.repaint();
        CambiarBodes();
        P3.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, Color.red));
    }//GEN-LAST:event_T3MouseClicked

    private void T4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T4MouseClicked
        AdTotalEnCaja op4 = new AdTotalEnCaja();
        op4.setSize(1025, 635);
        op4.setLocation(0, 0);
        Admin.removeAll();
        Admin.add(op4,BorderLayout.CENTER);
        Admin.revalidate();
        Admin.repaint();
        CambiarBodes();
        P4.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, Color.red));
    }//GEN-LAST:event_T4MouseClicked

    private void T6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T6MouseClicked
           NuevaORDEN F = new NuevaORDEN();
           F.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_T6MouseClicked

    private void T1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_T1MouseEntered

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
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin;
    private Clases.PanelRound P1;
    private Clases.PanelRound P2;
    private Clases.PanelRound P3;
    private Clases.PanelRound P4;
    private Clases.PanelRound P6;
    private javax.swing.JLabel T1;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel T3;
    private javax.swing.JLabel T4;
    private javax.swing.JLabel T6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}