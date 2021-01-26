# Caracteristicas de Java
 Java es compilado e interpretado.
 La compilación es la que asegura que el programa este bien, cuando este 
 este compilado el programa va a correr mirando que no tenga errores.
 
# Variables en Java 

La RAM es el espacio en Memoria

~~~
speed = 10 -> [10]RAM
~~~

*Una Variable es un nombre y un valor asignado, que apunta a un espacio en MEMORIA (RAM)*

Un programa por ley debe tener solo un MAIN, que seria el unico punto de entrada.
* Recordar inicializar las variables o luego asignar posteriormente un valor a esta variable.
* Para las variables de texto usamos el TOKEN **+** para unir palabras.

***
# Convencion de nombres en Java

Los nombres deben de tener una estructura definida para, entender el codigo, arreglar errores y mantener "sano" el codigo.

* Sensible a mayusculas y minusculas
* comenzar con **letra**, **$** ó **_** (Nunca con numeros. ~~Consideralo pecado~~)
* Letras **Posteriores**:
  * letras, numeros, $ o _
* Las **constantes** se escriben en MAYUSCULAS y contienen *" _ "*

~~~
CONSTANTES
int NUMERO_MOVIL = 123451;

FORMAS VALIDAS
int numeroMovil = 134565325;
int $numeroMovil = 142534653;
int _numeroMovil = 124352341;

FORMAS INVALIDAS
int numero-movil = 12343; -> ESTO ESTA MUY MAL
int 39numero-movil = 12343; -> ESTO ESTA MUY MAL HORRIBLEEEE!!! :v
~~~

## Camel Case -> Tecnica para nombrar variables, clases etc

Upper Camel Case ->primera letra Mayuscula
* Se usan para las clases.

~~~
public class Variables { -> Upper Camel Case

    public static void main(String[] args) { -> lower Camel case
        //Declarando una variable
        int speed = 0; -> lower Camel case
        System.out.println(speed);

        int salary = 1000;
        String employeeName = "Felipe Olaya"; //Comillas dobles para los Strings
        System.out.println(employeeName + salary);

        // Mutación de las variables ----------------------------------------

        //Acá estamos sumando 200 a 1000 de salary.

        salary += 200;
        System.out.println(salary);
    }
}
~~~

Lower Camel Case ->primera letra minuscula
* Se usan para variables, metodos y funciones.

# Tipos de Datos Numéricos

*Data types*

* byte (-128 a 127 ~ rango)
* short (-32,738 a 32,767 ~ rango)
* int ( 10 digitos ~ rango)
* long (mas de 10 digitos. ~ rango) 
* char (Rango Unicode) - Texto
* boolean (Rango True o False) - Logico
  
**var** desde java 10, identifica el tipo de variable 

~~~
public class DataTypes {
    public static void main(String[] args) {
        
        int entero = 1234567890;
        long largo = 12345678901L; //la L al final nos ayuda a corregir el error que nos dice que el int esta "FUERA" de rango
        float flotante = 1.234F;//Lo mismo la F al final.
        double doble = 123.456;
        var nosequevares = 120; // infiere el tipo de la variable.

    }
    
}
~~~

# Operadores de Asignación

+= suma

-= resta

*= multiplicacion

/= division

%= modulo

## Incremento y Drecremento

++ & --

se suma o se resta de 1 en 1

se puede poner en prefijo(lo obtiene y despues lo incrementa) o postfijo (obtiene el dato incrementado) así: 
++i ó i++

# Operaciones Matematicas

Uso de la libreria Math. Hay un archivo con ejemplos practicos

# Casting de variables

En la programacion hay situaciones donde se necesita cambiar el tipo de dato **Estimacion  o Exactitud**

~~~
double d = 86.45;
int i = (int) d;
-> Este parentesis hace referencia al CAST
~~~

*si yo quiero convertir un dato a otro, si este cabe dentro del otro el cast es automatico y si este no cumple con esta cualidad el cast debe ser manual*

~~~
int a = 30;
int b = 12;

double c = a/b;
-> Se Castea Solo a double

char n = '1';
int nI = n
short nS = (short) n;
System.out.println(nS);
~~~

# Archivos JAR

**J**ava **AR**chive = JAR
* Código Compilado de Java (*.class -> Empaquetados.)



