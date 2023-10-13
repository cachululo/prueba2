/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julian
 */
public class Tecnico extends Libro{
    
    private String materialExtra;

    public Tecnico() {
        super();
    }

    public Tecnico(String materialExtra, String titulo, int numeroPaginas, int precioSinIVA) {
        super(titulo, numeroPaginas, precioSinIVA);
        this.materialExtra = materialExtra;
    }

    public String getMaterialExtra() {
        return materialExtra;
    }

    public void setMaterialExtra(String materialExtra) {
        this.materialExtra = materialExtra;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Tecnico{" + "materialExtra=" + materialExtra + '}';
    }

    @Override
    public String clasificacionLibro() {
        String clasificacion= "Tecnico: "+super.getTitulo()+", $"+(super.getPrecioSinIVA()*ICalculable.descuentoLibroTecnico)*ICalculable.IVA;
        return clasificacion;
    }
    
    
    
    
}
