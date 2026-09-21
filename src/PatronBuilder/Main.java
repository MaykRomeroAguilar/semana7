/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PatronBuilder;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora pc = new ComputadoraBuilder()
                .setCPU("Intel i7")
                .setRAM("16 GB")
                .setDisco("512 GB SSD")
                .build();
        System.out.println("pc nueva: " + pc);
        
    }
    
}
