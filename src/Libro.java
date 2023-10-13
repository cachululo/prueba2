/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julian
 */
public abstract class Libro implements ICalculable{
    protected String titulo;
    protected int numeroPaginas,precioSinIVA;

    public Libro() {
    }

    public Libro(String titulo, int numeroPaginas, int precioSinIVA) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.precioSinIVA = precioSinIVA;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(int precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", numeroPaginas=" + numeroPaginas + ", precioSinIVA=" + precioSinIVA + '}';
    }
    
    public abstract String clasificacionLibro();
    
    
    
}
