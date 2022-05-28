package modularidads;
import java.util.Scanner;//Importamos libreria para poder leer teclado
public class ModularidadS {

   
    public static void main(String[] args) {
        // Realiza Alan Angoa Avila
        
        System.out.println("*********************************");
        System.out.println("* MODULARIDAD CON METODO SIMPLE *");//Impresión de pantalla (TITULO)
        System.out.println("*********************************");
        System.out.println(" ");
        
        suma();//llamado al metodo suma
        resta();//llamado al metodo resta
    }
    
    public static void suma(){// Modulo simple llamado suma
        
    int numero1, numero2, resultado; //Declaramos 3 variables de tipo entero
    
    Scanner leer = new Scanner(System.in);//Declaración de la variable Scanner
    System.out.println("\t+++++++++++");
    System.out.println("\t+  SUMA   +");//Impresión de pantalla TITULO
    System.out.println("\t+++++++++++");
    
    //Datos de entrada
    System.out.println("DIGITA TU PRIMER NÚMERO");//Impresión de pantalla para que el usuario responda
    numero1 = leer.nextInt();//Instrucción para leer variables declarada número1
    
    System.out.println("DIGITA TU PRIMER NÚMERO");
    numero2 = leer.nextInt();//Instrucción para leer variables declarada número2
    
    System.out.println(" ");
    
    //Proceso de la operación
    resultado = numero1 + numero2;
    
    //Datos de salida
    System.out.println("El resultado de la suma es: "+resultado);//Impresión de pantalla para mostrar resultados
    
    System.out.println(" ");
    
    }
    
    public static void resta(){//Modulo simple llamado resta
    int numero1, numero2, resultado;
    
    Scanner leer = new Scanner(System.in);
    System.out.println("\t++++++++++++");
    System.out.println("\t+  RESTA   +");
    System.out.println("\t++++++++++++");
    
    System.out.println("DIGITA TU PRIMER NÚMERO");
    numero1 = leer.nextInt();
    
    System.out.println("DIGITA TU PRIMER NÚMERO");
    numero2 = leer.nextInt();
    
    System.out.println(" ");
    
    resultado = numero1 - numero2;
    System.out.println("El resultado de la resta es: "+resultado);
    
    System.out.println(" ");
    System.out.println("¡Excelente día, esperó que sea el programa que buscabas");
    }
   
    
}
