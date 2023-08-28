/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Clases.BDConexionSP;
import Clases.BDIngresos;
import Clases.InsertarProducto;
import clas.BDConexion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author jluis
 */
public class MenuTragos extends javax.swing.JPanel {

    int id_pedido = 0;
    int id_producto = 0;
    int id_producto_pedido = 0;
    int existe = 0;

    /**
     * Creates new form MenuTragos
     */
    public MenuTragos(int a) {
        initComponents();
        TextosLabel();
        this.id_pedido = a;
    }

    Timer timer = new Timer(300, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Color Original = new Color(204, 255, 204);
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
            P13.setBackground(Original);
            P14.setBackground(Original);
            P15.setBackground(Original);
            P16.setBackground(Original);
            P17.setBackground(Original);
            P18.setBackground(Original);
            P19.setBackground(Original);
            P20.setBackground(Original);
            P21.setBackground(Original);
            P22.setBackground(Original);
            P23.setBackground(Original);
            P24.setBackground(Original);
            P25.setBackground(Original);

        }
    });

    private void InsertarProductoPedido() {

        try {
            InsertarProducto p1 = new InsertarProducto();
            p1.setId_pedido(id_pedido);
            p1.setId_producto(id_producto);
            BDIngresos.InsertarProducto_Pedido(p1);
            id_producto_pedido = p1.getIdregreso();
            //JOptionPane.showMessageDialog(null, "Producto Agregado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA= " + e);
        }
        INICIO.ListarProductosPedidos();
        existe = 0;
    }

    private void UpdateCantidad() {
        try {
            BDConexionSP conecta = new BDConexionSP();
            Connection con = conecta.getConexion();
            PreparedStatement smtp = null;
            smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD+1, TOTAL = CANTIDAD*(SELECT PRECIO FROM productos WHERE CODIGO = " + id_producto + ") WHERE NOORDEN = " + id_pedido + " AND CODIGO = " + id_producto);
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

    public void BuscarExistencia() {
        try {
            BDConexionSP conecta = new BDConexionSP();
            Connection cn = conecta.getConexion();
            java.sql.Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT cantidad as EXISTE FROM ventas  WHERE NOORDEN =  " + id_pedido + " AND CODIGO =" + id_producto);
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
            smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD-1,Total = TOTAL-(SELECT PRECIO FROM productos WHERE CODIGO = " + id_producto + ") WHERE NOORDEN = " + id_pedido + " AND CODIGO = " + id_producto);
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

    private void eliminarProducto() {
        try {
            BDConexionSP conecta = new BDConexionSP();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps = con.prepareStatement("delete from Ventas where noorden=" + id_pedido + " and codigo = " + id_producto);
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROr = " + ex);
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
        T12 = new javax.swing.JLabel();
        P13 = new Clases.PanelRound();
        T13 = new javax.swing.JLabel();
        P14 = new Clases.PanelRound();
        T14 = new javax.swing.JLabel();
        P15 = new Clases.PanelRound();
        T15 = new javax.swing.JLabel();
        P16 = new Clases.PanelRound();
        T16 = new javax.swing.JLabel();
        P17 = new Clases.PanelRound();
        T17 = new javax.swing.JLabel();
        P18 = new Clases.PanelRound();
        T18 = new javax.swing.JLabel();
        P19 = new Clases.PanelRound();
        T19 = new javax.swing.JLabel();
        P20 = new Clases.PanelRound();
        T20 = new javax.swing.JLabel();
        P21 = new Clases.PanelRound();
        T21 = new javax.swing.JLabel();
        P22 = new Clases.PanelRound();
        T22 = new javax.swing.JLabel();
        P23 = new Clases.PanelRound();
        T23 = new javax.swing.JLabel();
        P24 = new Clases.PanelRound();
        T24 = new javax.swing.JLabel();
        P25 = new Clases.PanelRound();
        T25 = new javax.swing.JLabel();
        T26 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        P1.setBackground(new java.awt.Color(204, 255, 204));
        P1.setPreferredSize(new java.awt.Dimension(150, 70));
        P1.setRoundBottomLeft(20);
        P1.setRoundBottomRight(20);
        P1.setRoundTopLeft(20);
        P1.setRoundTopRight(20);

        T1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1.setText("vip");
        T1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P2.setBackground(new java.awt.Color(204, 255, 204));
        P2.setPreferredSize(new java.awt.Dimension(150, 70));
        P2.setRoundBottomLeft(20);
        P2.setRoundBottomRight(20);
        P2.setRoundTopLeft(20);
        P2.setRoundTopRight(20);

        T2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2.setText("cuba libre");
        T2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P3.setBackground(new java.awt.Color(204, 255, 204));
        P3.setPreferredSize(new java.awt.Dimension(150, 70));
        P3.setRoundBottomLeft(20);
        P3.setRoundBottomRight(20);
        P3.setRoundTopLeft(20);
        P3.setRoundTopRight(20);

        T3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T3.setText("tormenta negra");
        T3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P4.setBackground(new java.awt.Color(204, 255, 204));
        P4.setPreferredSize(new java.awt.Dimension(150, 70));
        P4.setRoundBottomLeft(20);
        P4.setRoundBottomRight(20);
        P4.setRoundTopLeft(20);
        P4.setRoundTopRight(20);

        T4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T4.setText("Quetzalteca Rocas");
        T4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P5.setBackground(new java.awt.Color(204, 255, 204));
        P5.setPreferredSize(new java.awt.Dimension(150, 70));
        P5.setRoundBottomLeft(20);
        P5.setRoundBottomRight(20);
        P5.setRoundTopLeft(20);
        P5.setRoundTopRight(20);

        T5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T5.setText("corona preparada");
        T5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P6.setBackground(new java.awt.Color(204, 255, 204));
        P6.setPreferredSize(new java.awt.Dimension(150, 70));
        P6.setRoundBottomLeft(20);
        P6.setRoundBottomRight(20);
        P6.setRoundTopLeft(20);
        P6.setRoundTopRight(20);

        T6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T6.setText("cuba");
        T6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P7.setBackground(new java.awt.Color(204, 255, 204));
        P7.setPreferredSize(new java.awt.Dimension(150, 70));
        P7.setRoundBottomLeft(20);
        P7.setRoundBottomRight(20);
        P7.setRoundTopLeft(20);
        P7.setRoundTopRight(20);

        T7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T7.setText("michelada de la casa");
        T7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P7Layout = new javax.swing.GroupLayout(P7);
        P7.setLayout(P7Layout);
        P7Layout.setHorizontalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P7Layout.setVerticalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P8.setBackground(new java.awt.Color(204, 255, 204));
        P8.setPreferredSize(new java.awt.Dimension(150, 70));
        P8.setRoundBottomLeft(20);
        P8.setRoundBottomRight(20);
        P8.setRoundTopLeft(20);
        P8.setRoundTopRight(20);

        T8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T8.setText("Quetzalteca Preparada");
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
            .addComponent(T8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P9.setBackground(new java.awt.Color(204, 255, 204));
        P9.setPreferredSize(new java.awt.Dimension(150, 70));
        P9.setRoundBottomLeft(20);
        P9.setRoundBottomRight(20);
        P9.setRoundTopLeft(20);
        P9.setRoundTopRight(20);

        T9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T9.setText("gin tonic");
        T9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P9Layout = new javax.swing.GroupLayout(P9);
        P9.setLayout(P9Layout);
        P9Layout.setHorizontalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P9Layout.setVerticalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T9, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P10.setBackground(new java.awt.Color(204, 255, 204));
        P10.setPreferredSize(new java.awt.Dimension(150, 70));
        P10.setRoundBottomLeft(20);
        P10.setRoundBottomRight(20);
        P10.setRoundTopLeft(20);
        P10.setRoundTopRight(20);

        T10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T10.setText("jagger bom");
        T10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P10Layout = new javax.swing.GroupLayout(P10);
        P10.setLayout(P10Layout);
        P10Layout.setHorizontalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P10Layout.setVerticalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T10, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P11.setBackground(new java.awt.Color(204, 255, 204));
        P11.setPreferredSize(new java.awt.Dimension(150, 70));
        P11.setRoundBottomLeft(20);
        P11.setRoundBottomRight(20);
        P11.setRoundTopLeft(20);
        P11.setRoundTopRight(20);

        T11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T11.setText("margarona");
        T11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P11Layout = new javax.swing.GroupLayout(P11);
        P11.setLayout(P11Layout);
        P11Layout.setHorizontalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P11Layout.setVerticalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P12.setBackground(new java.awt.Color(204, 255, 204));
        P12.setPreferredSize(new java.awt.Dimension(150, 70));
        P12.setRoundBottomLeft(20);
        P12.setRoundBottomRight(20);
        P12.setRoundTopLeft(20);
        P12.setRoundTopRight(20);

        T12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T12.setText("XL preparado");
        T12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P12Layout = new javax.swing.GroupLayout(P12);
        P12.setLayout(P12Layout);
        P12Layout.setHorizontalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P12Layout.setVerticalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P13.setBackground(new java.awt.Color(204, 255, 204));
        P13.setPreferredSize(new java.awt.Dimension(150, 70));
        P13.setRoundBottomLeft(20);
        P13.setRoundBottomRight(20);
        P13.setRoundTopLeft(20);
        P13.setRoundTopRight(20);

        T13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T13.setText("quita cruda");
        T13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T13MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P13Layout = new javax.swing.GroupLayout(P13);
        P13.setLayout(P13Layout);
        P13Layout.setHorizontalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T13, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P13Layout.setVerticalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T13, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P14.setBackground(new java.awt.Color(204, 255, 204));
        P14.setPreferredSize(new java.awt.Dimension(150, 70));
        P14.setRoundBottomLeft(20);
        P14.setRoundBottomRight(20);
        P14.setRoundTopLeft(20);
        P14.setRoundTopRight(20);

        T14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T14.setText("chelada");
        T14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T14MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P14Layout = new javax.swing.GroupLayout(P14);
        P14.setLayout(P14Layout);
        P14Layout.setHorizontalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T14, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P14Layout.setVerticalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T14, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P15.setBackground(new java.awt.Color(204, 255, 204));
        P15.setPreferredSize(new java.awt.Dimension(150, 70));
        P15.setRoundBottomLeft(20);
        P15.setRoundBottomRight(20);
        P15.setRoundTopLeft(20);
        P15.setRoundTopRight(20);

        T15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T15.setText("cimarrona");
        T15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P15Layout = new javax.swing.GroupLayout(P15);
        P15.setLayout(P15Layout);
        P15Layout.setHorizontalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P15Layout.setVerticalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T15, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P16.setBackground(new java.awt.Color(204, 255, 204));
        P16.setPreferredSize(new java.awt.Dimension(150, 70));
        P16.setRoundBottomLeft(20);
        P16.setRoundBottomRight(20);
        P16.setRoundTopLeft(20);
        P16.setRoundTopRight(20);

        T16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T16.setText("piconas");
        T16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T16MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P16Layout = new javax.swing.GroupLayout(P16);
        P16.setLayout(P16Layout);
        P16Layout.setHorizontalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P16Layout.setVerticalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T16, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P17.setBackground(new java.awt.Color(204, 255, 204));
        P17.setPreferredSize(new java.awt.Dimension(150, 70));
        P17.setRoundBottomLeft(20);
        P17.setRoundBottomRight(20);
        P17.setRoundTopLeft(20);
        P17.setRoundTopRight(20);

        T17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T17.setText("shot tequila");
        T17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T17MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P17Layout = new javax.swing.GroupLayout(P17);
        P17.setLayout(P17Layout);
        P17Layout.setHorizontalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T17, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P17Layout.setVerticalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T17, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P18.setBackground(new java.awt.Color(204, 255, 204));
        P18.setPreferredSize(new java.awt.Dimension(150, 70));
        P18.setRoundBottomLeft(20);
        P18.setRoundBottomRight(20);
        P18.setRoundTopLeft(20);
        P18.setRoundTopRight(20);

        T18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T18.setText("whiski las rocas");
        T18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T18MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P18Layout = new javax.swing.GroupLayout(P18);
        P18.setLayout(P18Layout);
        P18Layout.setHorizontalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T18, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P18Layout.setVerticalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T18, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P19.setBackground(new java.awt.Color(204, 255, 204));
        P19.setPreferredSize(new java.awt.Dimension(68, 43));
        P19.setRoundBottomLeft(20);
        P19.setRoundBottomRight(20);
        P19.setRoundTopLeft(20);
        P19.setRoundTopRight(20);

        T19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T19.setText("15 TE");
        T19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T19MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P19Layout = new javax.swing.GroupLayout(P19);
        P19.setLayout(P19Layout);
        P19Layout.setHorizontalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );
        P19Layout.setVerticalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T19, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        P20.setBackground(new java.awt.Color(204, 255, 204));
        P20.setPreferredSize(new java.awt.Dimension(68, 43));
        P20.setRoundBottomLeft(20);
        P20.setRoundBottomRight(20);
        P20.setRoundTopLeft(20);
        P20.setRoundTopRight(20);

        T20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T20.setText("6 TE");
        T20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T20MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P20Layout = new javax.swing.GroupLayout(P20);
        P20.setLayout(P20Layout);
        P20Layout.setHorizontalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T20, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );
        P20Layout.setVerticalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T20, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        P21.setBackground(new java.awt.Color(204, 255, 204));
        P21.setPreferredSize(new java.awt.Dimension(150, 70));
        P21.setRoundBottomLeft(20);
        P21.setRoundBottomRight(20);
        P21.setRoundTopLeft(20);
        P21.setRoundTopRight(20);

        T21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T21.setText("margarita");
        T21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T21MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P21Layout = new javax.swing.GroupLayout(P21);
        P21.setLayout(P21Layout);
        P21Layout.setHorizontalGroup(
            P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T21, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P21Layout.setVerticalGroup(
            P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T21, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P22.setBackground(new java.awt.Color(204, 255, 204));
        P22.setPreferredSize(new java.awt.Dimension(150, 70));
        P22.setRoundBottomLeft(20);
        P22.setRoundBottomRight(20);
        P22.setRoundTopLeft(20);
        P22.setRoundTopRight(20);

        T22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T22.setText("bacardi");
        T22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T22MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P22Layout = new javax.swing.GroupLayout(P22);
        P22.setLayout(P22Layout);
        P22Layout.setHorizontalGroup(
            P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T22, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P22Layout.setVerticalGroup(
            P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T22, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P23.setBackground(new java.awt.Color(204, 255, 204));
        P23.setPreferredSize(new java.awt.Dimension(150, 70));
        P23.setRoundBottomLeft(20);
        P23.setRoundBottomRight(20);
        P23.setRoundTopLeft(20);
        P23.setRoundTopRight(20);

        T23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T23.setText("mojito");
        T23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T23MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P23Layout = new javax.swing.GroupLayout(P23);
        P23.setLayout(P23Layout);
        P23Layout.setHorizontalGroup(
            P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T23, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P23Layout.setVerticalGroup(
            P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T23, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P24.setBackground(new java.awt.Color(204, 255, 204));
        P24.setPreferredSize(new java.awt.Dimension(150, 70));
        P24.setRoundBottomLeft(20);
        P24.setRoundBottomRight(20);
        P24.setRoundTopLeft(20);
        P24.setRoundTopRight(20);

        T24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T24.setText("piña colada");
        T24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T24MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P24Layout = new javax.swing.GroupLayout(P24);
        P24.setLayout(P24Layout);
        P24Layout.setHorizontalGroup(
            P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T24, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P24Layout.setVerticalGroup(
            P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T24, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        P25.setBackground(new java.awt.Color(204, 255, 204));
        P25.setPreferredSize(new java.awt.Dimension(150, 70));
        P25.setRoundBottomLeft(20);
        P25.setRoundBottomRight(20);
        P25.setRoundTopLeft(20);
        P25.setRoundTopRight(20);

        T25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T25.setText("sangria");
        T25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T25MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P25Layout = new javax.swing.GroupLayout(P25);
        P25.setLayout(P25Layout);
        P25Layout.setHorizontalGroup(
            P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T25, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        P25Layout.setVerticalGroup(
            P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T25, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        T26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        T26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T26.setText("TABLAZOS DE TEQUILA");
        T26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                T26MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(P12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(P16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(P21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T26, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(P19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(P23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(T26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(P15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void T1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 134;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P1.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 134;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P1.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T1MousePressed

    private void T5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T5MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 137;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P5.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 137;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P5.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T5MousePressed

    private void T9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T9MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 140;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P9.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 140;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P9.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T9MousePressed

    private void T13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T13MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 143;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P13.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 143;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P13.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T13MousePressed

    private void T17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T17MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 146;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P17.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 146;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P17.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T17MousePressed

    private void T2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T2MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 135;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P2.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 135;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P2.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T2MousePressed

    private void T6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T6MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 138;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P6.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 138;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P6.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T6MousePressed

    private void T10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T10MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 141;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P10.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 141;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P10.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T10MousePressed

    private void T14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T14MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 144;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P14.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 144;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P14.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T14MousePressed

    private void T18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T18MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 147;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P18.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 147;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P18.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T18MousePressed

    private void T3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T3MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 136;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P3.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 136;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P3.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T3MousePressed

    private void T7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T7MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 139;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P7.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 139;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P7.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T7MousePressed

    private void T11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T11MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 142;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P11.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 142;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P11.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T11MousePressed

    private void T15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T15MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 145;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P15.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 145;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P15.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T15MousePressed

    private void T26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T26MousePressed

    }//GEN-LAST:event_T26MousePressed

    private void T4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T4MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 167;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P4.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 167;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P4.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T4MousePressed

    private void T8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T8MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 168;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P8.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 168;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P8.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T8MousePressed

    private void T12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T12MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 169;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P12.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 169;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P12.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T12MousePressed

    private void T16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T16MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 170;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P16.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 170;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P16.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T16MousePressed

    private void T21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T21MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 171;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P21.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 171;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P21.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T21MousePressed

    private void T22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T22MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 214;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P22.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 214;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P22.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T22MousePressed

    private void T23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T23MousePressed
      if ((evt.getModifiers() & 4) != 0) {
            id_producto = 211;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P23.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 211;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P23.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T23MousePressed

    private void T24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T24MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 210;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P24.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 210;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P24.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T24MousePressed

    private void T25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T25MousePressed
       if ((evt.getModifiers() & 4) != 0) {
            id_producto = 212;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P25.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 212;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P25.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T25MousePressed

    private void T19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T19MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 148;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P19.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 148;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P19.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T19MousePressed

    private void T20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T20MousePressed
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 213;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            P19.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 213;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            P19.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_T20MousePressed

    public void TextosLabel() {

        String texto1 = "<html><center><body>VIP<br><font color='RED'>Q20.00</font></body></center></html>";
        T1.setText(texto1);
        String texto2 = "<html><center><body>CUBA LIBRE<br><font color='RED'>Q25.00</font></body></center></html>";
        T2.setText(texto2);
        String texto3 = "<html><center><body>TORMENTA NEGRA<br><font color='RED'>Q25.00</font></body></center></html>";
        T3.setText(texto3);
        String texto4 = "<html><center><body>QUETZALTECA A<br>LAS ROCAS<br><font color='RED'>Q20.00</body></center></html>";
        T4.setText(texto4);
        String texto5 = "<html><center><body>CORONA PREPARADA<br>DE LA CASA<br><font color='RED'>Q30.00</font></body></center></html>";
        T5.setText(texto5);
        String texto6 = "<html><center><body>CUBA<br><font color='RED'>Q25.00</font></body></center></html>";
        T6.setText(texto6);
        String texto7 = "<html><center><body>MICHELADA<br>DE LA CASA<br><font color='RED'>Q35.00</font></body></center></html>";
        T7.setText(texto7);
        String texto8 = "<html><center><body>QUEZALTECA PREPARADAB<br><font color='RED'>35.00</center></html>";
        T8.setText(texto8);
        String texto9 = "<html><center><body>GIN-TONIC<br><font color='RED'>Q30.00</font></body></center></html>";
        T9.setText(texto9);
        String texto10 = "<html><center><body>JAGGER BOMB<br><font color='RED'>Q30.00</body></center></html>";
        T10.setText(texto10);
        String texto11 = "<html><center><body>MARGARONA<br><font color='RED'>Q30.00</body></center></html>";
        T11.setText(texto11);
        String texto12 = "<html><center><body>XL<br>PREPARADO<br><font color='RED'>Q35.00</center></html>";
        T12.setText(texto12);
        String texto13 = "<html><center><body>QUITA CURDAS<br><font color='RED'>Q100.00</body></center></html>";
        T13.setText(texto13);
        String texto14 = "<html><center><body>CHELADA<br><font color='RED'>Q30</body></center></html>";
        T14.setText(texto14);
        String texto15 = "<html><center><body>CIMARRONA<br><font color='RED'>Q30.00</center></html>";
        T15.setText(texto15);
        String texto16 = "<html><center><body>PICONAS<br><font color='RED'>Q25.00</body></center></html>";
        T16.setText(texto16);
        String texto17 = "<html><center><body>SHOT DE TEQUILA<br><font color='RED'>Q30</body></center></html>";
        T17.setText(texto17);
        String texto18 = "<html><center><body>WHISKY A LAS<br>ROCAS<br><font color='RED'>Q35.00</body></center></html>";
        T18.setText(texto18);
        String texto19 = "<html><center><body>15 TEQUILAS<br><font color='RED'>Q200.00</body></center></html>";
        T19.setText(texto19);
        String texto20 = "<html><center><body>6 TEQUILAS<br><font color='RED'>Q100.00</body></center></html>";
        T20.setText(texto20);
        String texto21 = "<html><center><body>MARGARITA<br><font color='RED'>Q35.00</body></center></html>";
        T21.setText(texto21);
        String texto22 = "<html><center><body>BACARDI<br><font color='RED'>Q20.00</body></center></html>";
        T22.setText(texto22);
        String texto23 = "<html><center><body>MOJITO<br><font color='RED'>Q35.00</body></center></html>";
        T23.setText(texto23);
        String texto24 = "<html><center><body>PIÑA COLADA<br><font color='RED'>Q35.00</body></center></html>";
        T24.setText(texto24);
        String texto25 = "<html><center><body>SANGRIA<br><font color='RED'>Q35.00</body></center></html>";
        T25.setText(texto25);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.PanelRound P1;
    private Clases.PanelRound P10;
    private Clases.PanelRound P11;
    private Clases.PanelRound P12;
    private Clases.PanelRound P13;
    private Clases.PanelRound P14;
    private Clases.PanelRound P15;
    private Clases.PanelRound P16;
    private Clases.PanelRound P17;
    private Clases.PanelRound P18;
    private Clases.PanelRound P19;
    private Clases.PanelRound P2;
    private Clases.PanelRound P20;
    private Clases.PanelRound P21;
    private Clases.PanelRound P22;
    private Clases.PanelRound P23;
    private Clases.PanelRound P24;
    private Clases.PanelRound P25;
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
    private javax.swing.JLabel T12;
    private javax.swing.JLabel T13;
    private javax.swing.JLabel T14;
    private javax.swing.JLabel T15;
    private javax.swing.JLabel T16;
    private javax.swing.JLabel T17;
    private javax.swing.JLabel T18;
    private javax.swing.JLabel T19;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel T20;
    private javax.swing.JLabel T21;
    private javax.swing.JLabel T22;
    private javax.swing.JLabel T23;
    private javax.swing.JLabel T24;
    private javax.swing.JLabel T25;
    private javax.swing.JLabel T26;
    private javax.swing.JLabel T3;
    private javax.swing.JLabel T4;
    private javax.swing.JLabel T5;
    private javax.swing.JLabel T6;
    private javax.swing.JLabel T7;
    private javax.swing.JLabel T8;
    private javax.swing.JLabel T9;
    // End of variables declaration//GEN-END:variables
}
