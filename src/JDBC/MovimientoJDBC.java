/**
 ** NOMBRE CLASE: 
 **	  MovimientoJDBC.java
 **
 ** DESCRIPCION:
 **       Abstracción JDBC de Movimiento
 **       
 **
 ** DESARROLLADO POR:
 *        Francisco José Beltrán Rodriguez (FBR)
 *	   
 **        
 ** SUPERVISADO POR:
 **       Adolfo Arcoya Nieto (AAN)  
 **
 ** HISTORIA:
 ** 	000 - Mar 24, 2012 - FBR - Creacion e implementación de los  métodos
 **     001 - Mar 25, 2012 - FBR - Implementacion de los metodos
 *      002 - Mar 26, 2012 - FBR - Implementacion de los métodos 
 **     003 - Jun 01, 2012 - FBR - Implementación de las transacciones y revision de los métodos de registrar
 *      
 **
 ** NOTAS:
 **   
 **
 */
package JDBC;

import Controladores.TestDatos;
import Modelo.Ayuda;
import Modelo.Movimiento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jobero
 */
public class MovimientoJDBC {
    
     private static MovimientoJDBC instancia;
    
     private MovimientoJDBC(){
        
        
     }
     
     public static MovimientoJDBC getInstance(){

            if(instancia == null)
                    instancia = new MovimientoJDBC();
            return instancia;

     }
     
     public float obtenerBalance(Date fecha_inicial, Date fecha_final) throws SQLException{
         
          float total=0;
         
          ResultSet resultado;
          DriverJDBC driver = DriverJDBC.getInstance() ;
       
          String consulta = "SELECT Cantidad FROM movimiento WHERE Fecha BETWEEN '"+TestDatos.formatterBD.format(fecha_inicial) +"' AND '"+TestDatos.formatterBD.format(fecha_final)+"'";
          
          try{
              driver.conectar();
              resultado = driver.seleccionar(consulta);

              while (resultado.next()){
              
                  if("I".equalsIgnoreCase(resultado.getString("tipo")))
                      total = total + resultado.getFloat("Cantidad");
                  else if ("G".equalsIgnoreCase(resultado.getString("tipo")))
                      total = total - resultado.getFloat("Cantidad");  
              }      
         
          }catch (SQLException ex) {
              throw ex;
          } finally {
              driver.desconectar();
          }

         return total;
     }
     
     public ArrayList<Movimiento> obtenerDatosGastos(Date fecha_inicial, Date fecha_final) throws SQLException{
         
          ArrayList<Movimiento> lista_movimientos = new ArrayList<Movimiento>();
         
         
          ResultSet rs,rs2;
          DriverJDBC driver = DriverJDBC.getInstance() ;
          
          String fecha_ini_string = fecha_inicial.toString();
          String fecha_fin_string = fecha_final.toString();
       
          String consulta = "SELECT * FROM movimiento WHERE tipo = 'G' AND Fecha >= '"+fecha_inicial+"' AND Fecha <= '"+fecha_final+"'"; 
          
          try{
              driver.conectar();
         
              rs = driver.seleccionar(consulta);
              Movimiento m;
          
                while (rs.next()){
                    m=new Movimiento();

                    m.setConcepto(rs.getString("concepto"));
                    m.setImporte(rs.getFloat("Importe"));
                    m.setFecha(rs.getDate("Fecha"));
                    m.setTipo('G');
                    //Guardamos el ID de ayuda
                    String id_ayuda = rs.getString("AyudaOID");         


                    //Añadimos los valores de la ayuda
                    String consulta3 = "SELECT * FROM ayuda WHERE OID = '"+id_ayuda+"'";
                    rs2 = driver.seleccionar(consulta3);

                    Ayuda ayu ;
                    ArrayList<Ayuda> lista_ayudas = new ArrayList<Ayuda>();
                    while (rs2.next()){
                        ayu = new Ayuda();
                        ayu.setFecha(rs2.getDate("Fecha"));
                        ayu.setImporte(rs2.getFloat("Importe"));
                        ayu.setObservaciones(rs2.getString("Observaciones"));
                        ayu.setOID(rs2.getLong("OID"));

                        lista_ayudas.add(ayu);

                    }
                    m.setAyudasAsociadas(lista_ayudas);

                    lista_movimientos.add(m);
                }
           }catch (SQLException ex) {
            throw ex;
           } finally {
             driver.desconectar();
           }

         return lista_movimientos;
         
     }
     
     public ArrayList<Movimiento> obtenerDatosIngresos(Date fecha_inicial, Date fecha_final) throws SQLException{
         
           ArrayList<Movimiento> lista_movimientos = new ArrayList<Movimiento>();
         
         
          ResultSet rs,rs2;
          DriverJDBC driver = DriverJDBC.getInstance() ;
          
          String fecha_ini_string = fecha_inicial.toString();
          String fecha_fin_string = fecha_final.toString();
       
          String consulta = "SELECT * FROM movimiento WHERE tipo = 'I' AND Fecha >= '"+fecha_inicial+"' AND Fecha <= '"+fecha_final+"'"; 
          
          try{
                driver.conectar();
                rs = driver.seleccionar(consulta);
                Movimiento m;
          
                while (rs.next()){
                    m=new Movimiento();

                    m.setConcepto(rs.getString("concepto"));
                    m.setImporte(rs.getFloat("Importe"));
                    m.setFecha(rs.getDate("Fecha"));
                    m.setTipo('G');
                    //Guardamos el ID de ayuda
                    String id_ayuda = rs.getString("AyudaOID");         

                    //Añadimos los valores de la ayuda
                    String consulta3 = "SELECT * FROM ayuda WHERE OID = '"+id_ayuda+"'";
                    rs2 = driver.seleccionar(consulta3);

                    Ayuda ayu ;
                    ArrayList<Ayuda> lista_ayudas = new ArrayList<Ayuda>();
                    while (rs2.next()){
                        ayu = new Ayuda();
                        ayu.setFecha(rs2.getDate("Fecha"));
                        ayu.setImporte(rs2.getFloat("Importe"));
                        ayu.setObservaciones(rs2.getString("Observaciones"));
                        ayu.setOID(rs2.getLong("OID"));

                        lista_ayudas.add(ayu);

                    }
                    m.setAyudasAsociadas(lista_ayudas);

                    lista_movimientos.add(m);
                }   
          
         }catch (SQLException ex) {
            throw ex;
         } finally {
             driver.desconectar();
         }
         
         return lista_movimientos;
         
     }
     
     public boolean registrarDatosGasto(Movimiento movimiento) throws SQLException{
         
         DriverJDBC driver = DriverJDBC.getInstance() ;
         String sentencia ;
         String fecha ;
         fecha = movimiento.getFecha().toString();
         Float importe = movimiento.getImporte();
         //Asociacion temp = movimiento.getAsociacionQueGenera().get
         boolean exito;
         Integer maxMovID;
         
         ResultSet rs;
         //Buscamos el Maximo MovimientoID para que la inserción se autoincremental
         String consulta = "SELECT MAX(MovimientoID) as maxMovId FROM movimiento " ;
         rs = driver.seleccionar(consulta);
         if(rs.next())
             maxMovID= rs.getInt("maxMovId")+1;
         else
             maxMovID = 1;
         
         sentencia = "INSERT INTO movimiento (MovimientoID,Fecha,Importe,concepto,tipo,AsociacionID) VALUES ('"+maxMovID.toString()+"','"+fecha+"','"+importe.toString()+"','"+movimiento.getConcepto()+"','"+movimiento.getTipo()+"','1' )";
         
         try {
            driver.inicioTransaccion();
            exito = driver.insertar(sentencia);
            driver.commit();
        } catch (SQLException ex) {
            driver.rollback();
            exito = false;
            throw ex;
        } finally {
            driver.finTransaccion();
        }
         
         
         return exito;
     }
    
     public boolean registrarDatosGastoAyuda(Movimiento movimiento, Ayuda ayuda) throws SQLException{
         
         DriverJDBC driver = DriverJDBC.getInstance() ;
         String sentencia ;
         String fecha , fecha_ayuda;
         fecha = movimiento.getFecha().toString();
         fecha_ayuda = ayuda.getFecha().toString();
         Float importe = movimiento.getImporte();
         //Asociacion temp = movimiento.getAsociacionQueGenera().get
         Integer maxMovID ;
         boolean exito;
         
         ResultSet rs;
         //Buscamos el Maximo MovimientoID para que la inserción se autoincremental
         String consulta = "SELECT MAX(MovimientoID) as maxMovId FROM movimiento " ;
         rs = driver.seleccionar(consulta);
         if(rs.next())
             maxMovID= rs.getInt("maxMovId")+1;
         else
             maxMovID = 1;
         
         sentencia = "INSERT INTO movimiento (MovimientoID,Fecha,Importe,concepto,tipo,AsociacionID,AyudaOID) VALUES ('"+maxMovID.toString()+"','"+fecha_ayuda+"','"+importe.toString()+"','"+movimiento.getConcepto()+"','"+movimiento.getTipo()+"','1','" +ayuda.getOID()+ "' )";
         
         try {
            driver.inicioTransaccion();
            exito = driver.insertar(sentencia); 
            driver.commit();
        } catch (SQLException ex) {
            driver.rollback();
            exito = false;
            throw ex;
        } finally {
            driver.finTransaccion();
        }
         
         
         return exito;
     }
             
}
