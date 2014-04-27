/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Libreria;

import edalib.list.singlelink.SList;
import edalib.list.singlelink.SNode;
import practica.Empleado;
import practica.Producto;
import practica.Tienda;


/**
 *
 * @author Miguel
 */
public class SListMod<E> extends SList<E>{
    
    public void showDatosEmpleado() {
		 
       SNode<E> aux= this.getFirstNode();
                int contador=0;
                while(aux!=null){
                    Empleado emp = (Empleado) aux.getElement();
                     System.out.println(contador+" "+ emp.getNombre());
                     aux=aux.nextNode;
                     contador++;
                }
                
                
	}
     public void showDatosTienda() {
       
       SNode<E> aux= this.getFirstNode();
                int contador=0;
                while(aux!=null){
                    Tienda emp = (Tienda) aux.getElement();
                     System.out.println(contador+" "+ emp.getNombre());
                     aux=aux.nextNode;
                     contador++;
                }
                
                
	}
    public void showDatosProducto(){
     
       SNode<E> aux= this.getFirstNode();
                int contador=0;
                while(aux!=null){
                     Producto emp = (Producto) aux.getElement();
                     System.out.print(contador+" "+ emp.getNombre());
                     System.out.print("Precio "+ emp.getPrecio());
                     aux=aux.nextNode;
                     contador++;
                     System.out.print("\n");
                }
    
    }
    public E[] toArray(){
       
        E[] arr= (E[]) new Object[this.getSize()];
        SNode<E> aux = this.getFirstNode();
        int contador=0;
        while(aux!=null){
            arr[contador]=aux.getElement();
            
            aux=aux.nextNode;
            contador++;
        }
        
        return arr;
    
    }
}
