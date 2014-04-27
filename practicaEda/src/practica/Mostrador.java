package practica;

import Libreria.SListMod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguelgt
 */
public class Mostrador {
    int idMostrador;
    SListMod<Estanteria> estanterias = new SListMod();
    SListMod<Perchero> percheros = new SListMod();

    public Mostrador(int idMostrador) {
        this.idMostrador = idMostrador;
    }
    
    //Con los productos del mismo tipo que nos lleguen aqui vamos a crear un mostrador
    //Vamos a crear los multiplo pares en estanterias y los impares en percheros
    public Mostrador nuevoMostrador(SListMod<ProductoRopa> productos){
        
        int contador=0;
        while(productos.getSize()>0){
            //Cogemos el primer producto de la lista
            ProductoRopa nProduc= productos.getFirst();
            //Y lo borramos
            productos.removeFirst();
            //Comprobamos que haya mas productos en la cola
            if(productos.getSize()>0){
            //Si es par creamos estanteria
                if((contador%2)==0){
                    Estanteria estant = new Estanteria();
                    //Metemos el primer producto de esta estanteria
                    estant.push(nProduc);
                    //Este bucle nos sirve para insertar los productos en la estanteria y borrarlos de la lista.
                    //Este contador ira recorriendo la lista siempre de principio a fin hasta que llegue al tamaño de la lista de productos
                    int contadorInt=0;
                    while(contadorInt<=productos.getSize()){   
                        //Compara que el producto actual sea igual a nProduc
                        if(productos.getAt(contadorInt).getColor().equalsIgnoreCase(nProduc.getColor())){
                            //lo inserta en la estanteria y lo borra de la lista productos
                            estant.push(productos.getAt(contadorInt));
                            productos.removeAt(contadorInt);
                            //Esta es la clave se esta bucle. Cada vez que borremos un elemento volveremos a recorrerlo desde el principio
                            contadorInt=0;
                        }
                        else{
                            //Solo se suma a contador si no eliminamos elemento asi cuando llegamos sabemos que no hay mas elementos en la lista que sean del mismo color.
                            contadorInt++;
                        }
                    
                    }
                    estant.ordenarEstanteria();
                    this.estanterias.addLast(estant);
                }
                //Aqui vamos ha hacer practicamrente lo mismo que arriba pero para percheros
                else{
                    Perchero perch = new Perchero();
                    perch.enqueue(nProduc);
                    int contadorInt=0;
                    
                    while(contadorInt<=productos.getSize()){
                        if(productos.getAt(contadorInt).getColor().equalsIgnoreCase(nProduc.getColor())){
                            perch.enqueue(productos.getAt(contadorInt));
                            contadorInt=0;
                        }else{contadorInt++;}
                    }
                    perch.ordenarPerchero();
                    this.percheros.addLast(perch);
                }
            }//Si no hay mas lo metemos en una estanteria suelto
                
            else{
                Estanteria estante = new Estanteria();
                estante.push(nProduc);
                this.estanterias.addLast(estante);
            }
            contador++;
        }
        
    return this;
    }
    
    //FALTA EL METODO IMPRIMIR MOSTRADOR
    public void imprimiMostrador(){}
    
}
