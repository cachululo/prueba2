
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class RegistroLibro {
    ArrayList <Libro> listaLibros;
    

    public RegistroLibro() {
        listaLibros=new ArrayList<>();
    }
    
    public void listarLibros (){
        for (Libro libro : listaLibros) {
            System.out.println(libro);
            
        }
    }
    
//    public void agregarLibros(){
//        listaLibros.add(Libro libro);
//        
//    }
    
//    public void cantidadLibrosCaros(){
//        
//    }

    void add(Infantil inf1) {
        
    }

    void add(Tecnico tec1) {
        
    }
    
    
}
