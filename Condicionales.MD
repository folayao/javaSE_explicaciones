# Sentencias IF

una condición es una forma de tomar deciciones con valores booleanas
~~~
SI (condicion){
    Acción
} SINO {
    Acción
}
~~~
en java: 

~~~
if (condicion){
    instrucciones
} else {
    instrucciones
}
~~~

# Alcance de las variables

La variable se declara antes de usarse, o se declara dentro del scope de las llaves.

~~~
boolean condicion = true; //esta puede alterarse dentro del if y fuera tambien.

if (condicion) {
    int i = 1; //i solo puede alterarse dentro del if
    i++;
}
~~~
# Operadores Logicos y Expresiones booleanas
* Tablas de Verdad
  * && -> and
  * || -> or
  * ! -> not
* Operadores Logicos
  * **>** Mayor que   
  * **>=** Mayor o igual que
  * **<** Menor que
  * **<=** Menor o igual que
  * == Igual que
  * != diferente que


~~~
public class LogicOperators {

    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 5;
        System.out.println("Starting number comparation. . .");
        System.out.println("Determinating the higher number. . .");
        System.out.println("a is the higher number: " + ((a > b && a > c) ? "" + a : false));
        System.out.println("b is the higher number: " + ((b > a && b > c) ? "" + b : false));
        System.out.println("c is the higher number: " + ((c > a && c > b) ? "" + c : false));

    }
}
Los i`
~~~

# Sentencia Switch

Es una forma más condensada para tomar multiples deciciones, esta se usa cuando hay MUCHAS deciciones a tomar y es mejor ahorrar "espacio"

~~~
switch(a){
    case valor1:
        break
    case valor2:
        break
    default:
        break
}
~~~
