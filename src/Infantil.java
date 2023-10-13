/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Infantil extends Libro{
    private String edad;

    public Infantil() {
        super();
    }

    public Infantil(String edad, String titulo, int numeroPaginas, int precioSinIVA) {
        super(titulo, numeroPaginas, precioSinIVA);
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    

    @Override
    public String toString() {
        return super.toString()+" "+"Infantil{" + "edad=" + edad + '}';
    }

    @Override
    public String clasificacionLibro() {
       String clasificacion= "Infantil: "+super.getTitulo()+", "+super.getPrecioSinIVA()+" "+this.getEdad();
        return clasificacion;
    }
    
    
    
}
