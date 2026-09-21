/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractFactory;

/**
 *
 * @author Administrador
 */
public class FabricaModerna implements FabricaMuebles {
    
    @Override
    public Silla CrearSilla(){
        return new SillaModerna();
    }

    @Override
    public Mesa CrearMesa() {
        return new MesaModerna();
    }
    
}
