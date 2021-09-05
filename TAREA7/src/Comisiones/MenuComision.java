/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comisiones;

import Negocio.CatalogoEmpleadosImpl;
import Negocio.CatalogoNegocio;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class MenuComision {
    
    CatalogoNegocio Catalogo = new CatalogoNegocio();
    private static final CatalogoEmpleadosImpl Cata = new CatalogoEmpleadosImpl();
    private static final String nombreArchivo = "C:\\Users\\Usuario\\Desktop\\Semana 7\\Textos\\Comision.txt";
    
    public void Menu(){
    Scanner Lector=new Scanner(System.in);
        String op = "";
        int op2 = 0;
        
        do {      
        System.out.println("1 Archivo\n"
                + "2 Desea ingresar datos\n"
                + "3 Venta del mayor y menor\n"
                + "4 Total de venta\n"
                + "5 Desea modificar\n"
                + "6 Desea Buscarel dato\n"
                + "7 Desea ver la Tabla\n"
                + "8 Desea Salir del programa ");
        System.out.println("Elije una opcion "); op=Lector.nextLine();
        
        switch(op){
             case "1":
                Cata.IniciarArchivo(nombreArchivo);
                break;
            case "2":
                Catalogo.AgregarInformacion();
                Cata.CargarInformacion(nombreArchivo);
                Cata.Calculos();
                break;
            case "3":
                Cata.VentaMayor();
                System.out.println("\n");
                Cata.VentaMenor();
                break;
            case "4":
                Cata.VentaMayorTotal();
                break;
            case "5":
               Cata.Editar();
                break;
            case "6":
                Cata.Buscar();
                break;
            case "7":
                Cata.ImprimirInformacion();
                break;
          }
        } while(!op.equals("8"));
        
        System.out.println("Quieres regresar al menu ?\n"
                + "9 Salir\n"
                + "1 Menu");
        System.out.println("Opcion: "); op2 = Lector.nextInt();
         
        if (op2==9) {
            System.exit(0);
        }
        if (op2==1) {
            Menu();
        }
    }
    
}
