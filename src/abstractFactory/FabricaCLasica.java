/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractFactory;

/**
 *
 * @author Administrador
 */
public class FabricaCLasica implements FabricaMuebles{

    @Override
    public Silla CrearSilla() {
        return new SillaClasica();
    }

    @Override
    public Mesa CrearMesa() {
        return new MesaClasica();
    }
    
}
