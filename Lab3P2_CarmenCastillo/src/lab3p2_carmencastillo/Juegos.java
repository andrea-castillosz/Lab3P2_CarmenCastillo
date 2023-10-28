/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_carmencastillo;

/**
 *
 * @author casti
 */
public class Juegos extends Aplicaciones{
    
    int edad;

    public Juegos() {
        
    }

    public Juegos(int edad) {
        this.edad = edad;
    }

    public Juegos(int edadN, String nombreN, String desarrolladorN, double precioN, boolean estadoN, double ratingN, int descargasN) {
        super(nombreN, desarrolladorN, precioN, estadoN, ratingN, descargasN);
        this.edad = edadN;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
        return "Juegos\n" + "Nombre: " + nombre + "\nDesarrollador: " + desarrollador + "\nPrecio: " + precio + "\nEstado: " + estado + "\nRating: " + rating + "\nDescargas: " + descargas + "\n" +"Edad: " + edad + "\n";
    }
    
    
    
}
