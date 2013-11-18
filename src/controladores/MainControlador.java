/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import interfaz.AplicacionGui;
import interfaz.PantallaBienvenida;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JRException;
import abm.ConnectionDataBase;
import interfaz.LoginGui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author agustin
 */
public class MainControlador implements ActionListener{
    
     private LoginGui log;
     private ConnectionDataBase cdb;
     private PantallaBienvenida pb;
     private AplicacionGui app;
     private  ClienteControlador cl;
     
     @SuppressWarnings("CallToThreadDumpStack")
     public MainControlador() throws ClassNotFoundException, JRException, SQLException{
        cdb = new ConnectionDataBase();
        cdb.createConnection();
        JFrame.setDefaultLookAndFeelDecorated(true); //Le agrego un tema lindo al programa
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        pb = new PantallaBienvenida();
        pb.setVisible(true);
        log = new LoginGui();
        app = new AplicacionGui();
        log.setActionListener(this);
        cl = new ClienteControlador(app.getAbmClienteGui());
        log.setVisible(true);
        pb.dispose();
      
     }
    
     public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException, JRException {
         MainControlador mainControlador = new MainControlador();       

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        if(b.equals(log.getLogin())){
            log.dispose();
            app.setVisible(true);
        } 
        if(b.equals(log.getSalir())){
            System.exit(0);
        }
    }
}