/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factoryMethod;

/**
 *
 * @author Administrador
 */
public class Main {

     
    public static void main(String[] args) {
        
        Transporte t1= TransporteFactory.getTransporte("auto");
        t1.entregar();
        Transporte t2= TransporteFactory.getTransporte("moto");
        t2.entregar();
    }
    
}
