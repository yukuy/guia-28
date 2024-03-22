/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package Modelo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author JHONNY
 */
public class ConexionBD {
    
    public static Connection conexion;
    
    private ConexionBD() {
        
        try{
            String driverBD = "com.mysql.cj.jdbc.Driver";
                  
            String urLBD = "jdbc:mysql://localhost/sistemacliente";
            String usuarioBD = "root";
            String claveBD = "";
            Class.forName(driverBD);
            conexion = DriverManager.getConnection(urLBD, usuarioBD, claveBD);
            System.out.println("Conexion exitosa");
        }catch(ClassNotFoundException ex){
            System.err.println("no se encuenra el driver "+ex.getMessage());
        }catch(SQLException ex){
            System.err.println("Error al conectarce "+ex.getMessage());
        }
    }
    public static void Desconectar(){
        try{
            conexion.close();
        }catch(SQLException ex){
            System.err.println("Error al deconetarme:"+ex.getMessage());
        }
        
    }
    
    public static ConexionBD getInstance() {
        return ConexionBDHolder.INSTANCE;
    }
    
    private static class ConexionBDHolder {

        private static final ConexionBD INSTANCE = new ConexionBD();
    }
}
