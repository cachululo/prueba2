
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
    
    
    public boolean agregarLibro(Libro libro) {
        if (listaLibros.add(libro)) {
            return true;
        } else {
            return false;
        }
    }
    
     public void listarLibros() {
        System.out.println("*********LISTA DE LIBROS*********");
        for (Libro libro : listaLibros) {
            System.out.println(libro.clasificacionLibro());
            System.out.println("*********************************");
        }
    }
    
     
     public boolean eliminarLibro(Libro libro){
         if (listaLibros.remove(libro)) {
             return true;             
         }else {
             return false;
         }
     }
     
//     public void obtenerTotal(Libro libro){
//        int total=0;
//         if (libro.getPrecioSinIVA()>0) {
//            total=total+libro.getPrecioSinIVA();
//         } else {
//             System.out.println("El total de los libros es: "+total);
//         }
         
       public void obtenerTotal(Libro libro) {
        int total = 0;
        if (libro.getPrecioSinIVA() > 0) {
            for (Libro libro1 : listaLibros) {
                total=libro.getPrecioSinIVA()+total;
            }
          
        } else {
            System.out.println("El total de los libros es: " + total);
        }
         
         
     }
//     public boolean librosCaros(Libro libro){
//         
//     }
       

    
    
}
