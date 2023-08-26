/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */
public class BDIngresos {
    
    
    
    public static InsertarProducto InsertarProducto_Pedido(InsertarProducto t) throws SQLException{
        BDConexionSP conecta = new BDConexionSP();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into ventas (noorden,codigo,cantidad,total,estado) values(?,?,1,(select precio from productos where codigo =  "+t.getId_producto()+" ),1) ",Statement.RETURN_GENERATED_KEYS);
        try {
         smtp.setInt(1,t.getId_pedido());
         smtp.setInt(2,t.getId_producto());
         smtp.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA ADENTRO =  "+e);}
        ResultSet rs = smtp.getGeneratedKeys();
        if(rs.next()){int id1 = rs.getInt(1);
          t.setIdregreso(id1);
        }
        
       con.close();
       smtp.close(); 
        return t;
       
    }
    
    public static InsertarProducto InsertarProducto_PedidoCervezaCubetazo(InsertarProducto t) throws SQLException{
        BDConexionSP conecta = new BDConexionSP();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        PreparedStatement sm = null;
        smtp =con.prepareStatement("insert into ventas (noorden,codigo,cantidad,total,estado) values(?,?,1,(select precio from productos where codigo =  "+t.getId_producto()+" ),1) ",Statement.RETURN_GENERATED_KEYS);
        sm = con.prepareStatement("{call DescargaPorCubetazo("+t.getId_producto()+",1)}");
        try {
         smtp.setInt(1,t.getId_pedido());
         smtp.setInt(2,t.getId_producto());
         smtp.executeUpdate();
         sm.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA ADENTRO =  "+e);}
        ResultSet rs = smtp.getGeneratedKeys();
        if(rs.next()){int id1 = rs.getInt(1);
          t.setIdregreso(id1);
        }
        
       con.close();
       smtp.close();
       sm.close(); 
        return t;
       
    }
    
    public static InsertarProducto InsertarProducto_PedidoCervezaUnidad(InsertarProducto t) throws SQLException{
        BDConexionSP conecta = new BDConexionSP();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        PreparedStatement sm = null;
        smtp =con.prepareStatement("insert into ventas (noorden,codigo,cantidad,total,estado) values(?,?,1,(select precio from productos where codigo =  "+t.getId_producto()+" ),1) ",Statement.RETURN_GENERATED_KEYS);
        sm = con.prepareStatement("{call DescargaPorUnidad("+t.getId_producto()+",1)}");
        try {
         smtp.setInt(1,t.getId_pedido());
         smtp.setInt(2,t.getId_producto());
         smtp.executeUpdate();
         sm.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA ADENTRO =  "+e);}
        ResultSet rs = smtp.getGeneratedKeys();
        if(rs.next()){int id1 = rs.getInt(1);
          t.setIdregreso(id1);
        }
        
       con.close();
       smtp.close();
       sm.close(); 
        return t;
       
    }
    
    
     public static InsertarProducto InsertarProducto_PedidoBotellas(InsertarProducto t) throws SQLException{
        BDConexionSP conecta = new BDConexionSP();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        PreparedStatement sm = null;
        smtp =con.prepareStatement("insert into ventas (noorden,codigo,cantidad,total,estado) values(?,?,1,(select precio from productos where codigo =  "+t.getId_producto()+" ),1) ",Statement.RETURN_GENERATED_KEYS);
        sm = con.prepareStatement("{call DescargaPorUnidad("+t.getId_producto()+",1)}");
        try {
         smtp.setInt(1,t.getId_pedido());
         smtp.setInt(2,t.getId_producto());
         smtp.executeUpdate();
         sm.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA ADENTRO =  "+e);}
        ResultSet rs = smtp.getGeneratedKeys();
        if(rs.next()){int id1 = rs.getInt(1);
          t.setIdregreso(id1);
        }
        
       con.close();
       smtp.close(); 
       sm.close(); 
        return t;
       
    }
    
    
    
  public static ArrayList<InsertarProducto> ListarProductosPedidos (int a ) {
        return SQL3(" SELECT cantidad,DESCRIPCION,precio,precio*CANTIDAD as total FROM ventas v inner join productos p on v.CODIGO = p.CODIGO where NOORDEN = "+a+";");    
 }  

private static ArrayList<InsertarProducto> SQL3(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexionSP conecta = new BDConexionSP();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCantidad(rs.getInt("cantidad"));
                 t.setDescripcion(rs.getString("DESCRIPCION").toUpperCase());
                 t.setPrecio(rs.getDouble("Precio"));
                 t.setTotal(rs.getDouble("total"));
                 list.add(t);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
}  
    


 public static ArrayList<InsertarProducto> BDIngresosPromo () {
        return SQLP("SELECT CODIGO,DESCRIPCION,PRECIO FROM productos WHERE ESTADO = 5");    
 }  

private static ArrayList<InsertarProducto> SQLP(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexionSP conecta = new BDConexionSP();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCodigo(rs.getInt("CODIGO"));
                 t.setDescripcion(rs.getString("DESCRIPCION").toUpperCase());
                 t.setPrecio(rs.getDouble("PRECIO"));
                 list.add(t);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
}  
    


public static InsertarProducto BuscarProductoPromo(int a) throws SQLException{
        return buscarPromo(a ,null);
    }
    
    public static InsertarProducto buscarPromo(int a, InsertarProducto c) throws SQLException {
             
            BDConexionSP conecta = new BDConexionSP();
            Connection cn = conecta.getConexion();
            PreparedStatement ps = null;
            ps = cn.prepareStatement("select codigo,descripcion,precio,status from productos where codigo = "+a);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
               if (c==null)
               {c = new InsertarProducto(){
               };
               }
               c.setCodigo(rs.getInt("Codigo"));
               c.setDescripcion(rs.getString("Descripcion"));
               c.setPrecio(rs.getDouble("Precio"));
               c.setStatus(rs.getInt("STATUS"));
               
            }
            cn.close();
            ps.close();
            return c;
}
    
    public static void UpdatePromo(InsertarProducto t) throws SQLException{
            BDConexionSP conecta = new BDConexionSP();
            Connection con = conecta.getConexion();
        PreparedStatement ps = null;
        ps = con.prepareStatement("UPDATE PRODUCTOS SET DESCRIPCION = ?,PRECIO = ?,STATUS = ? WHERE CODIGO ="+t.getCodigo());
        ps.setString(1, t.getDescripcion());
        ps.setDouble(2, t.getPrecio());
        ps.setInt(3, t.getStatus());
        ps.executeUpdate();
        con.close();
        ps.close(); 
    }
    
    
    public static ArrayList<InsertarProducto> BDIngresosProductosInventario () {
        return Inven("select i.IDPRODUCTOSINVE,i.Nombre,i.CANTIDAD,i.precio from productosinventario i inner join productos p on i.CODIGO = p.CODIGO");    
 }  

    private static ArrayList<InsertarProducto> Inven(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexionSP conecta = new BDConexionSP();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setIdregresoPedido(rs.getInt("IDPRODUCTOSINVE"));
                 t.setDescripcion(rs.getString("Nombre").toUpperCase());
                 t.setCantidad(rs.getInt("CANTIDAD"));
                 t.setPrecio(rs.getDouble("precio"));
                 list.add(t);
                            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
}  
    
    
    
    
    public static ArrayList<InsertarProducto> ProductosVentas(String Fecha) {
        return venta("SELECT v.codigo,p.DESCRIPCION,p.PRECIO,sum(v.CANTIDAD) as CANTIDAD,sum(v.TOTAL) as TOTAL\n" +
"FROM ventas v inner join productos p on v.CODIGO = p.CODIGO join ordenes o on v.NOORDEN = o.NOORDEN where  date_format(fecha,\"%d/%m/%Y\" )  = '"+Fecha+"'  group by  v.codigo,p.DESCRIPCION,p.PRECIO  order by codigo;");    
 }  

    private static ArrayList<InsertarProducto> venta(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexionSP conecta = new BDConexionSP();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCodigo(rs.getInt("CODIGO"));
                 t.setDescripcion(rs.getString("DESCRIPCION").toUpperCase());
                 t.setCantidad(rs.getInt("CANTIDAD"));
                 t.setPrecio(rs.getDouble("PRECIO"));
                 t.setTotal(rs.getDouble("TOTAL"));
                 list.add(t);
                            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
}  
    
    
    
    public static ArrayList<InsertarProducto> ProductosVentasDetallado(String Fecha) {
        return ventaDeta("SELECT v.codigo,p.DESCRIPCION,p.PRECIO,v.CANTIDAD,v.TOTAL,o.FECHA \n" +
"FROM ventas v inner join productos p on v.CODIGO = p.CODIGO join ordenes o on v.NOORDEN = o.NOORDEN where  date_format(fecha,\"%d/%m/%Y\" )  = '"+Fecha+"' order by codigo;");    
 }  

    private static ArrayList<InsertarProducto> ventaDeta(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexionSP conecta = new BDConexionSP();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCodigo(rs.getInt("CODIGO"));
                 t.setDescripcion(rs.getString("DESCRIPCION").toUpperCase());
                 t.setCantidad(rs.getInt("CANTIDAD"));
                 t.setPrecio(rs.getDouble("PRECIO"));
                 t.setTotal(rs.getDouble("TOTAL"));
                 t.setFecha(rs.getString("FECHA"));
                 list.add(t);
                            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
}  

    
    public static ArrayList<InsertarProducto> Ordenes(String Fecha) {
        return Order("select noorden,Total,Fecha from ordenes where date_format(fecha,'%d/%m/%Y')  ='"+Fecha+"'");    
 }  

    private static ArrayList<InsertarProducto> Order(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexionSP conecta = new BDConexionSP();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setNoOrden(rs.getInt("noorden"));
                 t.setTotal(rs.getDouble("TOTAL"));
                 t.setFecha(rs.getString("FECHA"));
                 list.add(t);
                            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("error consulta DE LA A TABLA "+e);
            return null;
        } 
        return list;
}  
    
    
    
    
    public static InsertarProducto BuscarTotal(String a) throws SQLException{
        return buscarTotal(a ,null);
    }
    
    public static InsertarProducto buscarTotal(String a, InsertarProducto c) throws SQLException {
             
            BDConexionSP conecta = new BDConexionSP();
            Connection cn = conecta.getConexion();
            PreparedStatement ps = null;
            ps = cn.prepareStatement("select SUM(TOTAL) AS TOTAL, count(*) as ORDENES from ordenes where date_format(fecha,'%d/%m/%Y' )  = '"+a+"';");
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
               if (c==null)
               {c = new InsertarProducto(){};}
               c.setNoOrden(rs.getInt("ORDENES"));
               c.setTotal(rs.getDouble("TOTAL"));
               
            }
            cn.close();
            ps.close();
            return c;
}

    
}
