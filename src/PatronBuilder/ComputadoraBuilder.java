/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronBuilder;

/**
 *
 * @author Administrador
 */
public class ComputadoraBuilder {
    private Computadora comp= new Computadora();
    
    public ComputadoraBuilder setCPU(String cpu){
        comp.cpu=cpu;
        return this;
    }
    
    public ComputadoraBuilder setRAM(String ram){
        comp.ram=ram;
        return this;
    }
    public ComputadoraBuilder setDisco(String disco){
        comp.disco=disco;
        return this;
    }
    
    public Computadora build(){
        return comp;
    }
    
}
