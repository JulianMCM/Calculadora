# Calculadora

#### Este programa es una simple calculadora que permite realizar operaciones matemáticas básicas. Está escrito en Java y se ejecuta en la consola.

## Uso
#### Para utilizar la calculadora, simplemente ejecute el programa en su entorno de desarrollo o mediante la línea de comandos. El programa le pedirá que elija entre dos opciones:
- 1 Realizar operaciones
- 2 Salir

#### Si elige la opción 1, se le pedirá que ingrese la operación que desea realizar en el formato "número operador número", por ejemplo: "10 + 5". La calculadora admite las siguientes operaciones: suma (+), resta (-), multiplicación (*), división (/) y módulo (%).

#### La calculadora también permite trabajar con números negativos. En caso de ingresar una operación inválida (por ejemplo, "10 + abc"), la calculadora mostrará un mensaje de error y volverá a solicitar una operación válida.

## Funcionamiento
#### El programa consta de dos funciones principales:
- 1 verificar(String operacion): verifica si la operación ingresada por el usuario es válida (es decir, si está compuesta solo por números y operadores válidos). Devuelve un valor booleano que indica si la operación es válida o no.
- 2 tipoM(String operacion): toma la operación ingresada por el usuario y la descompone en sus componentes (números y operadores). Luego, realiza la operación matemática correspondiente y devuelve el resultado.

#### En el archivo calculadora.java, se definen dos variables globales:
- operacion: almacena la operación ingresada por el usuario
- control: controla la ejecución del programa
