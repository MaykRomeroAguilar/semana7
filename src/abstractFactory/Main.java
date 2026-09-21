/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractFactory;

 
public class Main {

    
    public static void main(String[] args) {
         
        FabricaMuebles fabrica = new FabricaModerna();
        fabrica.CrearSilla().crear();
        fabrica.CrearMesa().crear();
    }
    
}
