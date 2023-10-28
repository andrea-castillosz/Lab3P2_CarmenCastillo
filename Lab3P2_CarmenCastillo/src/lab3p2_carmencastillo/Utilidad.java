/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_carmencastillo;

/**
 *
 * @author casti
 */
public class Utilidad extends Aplicaciones{
    
    String catergoria;

    public Utilidad() {
        
    }


    public Utilidad(String catergoriaN, String nombreN, String desarrolladorN, double precioN, boolean estadoN, double ratingN, int descargasN) {
        super(nombreN, desarrolladorN, precioN, estadoN, ratingN, descargasN);
        this.catergoria = catergoriaN;
    }
    
    

    public String getCatergoria() {
        return catergoria;
    }

    public void setCatergoria(String catergoria) {
        this.catergoria = catergoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDescargas() {
        return descargas;
    }

    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }

    @Override
    public String toString() {
        return " Utilidad\n" + "Nombre: " + nombre + "\nDesarrollador: " + desarrollador + "\nPrecio: " + precio + "\nEstado: " + estado + "\nRating: " + rating + "\nDescargas: " + descargas + "\n" + "Catergoria: " + catergoria + "\n";
    }

    
    
    
}
