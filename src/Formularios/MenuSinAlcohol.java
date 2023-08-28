/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Clases.BDConexionSP;
import Clases.BDIngresos;
import Clases.InsertarProducto;
import java.awt.Color;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jluis
 */
public class MenuSinAlcohol extends javax.swing.JPanel {
     int id_pedido = 0;
     int id_producto = 0;
     int id_producto_pedido = 0;
     int existe = 0;
    /**
     * Creates new form MenuBotellas
     */
    public MenuSinAlcohol(int a) {
        initComponents();
        TextosLabel();
        this.id_pedido=a;
    }
    
     Timer timer = new Timer(300, new ActionListener()
    {
    public void actionPerformed(ActionEvent e)
    { 
       
       Color Original = new Color(102,204,255);
       P1.setBackground(Original);
       P2.setBackground(Original);
       P3.setBackground(Original);
       P4.setBackground(Original);
       P5.setBackground(Original);
       P6.setBackground(Original);
       P7.setBackground(Original);
       P8.setBackground(Original);
       P9.setBackground(Original);
       P10.setBackground(Original);
       P11.setBackground(Original);
       P12.setBackground(Original);
       
       
     }
    });
     
     private void InsertarProductoPedido() {
       
        try {
            InsertarProducto p1 = new InsertarProducto();
            p1.setId_pedido(id_pedido);
            p1.setId_producto(id_producto);
            BDIngresos.InsertarProducto_PedidoBotellas(p1);
            id_producto_pedido = p1.getIdregreso();
            //JOptionPane.showMessageDialog(null, "Producto Agregado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA= "+e);
        }
         INICIO.ListarProductosPedidos();
         existe = 0;
    }
     
     private void UpdateCantidad() {
        try {
                 BDConexionSP conecta = new BDConexionSP();
                 Connection con = conecta.getConexion();
                 PreparedStatement smtp = null;
                 PreparedStatement sm = null;
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD+1, TOTAL = CANTIDAD*(SELECT PRECIO FROM productos WHERE CODIGO = "+id_producto+") WHERE NOORDEN = "+id_pedido+" AND CODIGO = "+id_producto);
                 sm = con.prepareStatement("{call DescargaPorUnidad("+id_producto+",1)}");
                 smtp.executeUpdate();
                 sm.executeUpdate();
                 con.close();
                 smtp.close();
                 sm.close();
               // JOptionPane.showMessageDialog(null, "Guardado...");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex);
            }
        
        INICIO.ListarProductosPedidos();
        existe = 0;
    }
     
     public  void BuscarExistencia() {
            try {
                BDConexionSP conecta = new BDConexionSP();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT cantidad as EXISTE FROM ventas  WHERE NOORDEN =  "+id_pedido+" AND CODIGO ="+id_producto );
                while (rs.next()) {
                    existe = rs.getInt(1);
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
            
        }
     
     private void UpdateCantidadMenos() {
        try {
                 BDConexionSP conecta = new BDConexionSP();
                 Connection con = conecta.getConexion();
                 PreparedStatement smtp = null;
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD-1,Total = TOTAL-(SELECT PRECIO FROM productos WHERE CODIGO = "+id_producto+") WHERE NOORDEN = "+id_pedido+" AND CODIGO = "+id_producto);
                 smtp.executeUpdate();
                 con.close();
                 smtp.close();
               // JOptionPane.showMessageDialog(null, "Guardado...");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex);
            }
        
        INICIO.ListarProductosPedidos();
        existe = 0;
    }
     
    private void eliminarProducto(){
        try {
            BDConexionSP conecta = new BDConexionSP();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps= con.prepareStatement("delete from Ventas where noorden="+id_pedido+" and codigo = "+id_producto);
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROr = "+ex);
        }
        INICIO.ListarProductosPedidos();
        existe = 0;
 }
     
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        P1 = new Clases.PanelRound();
        T1 = new javax.swing.JLabel();
        P2 = new Clases.PanelRound();
        T2 = new javax.swing.JLabel();
        P3 = new Clases.PanelRound();
        T3 = new javax.swing.JLabel();
        P4 = new Clases.PanelRound();
        T4 = new javax.swing.JLabel();
        P5 = new Clases.PanelRound();
        T5 = new javax.swing.JLabel();
        P6 = new Clases.PanelRound();
        T6 = new javax.swing.JLabel();
        P7 = new Clases.PanelRound();
        T7 = new javax.swing.JLabel();
        P8 = new Clases.PanelRound();
        T8 = new javax.swing.JLabel();
        P9 = new Clases.PanelRound();
        T9 = new javax.swing.JLabel();
        P10 = new Clases.PanelRound();
        T10 = new javax.swing.JLabel();
        P11 = new Clases.PanelRound();
        T11 = new javax.swing.JLabel();
        P12 = new Clases.PanelRound();
        T21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 102));
        setPreferredSize(new java.awt.Dimension(1025, 400));

        jLabel1.setText("jLabel1");

        P1.setBackground(new java.awt.Color(102, 204, 255));
        P1.setPreferredSize(new java.awt.Dimension(150, 60));
        P1.setRoundBottomLeft(20);
        P1.setRoundBottomRight(20);
        P1.setRoundTopLeft(20);
        P1.setRoundTopRight(20);

        T1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1.setText("mirinda");
        T1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        P2.setBackground(new java.awt.Color(102, 204, 255));
        P2.setPreferredSize(new java.awt.Dimension(150, 60));
        P2.setRoundBottomLeft(20);
        P2.setRoundBottomRight(20);
        P2.setRoundTopLeft(20);
        P2.setRoundTopRight(20);

        T2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2.setText("seven");
        T2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        P3.setBackground(new java.awt.Color(102, 204, 255));
        P3.setPreferredSize(new java.awt.Dimension(150, 60));
        P3.setRoundBottomLeft(20);
        P3.setRoundBottomRight(20);
        P3.setRoundTopLeft(20);
        P3.setRoundTopRight(20);

        T3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3.setText("pepsi");
        T3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        P4.setBackground(new java.awt.Color(102, 204, 255));
        P4.setPreferredSize(new java.awt.Dimension(150, 60));
        P4.setRoundBottomLeft(20);
        P4.setRoundBottomRight(20);
        P4.setRoundTopLeft(20);
        P4.setRoundTopRight(20);

        T4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4.setText("montan");
        T4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T4, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        P5.setBackground(new java.awt.Color(102, 204, 255));
        P5.setPreferredSize(new java.awt.Dimension(150, 60));
        P5.setRoundBottomLeft(20);
        P5.setRoundBottomRight(20);
        P5.setRoundTopLeft(20);
        P5.setRoundTopRight(20);

        T5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T5.setText("salutaris");
        T5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T5, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        P6.setBackground(new java.awt.Color(102, 204, 255));
        P6.setPreferredSize(new java.awt.Dimension(150, 60));
        P6.setRoundBottomLeft(20);
        P6.setRoundBottomRight(20);
        P6.setRoundTopLeft(20);
        P6.setRoundTopRight(20);

        T6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T6.setText("naranjada");
        T6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T6, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(T6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        P7.setBackground(new java.awt.Color(102, 204, 255));
        P7.setPreferredSize(new java.awt.Dimension(150, 60));
        P7.setRoundBottomLeft(20);
        P7.setRoundBottomRight(20);
        P7.setRoundTopLeft(20);
        P7.setRoundTopRight(20);

        T7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T7.setText("limonada");
        T7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P7Layout = new javax.swing.GroupLayout(P7);
        P7.setLayout(P7Layout);
        P7Layout.setHorizontalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T7, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        P7Layout.setVerticalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        P8.setBackground(new java.awt.Color(102, 204, 255));
        P8.setPreferredSize(new java.awt.Dimension(150, 60));
        P8.setRoundBottomLeft(20);
        P8.setRoundBottomRight(20);
        P8.setRoundTopLeft(20);
        P8.setRoundTopRight(20);

        T8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T8.setText("te frio");
        T8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P8Layout = new javax.swing.GroupLayout(P8);
        P8.setLayout(P8Layout);
        P8Layout.setHorizontalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T8, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P8Layout.setVerticalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        P9.setBackground(new java.awt.Color(102, 204, 255));
        P9.setPreferredSize(new java.awt.Dimension(150, 60));
        P9.setRoundBottomLeft(20);
        P9.setRoundBottomRight(20);
        P9.setRoundTopLeft(20);
        P9.setRoundTopRight(20);

        T9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T9.setText("grapete");
        T9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P9Layout = new javax.swing.GroupLayout(P9);
        P9.setLayout(P9Layout);
        P9Layout.setHorizontalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(T9, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );
        P9Layout.setVerticalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        P10.setBackground(new java.awt.Color(102, 204, 255));
        P10.setPreferredSize(new java.awt.Dimension(150, 60));
        P10.setRoundBottomLeft(20);
        P10.setRoundBottomRight(20);
        P10.setRoundTopLeft(20);
        P10.setRoundTopRight(20);

        T10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T10.setText("naranjada con soda");
        T10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P10Layout = new javax.swing.GroupLayout(P10);
        P10.setLayout(P10Layout);
        P10Layout.setHorizontalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T10, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        P10Layout.setVerticalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        P11.setBackground(new java.awt.Color(102, 204, 255));
        P11.setPreferredSize(new java.awt.Dimension(150, 60));
        P11.setRoundBottomLeft(20);
        P11.setRoundBottomRight(20);
        P11.setRoundTopLeft(20);
        P11.setRoundTopRight(20);

        T11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T11.setText("limonada con soda");
        T11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P11Layout = new javax.swing.GroupLayout(P11);
        P11.setLayout(P11Layout);
        P11Layout.setHorizontalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T11, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        P11Layout.setVerticalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        P12.setBackground(new java.awt.Color(102, 204, 255));
        P12.setPreferredSize(new java.awt.Dimension(150, 60));
        P12.setRoundBottomLeft(20);
        P12.setRoundBottomRight(20);
        P12.setRoundTopLeft(20);
        P12.setRoundTopRight(20);

        T21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T21.setText("JUGO PREPARADO");
        T21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T21MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P12Layout = new javax.swing.GroupLayout(P12);
        P12.setLayout(P12Layout);
        P12Layout.setHorizontalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T21, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        P12Layout.setVerticalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T21, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 982, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void T1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MousePressed
       if ((evt.getModifiers() & 4) !=0){
            id_producto = 173;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(null, "Aun no tienes agregado este producto");}
            P1.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            id_producto = 173;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P1.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T1MousePressed

    private void T2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T2MousePressed
        
       if ((evt.getModifiers() & 4) !=0){
            id_producto = 174;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(null, "Aun no tienes agregado este producto");}
            P2.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            id_producto = 174;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P2.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T2MousePressed
    private void T3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T3MousePressed
      if ((evt.getModifiers() & 4) !=0){
            id_producto = 175;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(null, "Aun no tienes agregado este producto");}
            P3.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            id_producto = 175;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P3.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T3MousePressed

    private void T5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T5MousePressed
       if ((evt.getModifiers() & 4) !=0){
            id_producto = 177;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(null, "Aun no tienes agregado este producto");}
            P5.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            id_producto = 177;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P5.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T5MousePressed

    private void T6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T6MousePressed

        if ((evt.getModifiers() & 4) !=0){
            id_producto = 199;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P6.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            id_producto = 199;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P6.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_T6MousePressed

    private void T7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T7MousePressed
            
        if ((evt.getModifiers() & 4) !=0){  //XL
            id_producto = 200;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P7.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
          id_producto = 200;
           BuscarExistencia();
           if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P7.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_T7MousePressed

    private void T9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T9MousePressed
            
        if ((evt.getModifiers() & 4) !=0){ //zacapa
            id_producto = 176;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P9.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
           id_producto = 176;
           BuscarExistencia();
           if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P9.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_T9MousePressed

    private void T10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T10MousePressed
            
        if ((evt.getModifiers() & 4) !=0){ // jose Cuervo
           id_producto = 201;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P10.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
           id_producto = 201;
           BuscarExistencia();
           if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P10.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_T10MousePressed

    private void T11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T11MousePressed
              
        if ((evt.getModifiers() & 4) !=0){ // Vodka Smir
           id_producto = 202; 
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
           P11.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            id_producto = 202;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P11.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_T11MousePressed

    private void T4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T4MousePressed
 if ((evt.getModifiers() & 4) !=0){
            id_producto = 178;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(null, "Aun no tienes agregado este producto");}
            P4.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            id_producto = 178;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P4.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T4MousePressed

    private void T8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T8MousePressed

        if ((evt.getModifiers() & 4) !=0){   // ron añejo
            id_producto = 203;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P8.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            id_producto = 203;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P8.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T8MousePressed

    private void T21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T21MousePressed
        if ((evt.getModifiers() & 4) !=0){
            id_producto = 209;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(null, "Aun no tienes agregado este producto");}
            P12.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            id_producto = 209;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P12.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T21MousePressed
     
     public void TextosLabel(){
         
         
         String texto1 = "<html><center><body>MIRINDA<br><font color='RED'>Q10.00</body></center></html>";
        T1.setText(texto1);
        String texto2 = "<html><center><body>SEVEN UP<br><font color='RED'>Q10.00</body></center></html>";
        T2.setText(texto2); 
        String texto3 = "<html><center><body>PEPSI<br><font color='RED'>Q10.00</body></center></html>";
        T3.setText(texto3);
        String texto4 = "<html><center><body>MOUNTAIN DEW<br><font color='RED'>Q10.00</body></center></html>";
        T4.setText(texto4);     
        String texto5 = "<html><center><body>SALUTARIS<br><font color='RED'>Q10.00</body></center></html>";
        T5.setText(texto5); 
        String texto6 = "<html><center><body>NARANJADA<br><font color='RED'>Q700.00</font></body></center></html>";
        T6.setText(texto6);    
        String texto7 = "<html><center><body>LIMONDA<br><font color='RED'>Q200.00</font></body></center></html>";
        T7.setText(texto7);
        String texto8 = "<html><center><body>TE FRIO<br><font color='RED'>Q550.00</font></body></center></html>";
        T8.setText(texto8);
        String texto9 = "<html><center><body>GRAPETE<br><font color='RED'>Q10.00</body></center></html>";
        T9.setText(texto9); 
        String texto10 = "<html><center><body>NARANJADA CON<br>SODA<br><font color='RED'>Q400.00</body></center></html>";
        T10.setText(texto10);
    String texto11 = "<html><center><body>LIMONADA CON<br>SODA<br><font color='RED'>Q400.00</body></center></html>";
        T11.setText(texto11);  
        String texto21 = "<html><center><body>JUGO PREPARADO<br><font color='RED'>Q25.00</body></center></html>";
        T21.setText(texto21);
  
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.PanelRound P1;
    private Clases.PanelRound P10;
    private Clases.PanelRound P11;
    private Clases.PanelRound P12;
    private Clases.PanelRound P2;
    private Clases.PanelRound P3;
    private Clases.PanelRound P4;
    private Clases.PanelRound P5;
    private Clases.PanelRound P6;
    private Clases.PanelRound P7;
    private Clases.PanelRound P8;
    private Clases.PanelRound P9;
    private javax.swing.JLabel T1;
    private javax.swing.JLabel T10;
    private javax.swing.JLabel T11;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel T21;
    private javax.swing.JLabel T3;
    private javax.swing.JLabel T4;
    private javax.swing.JLabel T5;
    private javax.swing.JLabel T6;
    private javax.swing.JLabel T7;
    private javax.swing.JLabel T8;
    private javax.swing.JLabel T9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
