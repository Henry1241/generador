/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.project;

/**
 *
 * @author enri0
 */
public class main {
    
    public static void main (String[] args) {
        /**
         * Este metodo permite a la ventana aparecer en el centro al introducir los datos.
         */
        datos _datos = new datos();
        
        _datos.setLocationRelativeTo(null);
        _datos.setTitle("CURP");
        _datos.setVisible(true);
        
    }

    void setText(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
