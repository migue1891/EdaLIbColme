/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

import Libreria.SListMod;

/**
 *
 * @author Miguel
 */
public class EmpleadoTienda extends Empleado{
    
    private String status;
    private SListMod<Tienda> tiendas= new SListMod<Tienda>();

    public EmpleadoTienda(String idEmpleado) {
        super(idEmpleado);
    }
    
    
    public EmpleadoTienda(String idEmpleado, String status) {
        super(idEmpleado);
        if("jefe de tienda".equalsIgnoreCase(status)||"staff".equalsIgnoreCase(status)){
        this.status=status;
        }else{System.out.println("No es una labor correcta");}
    }

    public EmpleadoTienda(String status, String idEmpleado, String Direccion, int telefono, int nSS, String turno, float sueldo) {
        super(idEmpleado, Direccion, telefono, nSS, turno, sueldo);
        if("jefe de tienda".equalsIgnoreCase(status)||"staff".equalsIgnoreCase(status)){
        this.status=status;
        }else{System.out.println("No es una labor correcta");}
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SListMod getTiendas() {
        return tiendas;
    }

    public void setTiendas(SListMod tienda) {
        this.tiendas = tiendas;
    }
    
           
    
    
    
    
    
    
}
