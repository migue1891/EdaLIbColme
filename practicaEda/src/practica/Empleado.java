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
public class Empleado extends Persona {
    private String idEmpleado;
    private String Direccion;
    private int telefono;
    private int  nSS;
    private String turno;
    private float sueldo;

    public Empleado(String idEmpleado, String Direccion, int telefono, int nSS, String turno, float sueldo) {
        
        this.idEmpleado = idEmpleado;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.nSS = nSS;
        this.turno = turno;
        this.sueldo = sueldo;
    }

    public Empleado(String idEmpleado) {
        
        this.idEmpleado = idEmpleado;
    }
    
    

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getnSS() {
        return nSS;
    }

    public void setnSS(int nSS) {
        this.nSS = nSS;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    

}
