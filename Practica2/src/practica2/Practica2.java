/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre, serial;
        int opc=0, codigo=0, i=0;
        Dispositivo a[] = new Dispositivo[20];
        while (opc != 5)
        {
            System.out.println(
                    "-MENU-\n1.Registrar objetos\n2.Mostrar objetos\n3.Capturar el Objeto2\n4.Mostrar el Objeto2\n5.Salir\nSelecciona opcion:");
            opc = lector.nextInt();
            switch (opc)
            {
                case 1:
                    a[i] = new Dispositivo();
                    System.out.println("Ingrese el nombre del dispositivo"+i+":");
                    nombre= lector.next();
                    System.out.println("Ingerese el serial del dispositivo:");
                    serial = lector.next();
                    System.out.println("Ingerese el codigo del dispositivo:");
                    codigo = lector.nextInt();
                    a[i].setCodigo(codigo);
                    a[i].setNombre(nombre);
                    a[i].setSerial(serial);
                    i++;
                    
                   
                    
       
                    break;
                case 2:
                    for(i=0;i<a.length;i++){
                    nombre = a[i].getNombre();
                    codigo = a[i].getCodigo();
                    serial = a[i].getSerial();
                    System.out.println("El nombre del objeto en la posicion"+i+"es:"+nombre);
                    System.out.println("El codigo del objeto en la posicion"+i+"es:"+codigo);
                    System.out.println("El serial del objeto en la posicion"+i+"es:"+serial);
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                    break;
            }

        }
    }
    
}
