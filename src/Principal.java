/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Principal {
    public static void main(String[] args) {
        Infantil inf1=new Infantil("Para menores entre 10 a 13 años", "Papelucho y el Marciano", 30, 10000);
        Tecnico tec1=new Tecnico("No", "Aprende a usar Excel nivel usuario en 10 paginas", 11, 15000);
        
        RegistroLibro reg=new RegistroLibro();
        
//        reg.agregarLibros(infantil);

        reg.add(inf1);
        reg.add(tec1);
    
        reg.listarLibros();
    }
}
