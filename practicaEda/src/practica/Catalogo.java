/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

/**
 *
 * @author Miguel
 */
public class Catalogo {
    private int idTipo;
    private String marca;
    private String Nombre; 

    public Catalogo(int idTipo, String marca, String Nombre) {
        this.idTipo = idTipo;
        this.marca = marca;
        this.Nombre = Nombre;
    }

    public Catalogo(int idTipo) {
        this.idTipo=idTipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
