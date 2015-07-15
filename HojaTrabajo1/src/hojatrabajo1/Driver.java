package hojatrabajo1;

import java.util.Scanner;
public class Driver {
    public static void main (String[]args){
        int a = 0;
	System.out.println("Para realizar alguna accion con el radio ingrese el numero de la opcion deseada.");
	Scanner leer = new Scanner(System.in);
	Radio radio1= new RadioCarro();
	radio1.setEstado(false);

	boolean nEstado;
	String indicador;
	int banda;
	boolean ud;
	int pos;

	while (a == 0){
            nEstado = radio1.getEstado();
            if (nEstado==true){System.out.println("\nRADIO ENCENDIDO\n");}
            else if (nEstado==false){System.out.println("\nRADIO APAGADO\n");}

            System.out.println("1. On\n2. Cambiar AM o FM \n3. Cambiar emisora con dial\n4. Guardar emisora\n5. Cambiar emisora con boton\n6. Off\n7. Salir del programa\n\nNumero: ");
            String opcion = leer.nextLine();
		
            if (opcion.equals("1")){
		nEstado = true;
		radio1.setEstado(nEstado);
            }
            else if (opcion.equals("2")){
		System.out.println("e");
            }
            else if (opcion.equals("3")){
		System.out.println("e");
            }
            else if (opcion.equals("4")){
		System.out.println("e");
            }
            else if (opcion.equals("5")){
		System.out.println("e");
            }
            else if (opcion.equals("6")){
		nEstado = false;
		radio1.setEstado(nEstado);
            }
            else if (opcion.equals("7")){
		System.out.println("Gracias por utilizar nuestro programa de radio, que tenga buen dia.");
		a = 1;
            }
            else {
		System.out.println("\nERROR. La opcion ingresada no es valida, recuerde que solamente puede ingresar numeros de 1 a 7. Intente otra vez.\n");
            }
	}
		
    }

}
