/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.project;

import javax.swing.JOptionPane;

/**
 * Genera el CURP de una persona cuyos datos sean ingresados
 * @author enri0
 */
public class curp {
    
    /**
    * Genera el CURP de una persona al ingresar sus datos
    * @param nombre Es el nombre de la persona
    * @param apellidoP Es el apellido paterno o primer apellido de la persona.
    * @param apellidoM Es el apellido materno o segundo apellido de la persona.
    * @return La primera letra y primera vocal interna del primer apellido, primera letra del segundo apellido, 
    * primera letra del nombre de pila, primera consonante interna no inicial del primer apellido, 
    * primera consonante interna no inicial del segundo apellido y primera consonante interna no inicial del nombre.
    * @param sexo Es el genero de la persona
    * @return El caracter inicial del genero introducido
    * @param dia Es el dia de la fecha de nacimiento de la persona.
    * @param mes Es el mes de la fecha de nacimiento de la persona.
    * @param año es el año de la fecha de nacimiento de la persona.
    * @return La fecha de nacimeinto de la persona uzando 2 digitos de la fecha en el orden año, mes y dia. 
    */

    
    String nombre = "";
    String apellidoP = "";
    String apellidoM = "";
    String sexo = "";
    String estado = "";

    char a;
    char b;
    char c;

    Integer dia = 0;
    Integer mes = 0;
    Integer año = 0;
    
    /**
     * Junta los datos de la fecha de nacimiento para ordenarlos al imprimir.
     * @param a se encarga de interpretar el dia.
     * @param b se encarga de interpretar el mes.
     * @param c se encarga de interpretar el año.
     * Regresa Los datos de la fehca de nacimiento.
     */

    public void getFecha(String a, String b, String c) {

        dia = Integer.parseInt(a);
        mes = Integer.parseInt(b);
        año = Integer.parseInt(c);
    }
    /**
     * Junta los datos del nombre completo para ordenarlos al imprimir y ajustar las letras a mayusculas.
     * @param a se encarga de interpretar las letras del nombre y cambiarlas a mayusculas.
     * @param b se encarga de interpretar las letras del primer apellido y cambiarlas a mayusculas.
     * @param c se encarga de interpretar las letras del segundo apellido y cambiarlas a mayusculas.
     * Regresa Los digitos del nombre para ingresar al CURP.
     */

    public void getNombre(String a, String b, String c) {

        nombre = a.toUpperCase();
        apellidoP = b.toUpperCase();
        apellidoM = c.toUpperCase();
    }

    /**
     * Identifica el dato seleccionado en la JComboBox.
     * @param boxGenero se encarga de interpretar el objeto seleccionado en la JComboBox y escribirlo como se debe interpretar.
     * Inserta la letra inicial del genero seleccionado en la JComboBox.
     */
    
    public void getSexo(String boxGenero) {
        sexo = boxGenero;
    }
    /**
     * Identifica el dato seleccionado en la JComboBox.
     * @param boxEstado se encarga de interpretar los character que representan al estado
     * Inserta la clave del estado seleccionado en la JComboBox.
     */
    public void getEstado(String boxEstado) {
        estado = boxEstado;
    }

    /**
     * El metodo se encarga de identificar los objetos en el JComboBox boxGenero y la letra que los representa.
     */
    public void sexo() {

        switch (sexo) {

            case "Hombre":
                c = 'H';
                break;

            case "Mujer":
                c = 'M';
        }
    }   

    /**
     * El metodo se encarga de seleccionar la priemra letra y primera vocal del primer apellido
     */
    public void curp() {
        char d1 = apellidoP.charAt(0);
        char d2 = 0;

        for (int i = 1; i < apellidoP.length(); i++) {
            char l = apellidoP.charAt(i);
            if (l == ('A') || l == ('E') || l == ('I') || l == ('O') || l == ('U')) {
                d2 = l;
            } else {
                
                break;
            }
        }   
        // Selecciona la primera letra del segundo apellido
        char d3 = apellidoM.charAt(0);
        
        // Selecciona la primera letra del primer nombre y en caso de haber uno del segundo nombre
        char d4 = nombre.charAt(0);

        // Selecciona los ultimos 2 caracteres del año introducido.
        String year = String.valueOf(año);

        char d5 = year.charAt(2);
        char d6 = year.charAt(3);

        // Selecciona los ultimos 2 caracteres del mes introducido.
        String month = String.valueOf(mes);
        char d7 = 0;
        char d8 = 0;
        if (mes < 10) {
            d7 = '0';
            d8 = month.charAt(0);
        } else {

            d7 = month.charAt(0);
            d8 = month.charAt(1);
        }

        // Selecciona los ultimos 2 caracteres del dia intorducido.
        String day = String.valueOf(dia);
        char d9 = 0;
        char d10 = 0;

        if (dia < 10) {
            d9 = '0';
            d10 = day.charAt(0);
        } else {
            d9 = day.charAt(0);
            d10 = day.charAt(1);
        }

        // Selecciona el primer caracter del genero seleccionado.
        char d11 = sexo.charAt(0);
        
        // Selecciona la clave del estado seleccionado.
        estado();
        char d12 = a;
        char d13 = b;
    
    // Selecciona la primera consonante no inicial del primer apellido.
    char d14 = apellidoP.charAt(2);
        
    // Selecciona la primera consonante no inicial del segundo apellido.
    char d15 = apellidoM.charAt(2);
    
    // Selecciona la primera consonante no inicial del nombre
    char d16 = nombre.charAt(1);
      
                char d17 = 0;
                if (año >= 2000) {
                    d17 = 'A';
                }else {
                    d17 = '0';
                }

                int numero = (int) (Math.random() * 1+1);
                String nu = String.valueOf(numero);
                char d18 = nu.charAt(0);
        

        JOptionPane.showMessageDialog(null, d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10 + "" + d11 + "" + d12 + "" + d13 + "" + d14 + "" + d15 + "" + d16 + "" + d17 + "" + d18);
        

    }
    /**
     * El metodo se encarga de colocar los estados en el JComboBox y marcar las letras que confroman su clave.
     */
         public void estado() {

        switch (estado) {

            case "Aguascalientes":

                a = 'A';
                b = 'S';
                break;

            case "BajaCalifornia":
                a = 'B';
                b = 'C';
                break;

            case "BajaCaliforniaSur":
                a = 'B';
                b = 'S';
               
                break;

            case "Campeche":

                a = 'C';
                b = 'C';
                break;

            case "Chiapas":
                a = 'C';
                b = 'S';
                break;

            case "Chihuahua":
                a = 'C';
                b = 'H';
                break;

            case "Coahuila":
                a = 'C';
                b = 'L';
                break;

            case "Colima":
                a = 'C';
                b = 'M';
                break;

            case "CiudaddeMéxico":
                a = 'D';
                b = 'F';
                break;

            case "Durango":
                a = 'D';
                b = 'G';
                break;

            case "EstadodeMéxico":
                a = 'E';
                b = 'M';
                break;

            case "Guanajuato":
                a = 'G';
                b = 'T';
                break;

            case "Guerrero":
                a = 'G';
                b = 'R';
                break;

            case "Hidalgo":
                a = 'H';
                b = 'G';
                break;

            case "Jalisco":
                a = 'J';
                b = 'C';
                break;

            case "Michoacán":
                a = 'M';
                b = 'N';
                break;

            case "Morelos":
                a = 'M';
                b = 'S';
                break;

            case "Nayarit":
                a = 'N';
                b = 'T';
                break;

            case "NuevoLeón":
                a = 'N';
                b = 'L';
                break;

            case "Oaxaca":
                a = 'O';
                b = 'C';
                break;

            case "Puebla":
                a = 'P';
                b = 'L';
                break;

            case "Querétaro":
                a = 'Q';
                b = 'O';
                break;

            case "QuintanaRoo":
                a = 'Q';
                b = 'R';
                break;

            case "SanLuisPotosi":
                a = 'S';
                b = 'P';
                break;

            case "Sinaloa":
                a = 'S';
                b = 'L';
                break;

            case "Sonora":
                a = 'S';
                b = 'R';
                break;

            case "Tabasco":
                a = 'T';
                b = 'C';
                break;

            case "Tamaulipas":
                a = 'T';
                b = 'S';
                break;

            case "Tlaxcala":
                a = 'T';
                b = 'L';
                break;

            case "Veracruz":
                a = 'V';
                b = 'Z';
                break;

            case "Yucatán":
                a = 'Y';
                b = 'N';
                break;

            case "Zacatecas":
                a = 'Z';
                b = 'S';
                break;
        }
          
         }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her   

    
}
    void setText(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

