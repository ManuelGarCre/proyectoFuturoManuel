/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofuturo;

import static java.lang.Integer.parseInt;

/**
 *
 * @author garcr
 */
public class ProyectoFuturo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Estudiante " + args[0] + ": " + veredicto(args[1], args[2]));
    }
    
    public static String veredicto(String modulos, String horas) {
        String veredicto;
        
        if(modulos.equals(horas)){
            veredicto = "Una hora de estudio suele ser muy poco, debes esforzarte más.";
        }
        else if(parseInt(horas, 10) < parseInt(modulos, 10)){
            veredicto = "Debes dedicar más tiempo a tus estudios.";
        }
        else if(Integer.valueOf(horas) >= Integer.valueOf(modulos) * 4){
            veredicto = "Bien hecho, si sigues asi, seguro que apruebas.";
        }
        else{
            veredicto = "Es muy posible que apruebes pero no te relajes.";
        }
        
        return veredicto;
    }
    
}
