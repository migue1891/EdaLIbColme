/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

import Libreria.SListMod;
import edalib.list.singlelink.SQueue;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Perchero extends SQueue{
   
    
    public  ProductoRopa seleccionarProducto() {
     Scanner sc = new Scanner(System.in);
     ProductoRopa prodSelec=null;
     boolean bandera=false;
     while(bandera==false){
     ProductoRopa actual = (ProductoRopa) this.dequeue();
     System.out.println();
     }
          return prodSelec;

    }
    
    public void ordenarPerchero(){
  
        SListMod listDesd = new SListMod();
        
        while(this.getSize()>0){
            ProductoRopa prodAct = (ProductoRopa) this.dequeue();
            listDesd.addLast(prodAct);
        }
        while(listDesd.getSize()>0){
            int contador2=0;
            
             while(contador2<this.getSize()){
                ProductoRopa prodAct=(ProductoRopa)listDesd.getAt(contador2);
               if(prodAct.getTalla()=='S'||prodAct.getTalla()=='s'){
                        this.enqueue(prodAct);
                        contador2=0;
                    }

                else{contador2++;}
            }
                contador2=0;
           while(contador2<this.getSize()){
                ProductoRopa prodAct=(ProductoRopa)listDesd.getAt(contador2);
               if(prodAct.getTalla()=='M'||prodAct.getTalla()=='m'){
                        this.enqueue(prodAct);
                        contador2=0;
                    }

                else{contador2++;}
            }  
            while(contador2<this.getSize()){
                ProductoRopa prodAct=(ProductoRopa)listDesd.getAt(contador2);
               if(prodAct.getTalla()=='L'||prodAct.getTalla()=='l'){
                        this.enqueue(prodAct);
                        contador2=0;
                    }

                else{contador2++;}
            }
       }
          //       IMPLEMENTACION CON EL METODO DE LA BURBUJA
//       ProductoRopa[] arrProd = new ProductoRopa[this.getSize()];
//       for(int i=0;i<this.getSize();i++){
//            arrProd[i]=(ProductoRopa) this.dequeue();
//           
//       }
//       ProductoRopa aux;
//       //Usamos el metodo de la burbuja para ordenar por tallas
//       for(int i=0;i<arrProd.length-1;i++){
//              for(int j=0;j<arrProd.length-i-1;j++){
//                   if(arrProd[j+1].getTalla()>arrProd[j].getTalla()){
//                      aux=arrProd[j+1];
//                      arrProd[j+1]=arrProd[j];
//                      arrProd[j]=aux;
//                   }
//               }
//        }
//        for (ProductoRopa arrProd1 : arrProd) {
//            this.enqueue(arrProd1);
//        } 
            
        }
        
    
    
    

//        
    }
    

