/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julian
 */
public class Principal {
    public static void main(String[] args) {
        Infantil inf1=new Infantil("Para menores entre 10 a 13 años", "Papelucho y el Marciano", 30, 10000);
        Tecnico tec1=new Tecnico("No", "Aprende a usar Excel nivel usuario en 10 paginas", 11, 15000);
        Infantil inf2=new Infantil("Para mayores de 18 años", "Crepusculo", 300, 40000);
        Tecnico tec2=new Tecnico("No", "Aprende a usar Word nivel avanzado en 1 mes", 50, 31000);
        RegistroLibro reg=new RegistroLibro();
        
//        reg.agregarLibros(infantil);

        reg.agregarLibro(inf1);
        reg.agregarLibro(tec1);
        reg.agregarLibro(tec2);
        reg.agregarLibro(inf2);
        reg.eliminarLibro(inf2);
        reg.listarLibros();
        reg.obtenerTotal(inf1);
    }
}
