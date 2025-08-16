
import Clases.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Llamdo al contructor sin argumentos
        Persona P = new Persona();
        
        P.setCedula(123456777);
        System.out.println("El valos asignado actualmente a la cedula es:"+P.getCedula());      
        
//Llamado al contructor con argumentos
        Persona p2 = new Persona(104883202,"Obama");
        
    }
    
}
