import java.util.Scanner;

/**
 * calculadora
 */
public class calculadora {

    //Se verifica si la operacion ingresada por consola contiene letras
    static boolean verificar(String operacion){
        boolean valor=false;
        int control=0;
        char caracter;
        //Se recorre el String el cual contiene la operacion a realizar
        for (int i = 0; i < operacion.length(); i++) {
            caracter = operacion.charAt(i);
            //Se va preguntando caracter por caracter hasta que alguno sea una letra o numero
            if (Character.isDigit(caracter)) {
                control=0;
            } else if (Character.isLetter(caracter)){
                control=control+1;
            }
        }
        if (control > 0) {
            valor = false;
        } else {
            valor = true;
        }
        return valor;
    }

    static double tipoM(String operacion){
        char resultado=' ';
        double n1=0;
        double n2=0;
        double respuesta=0;
        String mate1="", mate2="";
        int bandera=0;
        //Se pregunta si la variable no contiene elementos
        if (operacion.isEmpty()) {
            System.out.println("No hay ninguna operacion por resolver");
            return respuesta;
        } else {
            //Por aca hacemos uso de la funcion verificar para saber si la operacion a realizar es valida
            if (verificar(operacion) == true) {
                //Se recorre caracter por caracter hasta dar con el operador, permitiendo asi dividir los operandos
                for (int i = 0; i < operacion.length(); i++) {
                    char operador = operacion.charAt(i);
                    //Preguntamos que tipo de operacion se va a realizar y la guardamos
                    if (operador == '+' | operador == '-' | operador == '/' | operador == '*' | operador == '%') {
                        //Validamos que no estemos en el primer elemento de la operacion para poder dar paso a numeros negativos
                        if (i != 0) {
                            bandera=i;
                            resultado = operador;
                            for (int j = i+1; j < operacion.length(); j++) {
                                operador = operacion.charAt(j);
                                mate2 = mate2.concat(String.valueOf(operador));
                            }
                            //Rompemos el for para no volver a recorrer el String y asi evitar duplicaciones
                            break;
                        } else {
                            if (bandera == 0) {
                                mate1 = mate1.concat(String.valueOf(operador));
                            }
                        }
                        //Hacemos uso de una bandera, para saber que ya se a completado el primer operando y asi pasar a llenar el segundo
                    } else {
                        if (bandera == 0) {
                            mate1 = mate1.concat(String.valueOf(operador));
                        }
                    }
                }
                //Se pasa los String a Double para poder trabajar con ellos
                //System.out.println(mate1);
                //System.out.println(mate2);
                n1 = Double.parseDouble(mate1);
                n2 = Double.parseDouble(mate2);
                //Segun la operacion previamente almacenada, se procede a resolver
                switch (resultado) {
                    case '+':
                        respuesta = n1 + n2;
                        return respuesta;
                    
                    case '-':
                        respuesta = n1 - n2;
                        return respuesta;

                    case '/':
                        respuesta = n1 / n2;
                        return respuesta;

                    case '*':
                        respuesta = n1 * n2;
                        return respuesta;

                    case '%':
                        respuesta = n1 % n2;
                        return respuesta;

                    default:
                        break;
                }
            } else {
                System.out.println("La operacion ingresada no es valida");
            }
            return respuesta;
        }
    }

    static Scanner input = new Scanner(System.in);
    private static String operacion;
    private static boolean control=true;
    private static int opcion;

    public static void main(String[] args) {
        
        //Se muestran las opciones disponibles
        while (control == true) {
            System.out.println("Bienvenido a su calculadora\n" +
            "1. Realizar operaciones\n" + "0. Salir\n");

            opcion = input.nextInt();

            //Segun lo elegido se llama una funcion u otra
            switch (opcion) {
                case 1:
                    System.out.println("Por favor ingrese la operacion a realizar, Ej: 10+1");
                    operacion = input.next();
                    System.out.println(tipoM(operacion));
                    break;
                
                case 0:
                    System.out.println("Hasta luego!");
                    control = false;
                    break;

                default:
                    System.out.println("la opcion elegina no existe");
                    break;
            }
        }
    }
}