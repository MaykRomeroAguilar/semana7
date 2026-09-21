/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod;

 
public class TransporteFactory {
    public static Transporte getTransporte(String tipo){
        if (tipo.equalsIgnoreCase("auto")) {
            return new Auto();  
        }else   if (tipo.equalsIgnoreCase("moto")) {
            return new Moto(); 
        }
        return null;
    }
}
