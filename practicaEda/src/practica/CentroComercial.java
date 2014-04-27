/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;
import Libreria.SListMod;
import edalib.list.singlelink.SList;
import java.util.*;
/**
 *
 * @author Miguel
 */

public class CentroComercial<E> {
   
    private String Nombre;
    private String Direccion;
    private Tienda[] tiendas;
    private Empleado[] empleados;
    private ClienteStar[] clientes;
    private int puertasAcceso;
    private int salEmergencias;
    private int plazasGarage;
    
    public CentroComercial(String Nombre, String Direccion, int puertasAcceso, int salEmergencias, int plazasGarage, int tiend, int emp, int client) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.puertasAcceso = puertasAcceso;
        this.salEmergencias = salEmergencias;
        this.plazasGarage = plazasGarage;
        this.empleados = new Empleado[emp];
        this.clientes=new ClienteStar[client];
        this.tiendas=new Tienda[tiend];
    }

    public CentroComercial(int emp, int client, int tiend){
        this.empleados = new Empleado[emp];
        this.clientes=new ClienteStar[client];
        this.tiendas=new Tienda[tiend];
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Tienda[] getTiendas() {
        return tiendas;
    }

    public void setTiendas(Tienda[] tiendas) {
        this.tiendas = tiendas;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }
    public Empleado getEmpleadosIndex(int index) {
        return empleados[index];
    }
    public void setEmpeados(Empleado[] empeados) {
        this.empleados = empeados;
    }

    public ClienteStar[] getClientes() {
        return clientes;
    }

    public void setClientes(ClienteStar[] clientes) {
        this.clientes = clientes;
    }

    public int getPuertasAcceso() {
        return puertasAcceso;
    }

    public void setPuertasAcceso(int puertasAcceso) {
        this.puertasAcceso = puertasAcceso;
    }

    public int getSalEmergencias() {
        return salEmergencias;
    }

    public void setSalEmergencias(int salEmergencias) {
        this.salEmergencias = salEmergencias;
    }

    public int getPlazasGarage() {
        return plazasGarage;
    }

    public void setPlazasGarage(int plazasGarage) {
        this.plazasGarage = plazasGarage;
    }


    public Tienda buscarTienda(String tienda){
        Tienda tiendaSelec = new Tienda();

        for(int ii=0;ii<tiendas.length; ii++){
            if(tienda.equalsIgnoreCase(this.tiendas[ii].getNombre())){
                tiendaSelec=tiendas[ii];
                //Contemplar fallo de tecla del usuario
                mostrarDatosTienda(tiendaSelec);
                return tiendaSelec;
             }
        }
        
        return null;
    }
    public SListMod TiendtoSList(){
        SListMod<Tienda> list = new SListMod<Tienda>();
        for (Tienda tienda : this.tiendas) {
            list.addFirst(tienda);
        }
        return list;
    }
    
    public void mostrarDatosTienda(Tienda tiendaSelec){
           boolean bandera=false;
           Scanner sc = new Scanner(System.in);

                String respuesta="a";
                while(bandera==false){
                    System.out.println("¿Quieres ver los datos de la tienda "+ tiendaSelec.getNombre() +"? S/N");
                    respuesta= sc.nextLine();
                    if("S".equalsIgnoreCase(respuesta)||"N".equalsIgnoreCase(respuesta)){
                        bandera=true;
                    }
                }
                if(respuesta.equalsIgnoreCase("S")){
              
                    System.out.println(tiendaSelec.getIdTienda()+" "+tiendaSelec.getNombre());
                }else if(respuesta.equalsIgnoreCase("N")){System.out.println("No quieres ver la tienda seleccionada tienda");}
            
            
        }
    
    
    public Tienda[] buscarTiendasDeEmpleado(String nombre){
        Scanner sc = new Scanner(System.in);
        int contador =0;
        for(int i=0; i<this.tiendas.length;i++){
            for(int j=0;j<this.tiendas[i].getEmpleados().length;j++){
                Empleado[] emp = this.tiendas[i].getEmpleados();
                if(nombre.equalsIgnoreCase(emp[j].getNombre())){
                      contador++;
                }
            }
        }
       Tienda[] tiendas =new Tienda[contador];
       int contador2=0;
        for(int x=0; x<this.tiendas.length;x++){
            for(int k=0;k<this.tiendas[x].getEmpleados().length;k++){
                Empleado[] emp1 = this.tiendas[x].getEmpleados();
                if(nombre.equalsIgnoreCase(emp1[k].getNombre())){
                      tiendas[contador2]=this.tiendas[x];
                      contador2++;
                }
            }
        } 
        
        boolean bandera=false;
        String respuesta="a";
                while(bandera==false){
                    System.out.println("¿Quieres ver los datos de alguna de las tiendas donde trabaja "+ nombre +"? S/N");
                    respuesta= sc.nextLine();
                    if("S".equalsIgnoreCase(respuesta)||"N".equalsIgnoreCase(respuesta)){
                        bandera=true;
                    }
                }
   
                if(respuesta.equalsIgnoreCase("S")){
                    for (int k=0; k<tiendas.length;k++) {
                        System.out.println(tiendas[k].getNombre());
                        mostrarDatosTienda(tiendas[k]);
                    }
                }
        
        
        return tiendas;
    }

    public SListMod obtenerTiendasPorMarca(String marca){
        
        Scanner sc = new Scanner(System.in);
          SListMod<Tienda> tienda = new SListMod<Tienda>();
          for(int i=0; i<this.tiendas.length;i++){
            
             SListMod cat =tiendas[i].getCatalogos();
            for(int j=0;j<cat.getSize();j++){
                Catalogo catt=(Catalogo)cat.getAt(j);
                if(marca.equalsIgnoreCase(catt.getMarca())){
                    tienda.addLast(this.tiendas[i]);
                }
            }
            }
          boolean bandera=false;
        String respuesta="a";
          
        while(bandera==false){
                    System.out.println("¿Quieres ver los datos de alguna de las tiendas donde extiste la marca?"+marca +" S/N");
                    respuesta= sc.nextLine();
                    if("S".equalsIgnoreCase(respuesta)||"N".equalsIgnoreCase(respuesta)){
                        bandera=true;
                    }
                }
                if(respuesta.equalsIgnoreCase("S")){
                    for (int k=0; k<tienda.getSize();k++) {
                        Tienda tien=(Tienda) tienda.getAt(k);
                        System.out.println(tien.getNombre());
                        mostrarDatosTienda(tien);
                    }
                }
        
          return tienda;
    }
    
    public Empleado[] obtenerEmpleadosCentro(){

        
        return this.getEmpleados();
    }
    public SListMod obtenerTodosLosEmpleados(){
      
        SListMod<Empleado> listEmpleados = new SListMod<Empleado>();
    
        for(int i=0;i<this.getEmpleados().length;i++){
            listEmpleados.addLast(this.getEmpleadosIndex(i));
               
            }
        for(int j=0; j<this.getTiendas().length;j++){
            Empleado []emp=this.tiendas[j].getEmpleados();
        
            for(int x=0;x<emp.length;x++){
                listEmpleados.addLast(emp[x]);
            }
        }
        
        
        return listEmpleados;
    }
   
    public Empleado[] obtenerEmpleadosMayorSueldo(){
    
        SListMod  todosEmpleados = obtenerTodosLosEmpleados();
   
               E[] arr=(E[])todosEmpleados.toArray();
               Empleado[] todEmpleados=new Empleado[arr.length];
               for(int i=0; i<arr.length; i++){
               todEmpleados[i]=(Empleado) arr[i];    
               }
        Empleado[]empleadosAdinerados=new Empleado[5];
        Empleado aux;    
        int i, j = 0;
    for(i=0;i<todEmpleados.length-1;i++)
              for(j=0;j<todEmpleados.length-i-1;j++)
                   if(todEmpleados[j+1].getSueldo()>todEmpleados[j].getSueldo()){
                      aux=todEmpleados[j+1];
                      todEmpleados[j+1]=todEmpleados[j];
                      todEmpleados[j]=aux;
                   }
         for(int x=0; x<5; x++){
             empleadosAdinerados[x]=todEmpleados[x];
         }
        return empleadosAdinerados;
    }
}
//NOTA PARA ACABAR LA PRIMERA FASE LO UNICO QUE DEBEMOS ES COMENTAR Y OPTIMIZAR EL MODO EN LE QUE PREGUNTA AL USUARIO(AQUI NO DEBE ESTAR EN MI OPINION) AL MENOS MEJORARLO AQUI DENTRO;