/**
 ** NOMBRE CLASE:
 **	  C_EmpresaJDBC.java
 **
 ** DESCRIPCION:
 **       Abstracción JDBC de Empresa
 **
 **
 ** DESARROLLADO POR:
 **       Francisco José Legaza Bailon (PLB)
 **
 **
 ** SUPERVISADO POR:
 **
 **
 ** HISTORIA:
 ** 	000 - Abril 23, 2012 - PLB - Creacion
 **
 **
 **
 ** NOTAS:
 **
 **
 */
package JDBC;

import Modelo.C_Empresa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PLB
 */
public class C_EmpresaJDBC {

    /**
     * Instancia C_EmpresaJDBC
     */
    private static C_EmpresaJDBC instancia;

    /**
     * Constructor
     */
    private C_EmpresaJDBC(){
    }

    /**
     * Devuelve la instancia de la clase, sino la crea
     * @return Instancia
     */
    public static C_EmpresaJDBC getInstance(){
        if(instancia == null)
             instancia = new C_EmpresaJDBC();
        return instancia;

    }

    /**
     * Añade un Colaborador Empresa al sistema
     * @param e
     * @return true Si se ha podido añadir la Empresa
     * @throws SQLException
     */
    public boolean añadirC_Empresa(C_Empresa e) throws SQLException{
		DriverJDBC driver = DriverJDBC.getInstance();
		String sql = "INSERT INTO Colaborador (Direccion, Localidad, Provincia, codigoPostal, TelefonoFijo, TelefonoMovil, Email) VALUES ('"
				+ e.getDireccion()+"','"+e.getLocalidad()+"','"+e.getProvincia()+"','"+e.getCP()+"','"+e.getTelefonoFijo()+"',,'"+e.getTelefonoMovil()+"','"+e.getEmail()+"')";
		String sql2 = "INSERT INTO C_Empresa (OID, CIF, Nombre, Fax, DireccionWeb) VALUES ("
				+ "LAST_INSERT_ID(),'"+e.getCIF()+"','"+e.getNombre()+"','"+e.getFax()+"','"+e.getDireccionWeb()+"')";

		try{
			driver.inicioTransaccion();
			driver.insertar(sql);
			driver.insertar(sql2);
			driver.commit();

		}
		catch (SQLException ex){
			driver.rollback();
			throw ex;
		}
		finally {
			driver.finTransaccion();
		}

		return true;
    }

    /**
     * Modifica los datos de un Colaborador Empresa
     * @param e
     * @return true Si se han modificado correctamente los datos
     * @throws SQLException
     */
    public boolean modificarDatosC_Empresa(C_Empresa e) throws SQLException{

        DriverJDBC driver = DriverJDBC.getInstance();
        boolean exito;

        try{
            driver.inicioTransaccion();

            String sql = "UPDATE Colaborador SET Direccion='"+e.getDireccion()+"', Localidad='"+e.getLocalidad()+"', Provincia='"+e.getProvincia()+"', codigoPostal='"+e.getCP()+"', TelefonoFijo='"+e.getTelefonoFijo()+"', TelefonoMovil='"+e.getTelefonoMovil()+"', Email='"+e.getEmail()+"WHERE OID="+e.getOIDColaborador()+"'";

            String sql2 = "UPDATE C_Empresa SET CIF='"+e.getCIF()+"', Nombre='"+e.getNombre()+"', Fax='"+e.getFax()+"', DireccionWeb='"+e.getDireccionWeb()+"WHERE OID="+e.getOIDEmpresa()+"'";

            exito = driver.insertar(sql);
            if (exito) exito = driver.insertar(sql2);
            driver.commit();

        }
        catch (SQLException ex){
            driver.rollback();
            exito = false;
            throw ex;
	}
        finally {
            driver.finTransaccion();
	}
        return exito;
    }

    /**
     * Elimina un Colaborador Empresa del sistema
     * @param e
     * @return true Si se ha podido eliminar la Empresa
     * @throws SQLException
     */
    public boolean eliminarC_Empresa(C_Empresa e) throws SQLException{

        DriverJDBC driver = DriverJDBC.getInstance();
        boolean exito;

        try{
            driver.inicioTransaccion();

            String sql = "UPDATE Colaboracion SET OID=OID_Anonimo WHERE OID='"+e.getOIDEmpresa()+"'";

            String sql2 = "DELETE FROM C_Empresa WHERE OID='"+e.getOIDEmpresa()+"'";

            String sql3 = "DELETE FROM Colaborador WHERE OID='"+e.getOIDColaborador()+"'";

            exito = driver.insertar(sql);
            if (exito) {
                exito = driver.insertar(sql2);
                if (exito) exito = driver.insertar(sql3);
            }
            driver.commit();

        }
        catch (SQLException ex){
            driver.rollback();
            exito = false;
            throw ex;
	}
        finally {
            driver.finTransaccion();
	}
        return exito;
    }

    /**
     * Consultar los datos de un Colaborador Empresa
     * @param cif
     * @return Empresa Colaborador Empresa que se estaba buscando
     * @throws SQLException
     */
    public C_Empresa obtenerC_Empresa(String cif) throws SQLException{

        DriverJDBC driver = DriverJDBC.getInstance();

        String sql = "SELECT * FROM Colaborador c, C_Empresa e WHERE (e.CIF='"+cif+"') AND c.OID=e.OID";

        ResultSet rs = driver.seleccionar(sql);
        C_Empresa Empresa = null;

        if(rs.next()){
            Empresa = new C_Empresa();
            Empresa.setCIF(rs.getString("CIF"));
            Empresa.setNombre(rs.getString("Nombre"));
            Empresa.setDireccionWeb(rs.getString("DireccionWeb"));
            Empresa.setFax(rs.getString("Fax"));


            Empresa.setCP(rs.getString("CodigoPostal"));
            Empresa.setDireccion(rs.getString("Direccion"));
            Empresa.setEmail(rs.getString("Email"));
            Empresa.setLocalidad(rs.getString("Localidad"));
            Empresa.setProvincia(rs.getString("Provincia"));
            Empresa.setTelefonoFijo(rs.getString("TelefonoFijo"));
            Empresa.setTelefonoMovil(rs.getString("TelefonoMovil"));

            }

            return Empresa;
    }

    /**
     * Obtener un listado de todos los Colaboradores Empresa del sistema
     * @param tipoBusqueda
     * @param valor
     * @return listaC_Empresa Listado de todos los Colaboradores Empresa
     * @throws SQLException
     */
    public ArrayList<C_Empresa> buscarC_Empresa(String tipoBusqueda, String valor) throws SQLException{

        DriverJDBC driver = DriverJDBC.getInstance();
        String sql = "SELECT * FROM C_Empresa e, Colaborador c WHERE "+tipoBusqueda+"='"+valor+"' AND e.OID=c.";

        ResultSet resultados = driver.seleccionar(sql);
        ArrayList<C_Empresa> listaC_Empresa = new ArrayList<C_Empresa>();
        C_Empresa Empresa = null;

        if(resultados.next()){
            Empresa = new C_Empresa();
            Empresa.setCIF(resultados.getString("CIF"));
            Empresa.setNombre(resultados.getString("Nombre"));
            Empresa.setDireccionWeb(resultados.getString("DireccionWeb"));
            Empresa.setFax(resultados.getString("Fax"));

            Empresa.setCP(resultados.getString("CodigoPostal"));
            Empresa.setDireccion(resultados.getString("Direccion"));
            Empresa.setEmail(resultados.getString("Email"));
            Empresa.setLocalidad(resultados.getString("Localidad"));
            Empresa.setProvincia(resultados.getString("Provincia"));
            Empresa.setTelefonoFijo(resultados.getString("TelefonoFijo"));
            Empresa.setTelefonoMovil(resultados.getString("TelefonoMovil"));

            listaC_Empresa.add(Empresa);
        }

        return listaC_Empresa;
    }

}