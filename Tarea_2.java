import java.util.Scanner;

public class Tarea_2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner entrada = new Scanner(System.in);
        
        // Declarar una variable para almacenar la respuesta del usuario sobre si desea continuar
        char deseaContinuar;
        
        // Iniciar un bucle do-while para permitir múltiples operaciones hasta que el usuario decida salir
        do {
            // Solicitar al usuario que ingrese el primer numero
            System.out.println("Ingrese un numero:");
            int num1;
            // Verificar si la entrada del usuario es un numero entero
            while (!entrada.hasNextInt()) {
                System.out.println("Ingrese un numero valido:");
                entrada.next(); // Limpiar el buffer del Scanner
            }
            // Almacenar el primer número ingresado por el usuario
            num1 = entrada.nextInt();
            
            // Solicitar al usuario que ingrese el segundo numero
            System.out.println("Ingrese otro numero:");
            int num2;
            // Verificar si la entrada del usuario es un numero entero
            while (!entrada.hasNextInt()) {
                System.out.println("Ingrese otro numero valido:");
                entrada.next(); // Limpiar el buffer del Scanner
            }
            // Almacenar el segundo numero ingresado por el usuario
            num2 = entrada.nextInt();
            
            // Solicitar al usuario que ingrese la operación a realizar (+, -, *, /)
            System.out.println("Ingrese la operacion que desea realizar (+, -, *, /):");
            char operacion = entrada.next().charAt(0);
            float resultado; // Declarar una variable para almacenar el resultado de la operación
            
            // Realizar la operación solicitada por el usuario utilizando un switch-case
            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;
                case '/':
                    // Verificar si el segundo número es cero para evitar la división por cero
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        resultado = (float) num1 / num2; // Realizar la division y convertir el resultado a float
                        System.out.println("El resultado de la division es: " + resultado);
                    }
                    break;
                default:
                    System.out.println("Operacion no valida");
            }
            
            // Solicitar al usuario si desea realizar otra operación
            System.out.println("\n Para volver a realizar otra operacion presione 's'");
            deseaContinuar = entrada.next().charAt(0);
        } while (deseaContinuar == 's'); // Continuar el bucle si el usuario presiona 's'
        
        // Cerrar el objeto Scanner para liberar recursos
        entrada.close();
    }
}