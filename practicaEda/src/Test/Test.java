package Test;

import Libreria.SListMod;
import edalib.list.singlelink.SList;
import edalib.list.singlelink.SNode;
import java.util.Scanner;
import practica.Catalogo;
import practica.CentroComercial;
import practica.ClienteStar;
import practica.Empleado;
import practica.EmpleadoCentro;
import practica.EmpleadoTienda;
import practica.Producto;
import practica.ProductoComprado;
import practica.Tienda;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */

public class Test<E> extends SList{
    
    protected CentroComercial cc; 
    
    public CentroComercial generarCentroComercial(){
        
       
        //Creamos empleados del centro
        EmpleadoCentro empCentro1=new EmpleadoCentro("CC-001");
        EmpleadoCentro empCentro2=new EmpleadoCentro("CC-002");
        EmpleadoCentro empCentro3=new EmpleadoCentro("CC-003");
        EmpleadoCentro empCentro4=new EmpleadoCentro("CC-004");
        EmpleadoCentro empCentro5=new EmpleadoCentro("CC-005");
        EmpleadoCentro empCentro6=new EmpleadoCentro("CC-006");
        EmpleadoCentro empCentro7=new EmpleadoCentro("CC-007");
        EmpleadoCentro empCentro8=new EmpleadoCentro("CC-008");
        //Este array servira para guardar todos los empleados del centro
        EmpleadoCentro [] empleados = new EmpleadoCentro[8];
        //Les damos un nombre.
        empCentro1.setNombre("Juan");
        empCentro2.setNombre("Ana");
        empCentro3.setNombre("Maria");
        empCentro4.setNombre("Nieves");
        empCentro5.setNombre("Emilio");
        empCentro6.setNombre("Pepe");
        empCentro7.setNombre("Antonio");
        empCentro8.setNombre("Laura");
       
        //Generamos dos empleados para cada tienda, tendremos 4 tiendas. Tambien un array donde guardas cada grupo de empleados
        EmpleadoTienda[] empleadosTien1 = new EmpleadoTienda[2];
        EmpleadoTienda empTiend11=new EmpleadoTienda("T-001");
        EmpleadoTienda empTiend12=new EmpleadoTienda("T-002");
        
        EmpleadoTienda[] empleadosTien2 = new EmpleadoTienda[2];
        EmpleadoTienda empTiend21=new EmpleadoTienda("T-003");
        EmpleadoTienda empTiend22=new EmpleadoTienda("T-004");
        
        
        EmpleadoTienda[] empleadosTien3 = new EmpleadoTienda[2];
        EmpleadoTienda empTiend31=new EmpleadoTienda("T-005");
        EmpleadoTienda empTiend32=new EmpleadoTienda("T-006");
        
        EmpleadoTienda[] empleadosTien4 = new EmpleadoTienda[2];
        EmpleadoTienda empTiend41=new EmpleadoTienda("T-007");
        EmpleadoTienda empTiend42=new EmpleadoTienda("T-008");
        
        
        //Cada tienda va a tener 3 catalogos 
        SListMod catalogo1 = new SListMod();
        SListMod catalogo2 = new SListMod();
        SListMod catalogo3 = new SListMod();
        SListMod catalogo4 = new SListMod();
        
        Catalogo catalogo11=new Catalogo(1);
        Catalogo catalogo12=new Catalogo(2);
        Catalogo catalogo13=new Catalogo(3);
        
        Catalogo catalogo21=new Catalogo(4);
        Catalogo catalogo22=new Catalogo(5);
        Catalogo catalogo23=new Catalogo(6);
        
        Catalogo catalogo31=new Catalogo(7);
        Catalogo catalogo32=new Catalogo(8);
        Catalogo catalogo33=new Catalogo(9);
        
        Catalogo catalogo41=new Catalogo(10);
        Catalogo catalogo42=new Catalogo(11);
        Catalogo catalogo43=new Catalogo(12);
                
        catalogo11.setMarca("Nike");
        catalogo12.setMarca("Adidas");
        catalogo13.setMarca("Rebook");
        catalogo21.setMarca("Nike");
        catalogo22.setMarca("Puma");
        catalogo23.setMarca("Volcom");
        catalogo31.setMarca("Polo");
        catalogo32.setMarca("Lacoste");
        catalogo33.setMarca("Adidas");
        catalogo41.setMarca("Polo");
        catalogo42.setMarca("Viento");
        catalogo43.setMarca("Rebook");
     
        catalogo1.addLast(catalogo11);
        catalogo1.addLast(catalogo12);
        catalogo1.addLast(catalogo13);
        
        catalogo2.addLast(catalogo21);
        catalogo2.addLast(catalogo22);
        catalogo2.addLast(catalogo23);
        
        catalogo3.addLast(catalogo31);
        catalogo3.addLast(catalogo32);
        catalogo3.addLast(catalogo33);
               
        catalogo4.addLast(catalogo41);
        catalogo4.addLast(catalogo42);
        catalogo4.addLast(catalogo43);
        
        Producto prod11 = new Producto(1);
        Producto prod12 = new Producto(2);
        Producto prod13 = new Producto(3);
        Producto prod21 = new Producto(4);
        Producto prod22 = new Producto(5);
        Producto prod23 = new Producto(6);
        Producto prod31 = new Producto(7);
        Producto prod32 = new Producto(8);
        Producto prod33 = new Producto(9);
        Producto prod41 = new Producto(10);
        Producto prod42 = new Producto(11);
        Producto prod43 = new Producto(12);
        
        
        prod11.setNombre("Camiseta nike");
        prod12.setNombre("Camiseta Adidas");
        prod13.setNombre("Pantalon Rebook");
        prod21.setNombre("Camiseta Nike Sport");
        prod22.setNombre("Camiseta Puma Sport");
        prod23.setNombre("Pantalon Volcom");
        prod31.setNombre("Camiseta Polo");
        prod32.setNombre("Camiseta Lacoste Sport");
        prod33.setNombre("Pantalon Adidas");
        prod41.setNombre("Camiseta Polo");
        prod42.setNombre("Botines Viento");
        prod43.setNombre("Botines Rebook");
      
        prod11.setIdTipo(catalogo11.getIdTipo());
        prod12.setIdTipo(catalogo12.getIdTipo());
        prod13.setIdTipo(catalogo13.getIdTipo());
        prod21.setIdTipo(catalogo21.getIdTipo());
        prod22.setIdTipo(catalogo22.getIdTipo());
        prod23.setIdTipo(catalogo23.getIdTipo());
        prod31.setIdTipo(catalogo31.getIdTipo());
        prod32.setIdTipo(catalogo32.getIdTipo());
        prod33.setIdTipo(catalogo33.getIdTipo());
        prod41.setIdTipo(catalogo41.getIdTipo());
        prod42.setIdTipo(catalogo42.getIdTipo());
        prod43.setIdTipo(catalogo43.getIdTipo());       
       
        prod11.setPrecio(20);
        prod12.setPrecio(200);
        prod13.setPrecio(250);
        prod21.setPrecio(40);
        prod22.setPrecio(50);
        prod23.setPrecio(30);
        prod31.setPrecio(90);
        prod32.setPrecio(209);
        prod33.setPrecio(22);
        prod41.setPrecio(120);
        prod42.setPrecio(120);
        prod43.setPrecio(180);
        
       SListMod prodTien1 = new SListMod();
        SListMod prodTien2 = new SListMod();
        SListMod prodTien3 = new SListMod();
        SListMod prodTien4 = new SListMod();
        
        prodTien1.addLast(prod11);
        prodTien1.addLast(prod12);
        prodTien1.addLast(prod13);
        
        prodTien2.addLast(prod21);
        prodTien2.addLast(prod22);
        prodTien2.addLast(prod23);
        
        prodTien3.addLast(prod31);
        prodTien3.addLast(prod32);
        prodTien3.addLast(prod33);
        
        prodTien4.addLast(prod41);
        prodTien4.addLast(prod42);
        prodTien4.addLast(prod43);
                
        
        Tienda tiendas[] = new Tienda[4];
        
        Tienda tienda1=new Tienda();
        Tienda tienda2=new Tienda();
        Tienda tienda3=new Tienda();
        Tienda tienda4=new Tienda();
        
        tienda1.setNombre("deportesZ");
        tienda1.setCatalogos(catalogo1);
        tienda1.setEmpleados(empleadosTien1);
        tienda1.setStock(prodTien1);
        
        tienda2.setNombre("deportesk");
        tienda2.setAlquiler(1000);
        tienda2.setCatalogos(catalogo2);
        tienda2.setEmpleados(empleadosTien2);
        tienda2.setStock(prodTien2);
        
        tienda3.setNombre("elegant");
        tienda3.setAlquiler(3000);
        tienda3.setCatalogos(catalogo3);
        tienda3.setEmpleados(empleadosTien3);
        tienda3.setStock(prodTien3);
        
        tienda4.setNombre("sport");
        tienda4.setAlquiler(2000);
        tienda4.setCatalogos(catalogo4);
        tienda4.setEmpleados(empleadosTien4);
        tienda4.setStock(prodTien4);
        
        tiendas[0]=tienda1;
        tiendas[1]=tienda2;
        tiendas[2]=tienda3;
        tiendas[3]=tienda4;
        
        empTiend11.setNombre("Escandalo");
        empTiend12.setNombre("Catillo");
        
        empTiend21.setNombre("Maliea");
        empTiend22.setNombre("Olga");
        
        empTiend31.setNombre("Catillo");
        empTiend32.setNombre("Tumulto");
        
        empTiend41.setNombre("Escandalo");
        empTiend42.setNombre("Casto");
        
        empTiend11.getTiendas().addFirst(tienda1);
        empTiend11.getTiendas().addFirst(tienda2);
        empleadosTien1[0] =empTiend11;
        empleadosTien1[1]=empTiend12;
        
        empleadosTien2[0]=empTiend21;
        empleadosTien2[1]=empTiend22;
        
        empleadosTien3[0]=empTiend31;
        empleadosTien3[1]=empTiend32;
        
        empleadosTien4[0]=empTiend41;
        
        empleadosTien4[1]=empTiend42;
        
        
        
        empCentro1.setSueldo(1000);
        empCentro2.setSueldo(1200);
        empCentro3.setSueldo(3400);
        empCentro4.setSueldo(1300);
        empCentro5.setSueldo(1100);
        empCentro6.setSueldo(7000);
        empCentro7.setSueldo(2000);
        empCentro8.setSueldo(4000);
        
           
        empleados[0]=empCentro1;
        empleados[1]=empCentro2;
        empleados[2]=empCentro3;
        empleados[3]=empCentro4;
        empleados[4]=empCentro5;
        empleados[5]=empCentro6;
        empleados[6]=empCentro7;
        empleados[7]=empCentro8;

        
        CentroComercial centro = new CentroComercial(8,4,4);
        centro.setNombre("Buenos Dias");
        centro.setTiendas(tiendas);
        centro.setEmpeados(empleados);
       
        return centro;
    }
   public  void comprobarCentroComercial(){
       CentroComercial centro = generarCentroComercial();
       Scanner sc = new Scanner(System.in);
       ClienteStar clien = new ClienteStar();
       Tienda tiendBusc =  centro.buscarTienda("deportesZ");
       centro.buscarTiendasDeEmpleado("Escandalo");
       
       SListMod listaEmpleados = centro.obtenerTodosLosEmpleados();
       listaEmpleados.showDatosEmpleado();
       EmpleadoTienda escan = (EmpleadoTienda)listaEmpleados.getAt(8);
       System.out.println("Las tiendas donde trabaja escandalo son:");
       escan.getTiendas().showDatosTienda();
     
         Empleado[] ricos=centro.obtenerEmpleadosMayorSueldo();
       System.out.println("Los ricos sonzzzzz: ");
       for(int j=0;j<ricos.length;j++){
            System.out.println(ricos[j].getNombre());
       }
       centro.obtenerTiendasPorMarca("nike");
       System.out.println("El empleado de la posicion 2 es: "+centro.getEmpleadosIndex(2).getNombre());
       System.out.println("Bienvenido al Centro Comercial: " + centro.getNombre());
     
       boolean recorrerCentro=true;
       while(recorrerCentro==true){
           
            System.out.println("Escribe una de las siguientes tiendas para acceder a ella");
            SListMod tienda = centro.TiendtoSList();
            tienda.showDatosTienda();

            String nomTienda ="";
            boolean bandera = false;
            
        while(bandera==false){
            
            nomTienda=sc.next();
            
            for(int i=0; i<tienda.getSize();i++){
            
                Tienda tiendAct =(Tienda) tienda.getAt(i);
                
                if(nomTienda.equalsIgnoreCase(tiendAct.getNombre())){
                    bandera=true;
                }
            }
            if(bandera==false){System.out.println("Esta tienda no existe escribe bien por favor");}
        }
        Tienda tiendaSelec=  centro.buscarTienda(nomTienda);
        System.out.println("¿Quieres ver los productos?S/N");
            
            if(sc.next().equalsIgnoreCase("S")){

                 SListMod productos = tiendaSelec.getProductos();
                 productos.showDatosProducto();
                 System.out.println("Si quieres comprar alguno introduce el numero que precede al nombre");
                 boolean bandera2=false;
                 Producto prodSelec = null;
                 while(bandera2==false){
                    int index=sc.nextInt();
                    if(index<productos.getSize()){
                      prodSelec=  tiendaSelec.getProductoAt(index);
                        bandera2=true;

                    }
                 }                                               
                 clien.pagar(prodSelec.getPrecio());
                 clien.insertarComprado(prodSelec);
                 System.out.print("Los productos comprados son: ");
            }
        }
  }
  
   public void test1(){
       cc=generarCentroComercial();
       comprobarCentroComercial();
   }
   public static void main(String[] args) { 
            Test t = new Test();    
            t.test1(); 
    } 
       
    
}
