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

## Ejemplo
#### Como seria el uso de numeros negativos en la operacion (-10)-(-30)
![eje](https://user-images.githubusercontent.com/127458055/236353743-e8c7960d-1884-477d-9d96-ec153bef73a0.JPG)

## Uso de la suma +
![Suma](https://user-images.githubusercontent.com/127458055/236354504-c7421923-44cd-4146-9e6b-c685029dc149.JPG)

## Uso de la resta -
![Resta](https://user-images.githubusercontent.com/127458055/236354532-3b7c09f3-86f5-415c-878b-fed9356ebc48.JPG)

## Uso de la division /
![Division](https://user-images.githubusercontent.com/127458055/236354565-839f3daa-5eea-4470-a16a-b1f55ef2461c.JPG)

## Uso de la multiplicacion *
![Multiplicacion](https://user-images.githubusercontent.com/127458055/236354622-b049048d-6d64-4d84-b3eb-d7cd58c29562.JPG)

## Uso del modulo %
![Modulo](https://user-images.githubusercontent.com/127458055/236354692-6f4f1fb6-578e-442c-abe8-bef31ef141ba.JPG)
